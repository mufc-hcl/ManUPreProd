package org.bdd.utils.apiResponse;

import static io.restassured.RestAssured.given;
import static org.bdd.utils.PropertyFileManager.props;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.PropertyFileManager;

public class MyUnitedAPIResponse extends BaseApiService {
	private static final Logger log = LogManager.getLogger(MyUnitedAPIResponse.class);
	public JsonPath js;
	
	
	public String getMyunitedTextFromAPI(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String myUnitedTextAPI=js.getString("UnitedBenefitsResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingbenefitsfirsttitle_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return myUnitedTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getMyunitedTextFromAPI()" + e);
			throw e;
		}
	}


	public String getBecomeAMemberApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String myUnitedTextAPI=js.getString("FanStatusSegmentRulesResponse.grouped.segmentgroupname_s.groups[1].doclist.docs[0].primaryupsellctatitle_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return myUnitedTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getBecomeAMemberApi()" + e);
			throw e;
		}
	}


	public String getBuyShirtApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String myUnitedTextAPI=js.getString("FanStatusSegmentRulesResponse.grouped.segmentgroupname_s.groups[0].doclist.docs[0].secondaryupsellctatitle_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return myUnitedTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getBuyShirtApi()" + e);
			throw e;
		}
	}


	public List getStickersFromMyUnitedApi(String endpoint) throws Exception {
		try {
			ArrayList<String> stickersList = new ArrayList<>();
			Set<String> uniqueString = new HashSet<>(stickersList);
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size=js.getList("StickersResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				stickersList.add(js.getString("StickersResponse.response.docs[" + i + "].alttext_s").toLowerCase());
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			uniqueString.addAll(stickersList);
			ArrayList<String> calenderlist1 = new ArrayList<>(uniqueString);
			Collections.sort(calenderlist1);
			return calenderlist1;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getStickersFromMyUnitedApi()" + e);
			throw e;
		}
	}
}


		