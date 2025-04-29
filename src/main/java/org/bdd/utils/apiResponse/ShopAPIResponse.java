package org.bdd.utils.apiResponse;

import static io.restassured.RestAssured.given;

import static org.bdd.utils.PropertyFileManager.props;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.PropertyFileManager;

public class ShopAPIResponse extends BaseApiService {
	private static final Logger log = LogManager.getLogger(ShopAPIResponse.class);
	public JsonPath js;

	public ArrayList<String> getShopTabMenuItemsFromApi(String endpoint) throws IOException {
		try {
			ArrayList<String> shopTabMenuItems = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size=js.getList("ShopAppFiltersResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				shopTabMenuItems
						.add(js.getString("ShopAppFiltersResponse.response.docs[" + i + "].title").toLowerCase());
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return shopTabMenuItems;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getShopTabMenuItemsFromApi()" + e);
			throw e;
		}
	}

	public String getCarosel1ForKitsTextApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String carosel1ForKits=js.getString("ShopAppResponse.response.docs[0].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return carosel1ForKits;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getCarosel1ForKitsTextApi()" + e);
			throw e;
		}
	}

	public String getMembershipBenifitsTextApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String membershipBenifits=js.getString("ShopAppResponse.response.docs[36].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return membershipBenifits;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getMembershipBenifitsTextApi()" + e);
			throw e;
		}
	}

	public String getHelpAndInfoTextApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[35].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getMembershipBenifitsTextApi()" + e);
			throw e;
		}
	}

	public String getCarosel1ForKitsTexFromCollectiblestApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[0].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getCarosel1ForKitsTexFromCollectiblestApi()" + e);
			throw e;
		}
	}

	public String getCollectiblesClaimYoursTextFromCollectiblesApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[13].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getCollectiblesClaimYoursTextFromCollectiblesApi()" + e);
			throw e;
		}
	}

	public String getCollectionsAndRewardsTextFromCollectiblesApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[17].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getCollectionsAndRewardsTextFromCollectiblesApi()" + e);
			throw e;
		}
	}

	public String getCarosel1ForKitsTexFromStoretApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[0].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getCarosel1ForKitsTexFromStoretApi()" + e);
			throw e;
		}
	}

	public String getTrendingTextFromStoreApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[4].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getTrendingTextFromStoreApi()" + e);
			throw e;
		}
	}

	public String getPlayersTextFromCollectiblesApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[30].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getPlayersTextFromCollectiblesApi()" + e);
			throw e;
		}
	}

	public String getTicketsAndHospitalityTextFromStoreApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[14].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getTicketsAndHospitalityTextFromStoreApi()" + e);
			throw e;
		}
	}

	public String getTrainingTextFromCollectiblesApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[13].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getTrainingTextFromCollectiblesApi()" + e);
			throw e;
		}
	}

	public String getCollectionsTextFromStoreApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String helpAndInfo=js.getString("ShopAppResponse.response.docs[17].category_s");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return helpAndInfo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getCollectionsTextFromStoreApi()" + e);
			throw e;
		}
	}

	public boolean getHeroCarouselStatusAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String contentType = js.getString("ShopAppResponse.response.docs[2].enablehero_b");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			if (contentType.equalsIgnoreCase("true"))
				return true;
			else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWhatsNew()" + e);
			throw e;
		}
	}

	public String getTitleOfHeroCarouselMembershipFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String titleOfHeroCarouselMembersip=js.getString("ShopAppResponse.response.docs[2].title_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return titleOfHeroCarouselMembersip;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getTitleOfHeroCarouselMembershipFromApi()" + e);
			throw e;
		}
	}

	public boolean getHeroCarouselStatusStoreAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String contentType = js.getString("ShopAppResponse.response.docs[1].enablehero_b");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			if (contentType.equalsIgnoreCase("true"))
				return true;
			else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getHeroCarouselStatusStoreAPI()" + e);
			throw e;
		}
	}

	public String getTitleOfHeroCarouselStoreFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String titleOfHeroCarouselMembersip=js.getString("ShopAppResponse.response.docs[2].title_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return titleOfHeroCarouselMembersip;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getTitleOfHeroCarouselStoreFromApi()" + e);
			throw e;
		}
	}

	public boolean getHeroCarouselStatusCollectiblesAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String contentType = js.getString("ShopAppResponse.response.docs[1].enablehero_b");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			if (contentType.equalsIgnoreCase("true"))
				return true;
			else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getHeroCarouselStatusCollectiblesAPI()" + e);
			throw e;
		}
	}

	public String getTitleOfHeroCarouselCollectiblesFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String titleOfHeroCarouselMembersip=js.getString("ShopAppResponse.response.docs[1].title_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return titleOfHeroCarouselMembersip;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getTitleOfHeroCarouselCollectiblesFromApi()" + e);
			throw e;
		}
	}
	

	}

	
	

