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
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.PropertyFileManager;

public class OnboardingAPIResponse extends BaseApiService {
	private static final Logger log = LogManager.getLogger(OnboardingAPIResponse.class);
	public JsonPath js;

//	public  String getWelcomeTextApi(String endpoint) throws Exception {
//		try {
//			Response res = getResponse(endpoint);
//			js = new JsonPath(res.asString());
//			String welcomeHeading=js.getString("ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingwelcomescreenheading_t");
//			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
//		return welcomeHeading;
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWelcomeTextApi()" + e);
//			throw e;
//		}
//	}
	public String getWelcomeTextApi(String endpoint) throws Exception {
		String welcomeHeading = null;
		try {
			Response res = getResponse(endpoint);
			JsonPath js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				welcomeHeading = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingwelcomescreenheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return welcomeHeading;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				welcomeHeading = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreenheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return welcomeHeading;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				welcomeHeading = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreenheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return welcomeHeading;
			}

			return welcomeHeading;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getWelcomeTextApi(): " + e.getMessage());
			throw e;
		}
	}
	

	public String getQuoteApi(String endpoint) throws Exception {
		String quote = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				quote = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingwelcomescreentitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return quote;

			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				quote = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreentitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return quote;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				quote = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreentitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return quote;
			}
			return quote;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getQuoteApi(): " + e.getMessage());
			throw e;
		}
	}

	public String getDescApi(String endpoint) throws Exception {
		String description = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				description = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingwelcomescreendesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return description;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				description = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreendesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return description;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				description = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreendesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return description;
			}
			return description;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getDescApi()" + e);
			throw e;
		}
	}

	public String getLetsGoButtonApi(String endpoint) throws Exception {
		String letsGo = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				letsGo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingwelcomescreenbutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return letsGo;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				letsGo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreenbutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return letsGo;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				letsGo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingwelcomescreenbutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return letsGo;
			}
			return letsGo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getLetsGoButtonApi()" + e);
			throw e;
		}
	}

	public String getWelcomeTextFromApiScTwoApi(String endpoint) throws Exception {
		String neverMissAThing = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				neverMissAThing = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingnotificationscreenheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return neverMissAThing;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				neverMissAThing = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreenheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return neverMissAThing;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				neverMissAThing = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreenheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return neverMissAThing;
			}
			return neverMissAThing;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getWelcomeTextFromApiScTwoApi()" + e);
			throw e;
		}

	}

	public String getQuoteFromApiScTwoApi(String endpoint) throws Exception {
		String unitedNotification = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				unitedNotification = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingnotificationscreentitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return unitedNotification;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				unitedNotification = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreentitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return unitedNotification;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				unitedNotification = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreentitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return unitedNotification;
			}
			return unitedNotification;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getQuoteFromApiScTwoApi()" + e);
			throw e;
		}

	}

	public String getDescFromApiScTwoApi(String endpoint) throws Exception {
		String descriptionScTwo = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				descriptionScTwo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingnotificationsscreendesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return descriptionScTwo;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				descriptionScTwo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationsscreendesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return descriptionScTwo;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				descriptionScTwo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationsscreendesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return descriptionScTwo;
			}
			return descriptionScTwo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getDescFromApiScTwoApi()" + e);
			throw e;
		}

	}

	public String getAllowButtonFromApiScTwoApi(String endpoint) throws Exception {
		String allowButtonScTwo = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				allowButtonScTwo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingnotificationscreenprimarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return allowButtonScTwo;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				allowButtonScTwo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreenprimarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return allowButtonScTwo;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				allowButtonScTwo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreenprimarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return allowButtonScTwo;
			}
			return allowButtonScTwo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getAllowButtonFromApiScTwoApi()" + e);
			throw e;
		}

	}

	public String getAskMeLaterButtonFromApiScTwoApi(String endpoint) throws Exception {
		String askMeLaterButtonScTwo = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				askMeLaterButtonScTwo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingnotificationscreensecondarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return askMeLaterButtonScTwo;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				askMeLaterButtonScTwo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreensecondarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return askMeLaterButtonScTwo;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				askMeLaterButtonScTwo = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingnotificationscreensecondarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return askMeLaterButtonScTwo;
			}
			return askMeLaterButtonScTwo;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getAskMeLaterButtonFromApiScTwoApi()" + e);
			throw e;
		}
	}

	public String getWelcomeTextFromAPIScThreeApi(String endpoint) throws Exception {
		String whoIsFavPlayerScThree = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				whoIsFavPlayerScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingfavouriteplayerheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return whoIsFavPlayerScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				whoIsFavPlayerScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayerheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return whoIsFavPlayerScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				whoIsFavPlayerScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayerheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return whoIsFavPlayerScThree;
			}
			return whoIsFavPlayerScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getWelcomeTextFromAPIScThreeApi()" + e);
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
			for (int i = 1; i < size; i++) {
				verifyPlayerCategeory
						.add(js.getString("PageFilterResponse.response.docs[" + i + "].label_t").toUpperCase());
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the player categeory tabs from API" + verifyPlayerCategeory);
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
			String womenScThree = js.getString("PageFilterResponse.response.docs[1].label_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return womenScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getWomenFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public String getSwipeToSelectFromAPIScThreeApi(String endpoint) throws Exception {
		String swipeToSelectScThree = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				swipeToSelectScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingfavouriteplayertitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return swipeToSelectScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				swipeToSelectScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayertitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return swipeToSelectScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				swipeToSelectScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayertitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return swipeToSelectScThree;
			}
			return swipeToSelectScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getSwipeToSelectFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public String getSelectionFromAPIScThreeApi(String endpoint) throws Exception {
		String selectFavPlayerScThree = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				selectFavPlayerScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingfavouriteplayerdesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return selectFavPlayerScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				selectFavPlayerScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayerdesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return selectFavPlayerScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				selectFavPlayerScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayerdesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return selectFavPlayerScThree;
			}
			return selectFavPlayerScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getSelectionFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public String getConfirmButtonFromAPIScThreeApi(String endpoint) throws Exception {
		String confirmButtonScThree = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				confirmButtonScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingfavouriteplayerprimarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return confirmButtonScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				confirmButtonScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayerprimarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return confirmButtonScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				confirmButtonScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayerprimarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return confirmButtonScThree;
			}
			return confirmButtonScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getConfirmButtonFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public String getSkipButtonFromAPIScThreeApi(String endpoint) throws Exception {
		String skipButtonScThree = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				skipButtonScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingfavouriteplayersecondarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return skipButtonScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				skipButtonScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayersecondarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return skipButtonScThree;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				skipButtonScThree = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingfavouriteplayersecondarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return skipButtonScThree;
			}
			return skipButtonScThree;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getSkipButtonFromAPIScThreeApi()" + e);
			throw e;
		}
	}

	public String getWelcomeTextFromAPIScFourApi(String endpoint) throws Exception {
		String signForUnitedScFour = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				signForUnitedScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingsignupscreenheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return signForUnitedScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				signForUnitedScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreenheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return signForUnitedScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				signForUnitedScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreenheading_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return signForUnitedScFour;
			}
			return signForUnitedScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getWelcomeTextFromAPIScFourApi()" + e);
			throw e;
		}
	}

	public ArrayList<String> getButton1FromAPIScFourApi(String endpoint) throws Exception {
		ArrayList<String> signUpThreeTabs = new ArrayList<>();
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				int size = js.getList("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs").size();
				System.out.println("size=" + size);
				for (int i = 0; i < size; i++) {
					signUpThreeTabs
							.add(js.getString("ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[" + i
									+ "].onboardingsignupscreentextbox_t").toUpperCase());
				}
				ExtentsReportManager.extentReportLogging("info", "Getting the signup tabs" + signUpThreeTabs);
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return signUpThreeTabs;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				int size = js.getList("ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs").size();
				System.out.println("size=" + size);
				for (int i = 0; i < size; i++) {
					signUpThreeTabs
							.add(js.getString("ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[" + i
									+ "].onboardingsignupscreentextbox_t").toUpperCase());
				}
				ExtentsReportManager.extentReportLogging("info", "Getting the signup tabs" + signUpThreeTabs);
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return signUpThreeTabs;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				int size = js.getList("ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs").size();
				System.out.println("size=" + size);
				for (int i = 0; i < size; i++) {
					signUpThreeTabs
							.add(js.getString("ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[" + i
									+ "].onboardingsignupscreentextbox_t").toUpperCase());
				}
				ExtentsReportManager.extentReportLogging("info", "Getting the signup tabs" + signUpThreeTabs);
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return signUpThreeTabs;
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getButton1FromAPIScFourApi()" + e);
			throw e;
		}
		return signUpThreeTabs;
	}

	public String getbutton2FromAPIScFourApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String unitedPredictionsdScFour = js.getString(
					"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[1].onboardingsignupscreentextbox_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return unitedPredictionsdScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getbutton2FromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getbutton3FromAPIScFourApi(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String offersAndReviewsScFour = js.getString(
					"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[2].onboardingsignupscreentextbox_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return offersAndReviewsScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getbutton3FromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getgetExclusiveAccessTextApi(String endpoint) throws Exception {
		String getExclusiveAccessScFour = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				getExclusiveAccessScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingsignupscreentitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return getExclusiveAccessScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				getExclusiveAccessScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreentitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return getExclusiveAccessScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				getExclusiveAccessScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreentitle_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return getExclusiveAccessScFour;
			}
			return getExclusiveAccessScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getgetExclusiveAccessTextApi()" + e);
			throw e;
		}
	}

	public String getDescFromAPIScFourApi(String endpoint) throws Exception {
		String descriptionScFour = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				descriptionScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingsignupscreendesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return descriptionScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				descriptionScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreendesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return descriptionScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				descriptionScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreendesc_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return descriptionScFour;
			}
			return descriptionScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getDescFromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getsignForUnitedButtonFromAPIScFourApi(String endpoint) throws Exception {
		String signForUnitedButtonScFour =null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			
			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				signForUnitedButtonScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingsignupscreenprimarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return signForUnitedButtonScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				signForUnitedButtonScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreenprimarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return signForUnitedButtonScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				signForUnitedButtonScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingsignupscreenprimarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return signForUnitedButtonScFour;
			}
			return signForUnitedButtonScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getsignForUnitedButtonFromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getskipButtonFromAPIScFourApi(String endpoint) throws Exception {
		String skipButtonScFour = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			
			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				skipButtonScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingsignupscreensecondarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return skipButtonScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				skipButtonScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreensecondarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return skipButtonScFour;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				skipButtonScFour = js.getString(
						"ApponboardingResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingsignupscreensecondarybutton_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return skipButtonScFour;
			}
			return skipButtonScFour;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getskipButtonFromAPIScFourApi()" + e);
			throw e;
		}
	}

	public String getmyUnitedBenefitsFromAPIScFourApi(String endpoint) throws Exception {
		String myUnitedScFour = null;
		String myBenefitsScFour=null;
		String myUnitedBenifitsScFour =null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			
			if (Common.apiEnv().equalsIgnoreCase("stage")) {
			 myUnitedScFour = js.getString(
					"UnitedBenefitsResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingbenefitsfirsttitle_t");
			 myBenefitsScFour = js.getString(
					"UnitedBenefitsResponse.grouped.contenttype_t.groups[0].doclist.docs[0].onboardingbenefitssecondtitle_t");
			 myUnitedBenifitsScFour = myUnitedScFour + " " + myBenefitsScFour;
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return myUnitedBenifitsScFour;
		} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
			myUnitedScFour = js.getString(
					"UnitedBenefitsResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingbenefitsfirsttitle_t");
			 myBenefitsScFour = js.getString(
					"UnitedBenefitsResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingbenefitssecondtitle_t");
			 myUnitedBenifitsScFour = myUnitedScFour + " " + myBenefitsScFour;
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return myUnitedBenifitsScFour;
		}else if (Common.apiEnv().equalsIgnoreCase("qa")) {
			myUnitedScFour = js.getString(
					"UnitedBenefitsResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingbenefitsfirsttitle_t");
			 myBenefitsScFour = js.getString(
					"UnitedBenefitsResponse.grouped.contenttype_t.groups[1].doclist.docs[0].onboardingbenefitssecondtitle_t");
			 myUnitedBenifitsScFour = myUnitedScFour + " " + myBenefitsScFour;
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return myUnitedBenifitsScFour;
		}}catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getmyUnitedBenefitsFromAPIScFourApi()" + e);
			throw e;
		}
		return myUnitedBenifitsScFour;
	}

	public ArrayList<String> getPlayerNameFromApi(String endpoint) throws IOException {
		ArrayList<String> playerNames = new ArrayList<>();
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int sizeGoalKeeper = js
					.getList("PlayerGridResponse.grouped[\"position_t:goalkeeper\"].doclist.docs.suggestText").size();
			int sizeMidfielder = js
					.getList("PlayerGridResponse.grouped[\"position_t:midfielder\"].doclist.docs.suggestText").size();
			int sizeDefender = js
					.getList("PlayerGridResponse.grouped[\"position_t:defender\"].doclist.docs.suggestText").size();
			int sizeForward = js.getList("PlayerGridResponse.grouped[\"position_t:forward\"].doclist.docs.suggestText")
					.size();
			for (int i = 0; i < sizeGoalKeeper; i++) {
				playerNames.add(js.getString(
						"PlayerGridResponse.grouped[\"position_t:goalkeeper\"].doclist.docs[" + i + "].suggestText")
						.toUpperCase());
			}
			for (int i = 0; i < sizeMidfielder; i++) {
				playerNames.add(js.getString(
						"PlayerGridResponse.grouped[\"position_t:midfielder\"].doclist.docs[" + i + "].suggestText")
						.toUpperCase());
			}
			for (int i = 0; i < sizeDefender; i++) {
				playerNames.add(js.getString(
						"PlayerGridResponse.grouped[\"position_t:defender\"].doclist.docs[" + i + "].suggestText")
						.toUpperCase());
			}
			for (int i = 0; i < sizeForward; i++) {
				playerNames.add(js.getString(
						"PlayerGridResponse.grouped[\"position_t:forward\"].doclist.docs[" + i + "].suggestText")
						.toUpperCase());
			}

			ExtentsReportManager.extentReportLogging("info",
					"Getting the Player Names from the endpoint " + getURIInfo(endpoint));
			return playerNames;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getbutton2FromAPIScFourApi()" + e);
			throw e;
		}
	}
}
