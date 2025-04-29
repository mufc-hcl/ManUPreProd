package org.bdd.utils.apiResponse;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.ExtentsReportManager;

import java.io.IOException;
import java.util.ArrayList;

public class ExploreAPIResponse extends BaseApiService{
    private static final Logger log = LogManager.getLogger(ExploreAPIResponse.class);
    public JsonPath js;

    public ArrayList<String> getCarouselListFromEndPoint(String getCarouselListEndPoint) throws IOException {
        try {
            ArrayList<String> carouselList = new ArrayList<>();
            Response res = getUrlEncodedResponse(getCarouselListEndPoint);
            js = new JsonPath(res.asString());
            int size=js.getList("AppConfigurationResponse.response.docs[0].data_t.exploreV2").size();
            for (int i = 0; i < size-1; i++) {
                carouselList.add(js.getString("AppConfigurationResponse.response.docs[0].data_t.exploreV2[" + i + "].title").trim().toUpperCase());
            }
            ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(getCarouselListEndPoint));
            return carouselList;
        } catch (Exception e) {
            ExtentsReportManager.extentReportLogging("fail",
                    "Exception occurred in function getShopTabMenuItemsFromApi()" + e);
            throw e;
        }
    }
}
