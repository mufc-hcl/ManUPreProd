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

public class OnboardingAPIResponse extends BaseApiService {
	private static final Logger log = LogManager.getLogger(OnboardingAPIResponse.class);
	public JsonPath js;
		

	public  String getWelcomeTextApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String welcomeHeading=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreenheading_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return welcomeHeading;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWelcomeTextApi()" + e);
			throw e;
		}
	}

	public String getQuoteApi(String endpoint) throws Exception {
		
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String quote=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreentitle_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return quote;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getQuoteApi()" + e);
			throw e;
		}
	}


	public String getDescApi(String endpoint) throws Exception {

		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String description=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreendesc_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return description;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getDescApi()" + e);
			throw e;
		}
	}

	public String getLetsGoButtonApi(String endpoint) throws Exception {
		
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String letsGo=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreenbutton_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return letsGo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getLetsGoButtonApi()" + e);
			throw e;
		}
	}

	public String getWelcomeTextFromApiScTwoApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String neverMissAThing=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreenheading_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return neverMissAThing;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWelcomeTextFromApiScTwoApi()" + e);
			throw e;
		}
	
	}

	public String getQuoteFromApiScTwoApi(String endpoint) throws Exception {
		
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String unitedNotification=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreentitle_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return unitedNotification;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getQuoteFromApiScTwoApi()" + e);
			throw e;
		}
	}

	public String getDescFromApiScTwoApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String descriptionScTwo=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationsscreendesc_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return descriptionScTwo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getDescFromApiScTwoApi()" + e);
			throw e;
		}
	}

	public String getAllowButtonFromApiScTwoApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String allowButtonScTwo=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreenprimarybutton_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return allowButtonScTwo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getAllowButtonFromApiScTwoApi()" + e);
			throw e;
		}
	}

	public String getAskMeLaterButtonFromApiScTwoApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String askMeLaterButtonScTwo=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreensecondarybutton_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return askMeLaterButtonScTwo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getAskMeLaterButtonFromApiScTwoApi()" + e);
			throw e;
		}
	}

	public String getWelcomeTextFromAPIScThreeApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String whoIsFavPlayerScThree=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayerheading_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return whoIsFavPlayerScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWelcomeTextFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public ArrayList<String> geMenFromAPIScThreeApi(String endpoint) throws Exception {
		try {
			ArrayList<String> verifyPlayerCategeory = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("PageFilterResponse.response.docs").size();
			System.out.println("size=" + size);
			for (int i = 0; i < size; i++) {
				verifyPlayerCategeory.add(
						js.getString("PageFilterResponse.response.docs[" + i + "].label_t").toUpperCase());
			}
			ExtentsReportManager.extentReportLogging("info", "Getting the player categeory tabs from API" + verifyPlayerCategeory);
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return verifyPlayerCategeory;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function geMenFromAPIScThreeApi()" + e);
			throw e;
		}
	}


	public String getWomenFromAPIScThreeApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String womenScThree=js.getString("PageFilterResponse.response.docs[1].label_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return womenScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWomenFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public String getSwipeToSelectFromAPIScThreeApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String swipeToSelectScThree=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayertitle_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return swipeToSelectScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getSwipeToSelectFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public String getSelectionFromAPIScThreeApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String selectFavPlayerScThree=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayerdesc_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return selectFavPlayerScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getSelectionFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public String getConfirmButtonFromAPIScThreeApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String confirmButtonScThree=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayerprimarybutton_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return confirmButtonScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getConfirmButtonFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public String getSkipButtonFromAPIScThreeApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String skipButtonScThree=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayersecondarybutton_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return skipButtonScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getSkipButtonFromAPIScThreeApi()" + e);
			throw e;
		}
			}

	public String getWelcomeTextFromAPIScFourApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String signForUnitedScFour=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreenheading_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return signForUnitedScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWelcomeTextFromAPIScFourApi()" + e);
			throw e;
		}
			}

	public ArrayList<String> getButton1FromAPIScFourApi(String endpoint) throws Exception {
		try {
			ArrayList<String> signUpThreeTabs = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs").size();
			System.out.println("size=" + size);
			for (int i = 0; i < size; i++) {
				signUpThreeTabs.add(
						js.getString("ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[" + i + "].onboardingsignupscreentextbox_t").toUpperCase());
			}
			ExtentsReportManager.extentReportLogging("info", "Getting the signup tabs" + signUpThreeTabs);
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return signUpThreeTabs;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getButton1FromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getbutton2FromAPIScFourApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String unitedPredictionsdScFour=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[1].onboardingsignupscreentextbox_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return unitedPredictionsdScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getbutton2FromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getbutton3FromAPIScFourApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString()); 
			String offersAndReviewsScFour=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[2].onboardingsignupscreentextbox_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return offersAndReviewsScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getbutton3FromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getgetExclusiveAccessTextApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String getExclusiveAccessScFour=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreentitle_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return getExclusiveAccessScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getgetExclusiveAccessTextApi()" + e);
			throw e;
		}
	}

	public String getDescFromAPIScFourApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String descriptionScFour=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreendesc_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return descriptionScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getDescFromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getsignForUnitedButtonFromAPIScFourApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String signForUnitedButtonScFour=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreenprimarybutton_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return signForUnitedButtonScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getsignForUnitedButtonFromAPIScFourApi()" + e);
			throw e;
		}
			}

	public String getskipButtonFromAPIScFourApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String skipButtonScFour=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreensecondarybutton_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return skipButtonScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getsignForUnitedButtonFromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getmyUnitedBenefitsFromAPIScFourApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String myUnitedScFour=js.getString("UnitedBenefitsResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingbenefitsfirsttitle_t");
			String myBenefitsScFour=js.getString("UnitedBenefitsResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingbenefitssecondtitle_t");
			String myUnitedBenifitsScFour = myUnitedScFour+ " " +myBenefitsScFour;
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return myUnitedBenifitsScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getmyUnitedBenefitsFromAPIScFourApi()" + e);
			throw e;
		}
	}

    public ArrayList<String> getPlayerNameFromApi(String endpoint) throws IOException {
		ArrayList<String>playerNames=new ArrayList<>();
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int sizeGoalKeeper=js.getList("PlayerGridResponse.grouped[\"position_t:goalkeeper\"].doclist.docs.suggestText").size();
			int sizeMidfielder=js.getList("PlayerGridResponse.grouped[\"position_t:midfielder\"].doclist.docs.suggestText").size();
			int sizeDefender=js.getList("PlayerGridResponse.grouped[\"position_t:defender\"].doclist.docs.suggestText").size();
			int sizeForward=js.getList("PlayerGridResponse.grouped[\"position_t:forward\"].doclist.docs.suggestText").size();
			for(int i=0;i<sizeGoalKeeper;i++){
				playerNames.add(js.getString("PlayerGridResponse.grouped[\"position_t:goalkeeper\"].doclist.docs["+i+"].suggestText").toUpperCase());
			}
			for(int i=0;i<sizeMidfielder;i++){
				playerNames.add(js.getString("PlayerGridResponse.grouped[\"position_t:midfielder\"].doclist.docs["+i+"].suggestText").toUpperCase());
			}
			for(int i=0;i<sizeDefender;i++){
				playerNames.add(js.getString("PlayerGridResponse.grouped[\"position_t:defender\"].doclist.docs["+i+"].suggestText").toUpperCase());
			}
			for(int i=0;i<sizeForward;i++){
				playerNames.add(js.getString("PlayerGridResponse.grouped[\"position_t:forward\"].doclist.docs["+i+"].suggestText").toUpperCase());
			}

			ExtentsReportManager.extentReportLogging("info", "Getting the Player Names from the endpoint " + getURIInfo(endpoint));
			return playerNames;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getbutton2FromAPIScFourApi()" + e);
			throw e;
		}
    }
}

	

	

	
