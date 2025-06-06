package org.bdd.utils.apiResponse;

import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.Common;
import org.bdd.utils.ExtentsReportManager;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class UnitedNowAPIResponse extends BaseApiService {
	private static final Logger log = LogManager.getLogger(UnitedNowAPIResponse.class);
	public JsonPath js;

	public String getWhatsNewOrLiveBlogTextFromEndPoint(String endpoint, String text) throws IOException {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			if (text.equalsIgnoreCase("WHAT’S NEW")) {
				String whatNew = js.getString("UnitednowconfigurationsResponse.response.docs[0].titlenonmatchday_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return whatNew.trim();
			} else {
				String liveBlog = js.getString("UnitednowconfigurationsResponse.response.docs[0].titlematchday_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return liveBlog.trim();
			}
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWhatsNew()" + e);
			throw e;
		}

	}

	public String getWhatsNew(String endpoint) throws IOException {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String whatNew = js.getString("UnitednowconfigurationsResponse.response.docs[0].titlenonmatchday_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return whatNew.trim();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWhatsNew()" + e);
			throw e;
		}
	}

	public String getLiveBlog(String endpoint) throws IOException {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String liveBlog = js.getString("UnitednowconfigurationsResponse.response.docs[0].titlematchday_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return liveBlog.trim();
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWhatsNew()" + e);
			throw e;
		}
	}

	public ArrayList<String> getDropDownValuesFromApi(String endpoint) throws IOException {
		try {
			ArrayList<String> dropDownValues = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			for (int i = 0; i < 5; i++) {
				dropDownValues.add(js.getString("TeamListResponse.response.docs[" + i + "].label_t"));
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return dropDownValues;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getDropDownValuesFromApi()" + e);
			throw e;
		}
	}

	public boolean getContentTypeFromSpotLightApi(String endpoint) throws IOException {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String contentType = js.getString("SpotlightResponse.response.docs[0].contenttype_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			if (contentType.equalsIgnoreCase("live"))
				return true;
			else
				return false;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWhatsNew()" + e);
			throw e;
		}
	}

	public String getContenttypeMatchResultsApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String matchReviewText = js.getString("ResultListResponse.response.docs[0].matchdayresultctatitle_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return matchReviewText;

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getContenttypeMatchResultsApi()" + e);
			throw e;
		}
	}

//	public ArrayList<String> getAllLeagueFiltersFromApi(String endpoint) throws Exception {
//		try {
//			ArrayList<String> All202425LeagueFilters = new ArrayList<>();
//			Response res = getUrlEncodedResponse(endpoint);
//			js = new JsonPath(res.asString());
//			for (int i = 0; i < 6; i++) {
//				All202425LeagueFilters.add(js.getString("PageFilterResponse.grouped._parent.groups[14].doclist.docs[" + i + "].label_t"));
//			}
//			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
//			return All202425LeagueFilters;
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail",
//					"Exception occurred in function getAll202425LeagueFiltersFromApi()" + e);
//		}
//	}
	public ArrayList<String> getAllLeaguesFromApi(String endpoint) throws Exception {
		try {
			ArrayList<String> allLeagueFilters = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("PageFilterResponse.grouped._parent.groups[11].doclist.docs").size();
			System.out.println("size=" + size);
			for (int i = 0; i < size; i++) {
				allLeagueFilters.add(
						js.getString("PageFilterResponse.grouped._parent.groups[11].doclist.docs[" + i + "].label_t"));
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return allLeagueFilters;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getDropDownValuesFromApi()" + e);
			throw e;
		}
	}

	public boolean getComingUpCarousalFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			// Assuming the API returns a boolean field indicating carousel presence
			boolean comingUpCarousal = js
					.getBoolean("UnitednowconfigurationsResponse.response.docs[0].comingupenableunitednow_b");

			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return comingUpCarousal;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception in isCarouselDisplayedFromApi(): " + e.getMessage());
			throw e;
		}

//		try {x.ComingUpCarouselResponse.response.docs[0].contenttype_t
//			Response res = getResponse(endpoint);
//			js = new JsonPath(res.asString());
//			String comingUpCarousal=js.getString("ComingUpCarouselResponse.response.docs[0].contenttype_t_en");
//			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
////			System.out.println("comingUpCarousal------"+ comingUpCarousal);
//			return comingUpCarousal;
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getComingUpCarousalFromApi()" + e);
//			throw e;
//		}

	}

	public ArrayList<String> getPlayersPageFilterFromApi(String endpoint) throws Exception {
		try {
			ArrayList<String> playerPageFilters = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("PageFilterResponse.response.docs").size();
			System.out.println("size=" + size);
			for (int i = 0; i < size; i++) {
				if (js.getString("PageFilterResponse.response.docs[" + i + "].label_t") != null) {
					playerPageFilters
							.add(js.getString("PageFilterResponse.response.docs[" + i + "].label_t").toUpperCase());
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return playerPageFilters;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getPlayersPageFilterFromApi()" + e);
			throw e;
		}
	}

	public String getSelectAllIconTextFromAPI(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String selectAllIconTextAPI = js.getString("UnitednowconfigurationsResponse.response.docs[0].selectall_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return selectAllIconTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getSelectAllIconTextFromAPI()" + e);
			throw e;
		}

	}

	public String getClearAllIconTextFromAPI(String endpoint) throws Exception {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			String clearAllIconTextAPI = js.getString("UnitednowconfigurationsResponse.response.docs[0].clearall_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return clearAllIconTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getClearAllIconTextFromAPI()" + e);
			throw e;
		}
	}

	public ArrayList<String> getFilterFeedsFromApi(String endpoint) throws Exception {
		try {
			ArrayList<String> FilterFeeds = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("UnitedNowPageFiltersResponse.response.docs").size();
			System.out.println("size=" + size);
			for (int i = 0; i < size; i++) {
				FilterFeeds.add(js.getString("UnitedNowPageFiltersResponse.response.docs[" + i + "].itemnamecustom_s")
						.toUpperCase());
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return FilterFeeds;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getFilterFeedsFromApi()" + e);
			throw e;
		}
	}

	public ArrayList<String> getFilterFeedsIOSFromApi(String endpoint) throws Exception {
		try {
			ArrayList<String> FilterFeeds = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("UnitedNowPageFiltersResponse.response.docs").size();
			System.out.println("size=" + size);
			for (int i = 0; i < size; i++) {
				FilterFeeds.add(
						js.getString("UnitedNowPageFiltersResponse.response.docs[" + i + "].title_t").toUpperCase());
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return FilterFeeds;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getFilterFeedsFromApi()" + e);
			throw e;
		}
	}

	public String getDateTBCTextFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String dateTBCTextAPI = js.getString("ResultListResponse.response.docs[0].matchdatetbc_t_en");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return dateTBCTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getDateTBCTextFromAPI()" + e);
			throw e;
		}
	}

	public String getTicketInfoTextFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String ticketInfoTextAPI = js.getString("ResultListResponse.response.docs[0].ticketctatitle_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return ticketInfoTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getTicketSTGTextFromApi()" + e);
			throw e;
		}
	}

	public ArrayList<String> getPremierLeagueFromApi(String endpoint, String premierLeagueFromAPI) throws Exception {
		try {
			ArrayList<String> expPremierLeague = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
//				String premierLeagueFromAPI = "Premier League";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String premierLeagueTextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (premierLeagueTextAPI.equalsIgnoreCase(premierLeagueFromAPI)) {
						expPremierLeague.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expPremierLeague;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getPremierLeagueFromApi()" + e);
			throw e;
		}
	}

	public ArrayList<String> getEuropaLeagueFromAPI(String endpoint, String europaLeagueText) throws Exception {
		try {
			ArrayList<String> expEuropaLeague = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
//				String europaLeagueText = "Europa League";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String europaLeagueTextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (europaLeagueTextAPI.equalsIgnoreCase(europaLeagueText)) {
						expEuropaLeague.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expEuropaLeague;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEuropaLeagueFromAPI1()" + e);
			throw e;
		}
	}

	public ArrayList<String> getWomensSuperLeagueFromApi(String endpoint, String womensSuperLeagueText)
			throws Exception {
		try {
			ArrayList<String> expwomensSuperLeague = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
//				String womensSuperLeagueText = "Women's Super League";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String womensSuperLeagueTextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (womensSuperLeagueTextAPI.equalsIgnoreCase(womensSuperLeagueText)) {
						expwomensSuperLeague.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expwomensSuperLeague;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getWomensSuperLeagueFromApi()" + e);
			throw e;
		}
	}

	public ArrayList<String> getContenentalLeagueCupFromAPI(String endpoint, String contenentalLeagueCupText)
			throws Exception {
		try {
			ArrayList<String> expContenentalLeagueCup = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
//				String contenentalLeagueCupText = "Continental League Cup";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String contenentalLeagueCupTextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (contenentalLeagueCupTextAPI.equalsIgnoreCase(contenentalLeagueCupText)) {
						expContenentalLeagueCup.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expContenentalLeagueCup;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getContenentalLeagueCupFromAPI()" + e);
			throw e;
		}
	}

	public ArrayList<String> getPremierLeague2FromAPI(String endpoint, String premierLeague2Text) throws Exception {
		try {
			ArrayList<String> expPremierLeague2 = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
//				String premierLeague2Text = "Premier League 2";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String premierLeague2TextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (premierLeague2TextAPI.equalsIgnoreCase(premierLeague2Text)) {
						expPremierLeague2.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expPremierLeague2;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getPremierLeague2FromAPI()" + e);
			throw e;
		}
	}

	public ArrayList<String> getEFLTrophyFromAPI(String endpoint, String eFLTrophyText) throws Exception {
		try {
			ArrayList<String> expEFLTrophy = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
//				String eFLTrophyText = "EFL Trophy";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String eFLTrophyTextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (eFLTrophyTextAPI.equalsIgnoreCase(eFLTrophyText)) {
						expEFLTrophy.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expEFLTrophy;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEFLTrophyFromAPI()" + e);
			throw e;
		}
	}

	public ArrayList<String> getU18PremierLeagueFromAPI(String endpoint, String u18PremierLeagueText) throws Exception {
		try {
			ArrayList<String> expU18PremierLeague = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
//				String u18PremierLeagueText = "U18 Premier League";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String u18PremierLeagueTextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (u18PremierLeagueTextAPI.equalsIgnoreCase(u18PremierLeagueText)) {
						expU18PremierLeague.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expU18PremierLeague;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getU18PremierLeagueFromAPI()" + e);
			throw e;
		}
	}

	public ArrayList<String> getUEFAYouthLeagueFromAPI(String endpoint, String uEFAYouthLeagueText) throws Exception {
		try {
			ArrayList<String> expUEFAYouthLeague = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
//				String uEFAYouthLeagueText = "UEFA Youth League";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String uEFAYouthLeagueTextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (uEFAYouthLeagueTextAPI.equalsIgnoreCase(uEFAYouthLeagueText)) {
						expUEFAYouthLeague.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expUEFAYouthLeague;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getUEFAYouthLeagueFromAPI()" + e);
			throw e;
		}
	}

	public ArrayList<String> getEnglishPGAU16WomensCupFromAPI(String endpoint) throws Exception {
		try {
			ArrayList<String> expEnglishPGAU16WomensCup = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String englishPGAU16WomensCupText = "English PGA U16 Womens Cup";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String englishPGAU16WomensCupTextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (englishPGAU16WomensCupTextAPI.equalsIgnoreCase(englishPGAU16WomensCupText)) {
						expEnglishPGAU16WomensCup.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expEnglishPGAU16WomensCup;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEnglishPGAU16WomensCupFromAPI()" + e);
			throw e;
		}
	}

	public ArrayList<String> getEnglishWomensSuperLeagueFromAPI(String endpoint) throws Exception {
		try {
			ArrayList<String> expEnglishWomensSuperLeague = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String englishWomensSuperLeagueText = "English Womens Super League";
			int parent = js.getList("PageFilterResponse.grouped._parent.groups").size();
			for (int i = 0; i < parent; i++) {
				int child = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();
				for (int j = 0; j < child; j++) {
					String englishWomensSuperLeagueTextAPI = js.getString(
							"PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs[" + j + "].label_t");
					if (englishWomensSuperLeagueTextAPI.equalsIgnoreCase(englishWomensSuperLeagueText)) {
						expEnglishWomensSuperLeague.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
					}
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expEnglishWomensSuperLeague;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEnglishWomensSuperLeagueFromAPI()" + e);
			throw e;
		}
	}

	public String getMatchDayLiveFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String uefaYouthLeagueTextAPI = js.getString("ResultListResponse.response.docs[0].matchdaylivectatitle_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return uefaYouthLeagueTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEFLTrophyFromAPI()" + e);
			throw e;
		}
	}

	public String getprofilesTabFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String profileTabTextAPI = js.getString("PlayerProfileResponse.response.docs[0].category_s");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return profileTabTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getprofilesTabFromAPI()" + e);
			throw e;
		}
	}

	public String getStatsTabFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String statsTabTextAPI = js.getString("PlayerStatsGroupList[0].stats");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return statsTabTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getStatsTabFromAPI()" + e);
			throw e;
		}
	}

	public String getGreetingsMessageFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String greetingsMessage = js
					.getString("UnitednowconfigurationsResponse.response.docs[0].unstoriescustomizedmessage_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return greetingsMessage;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getGreetingsMessageFromApi()" + e);
			throw e;
		}
	}

	public ArrayList<String> getArticleCard(String endpoint) throws Exception {
		try {
			ArrayList<String> expArticleCard = new ArrayList<>();
			String contentTypeArticleCard = "article";

			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ListingResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
						.equalsIgnoreCase(contentTypeArticleCard)) {
					expArticleCard.add(js.getString("ListingResponse.response.docs[" + i + "].shortheadline_t"));

				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expArticleCard;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getArticleCard()" + e);
			throw e;
		}
	}

	public ArrayList<String> getVideoCard(String endpoint) throws Exception {
		try {
	        ArrayList<String> expVideoCard = new ArrayList<>();
	        String contentTypeVideoCard = "video";

	        Response res = getResponse(endpoint);
	        js = new JsonPath(res.asString());

	        int size = js.getList("ListingResponse.response.docs").size();
	        String env = Common.apiEnv().toLowerCase();

	        for (int i = 0; i < size; i++) {
	            if (env.equals("stage")) {
	                if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
	                        .equalsIgnoreCase(contentTypeVideoCard)) {
	                    expVideoCard.add(js.getString("ListingResponse.response.docs[" + i + "].shortheadline_t"));
	                }
	            } else if (env.equals("prod")) {
	                if (js.getString("ListingResponse.response.docs[" + i + "].category_s")
	                        .equalsIgnoreCase(contentTypeVideoCard)) {
	                    expVideoCard.add(js.getString("ListingResponse.response.docs[" + i + "].teaser_t"));
	                }
	            }
	        }

	        ExtentsReportManager.extentReportLogging("info",
	                "Getting the response from the endpoint: " + getURIInfo(endpoint));
	        return expVideoCard;

	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail",
	                "Exception occurred in function getVideoCard()<br/>" + e);
	        throw e;
	    }
	}

	public ArrayList<String> getGalleryCard(String endpoint) throws Exception {
		try {
			ArrayList<String> expGalleryCard = new ArrayList<>();
			String contentTypeGalleryCard = "gallery";
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ListingResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
						.equalsIgnoreCase(contentTypeGalleryCard)) {
					expGalleryCard.add(js.getString("ListingResponse.response.docs[" + i + "].shortheadline_t"));
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expGalleryCard;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getGalleryCard()" + e);
			throw e;
		}
	}

	public ArrayList<String> getQuoteCard(String endpoint) throws Exception {
		try {
			ArrayList<String> expQuoteCard = new ArrayList<>();
			String contentTypeQuoteCard = "quote";
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ListingResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
						.equalsIgnoreCase(contentTypeQuoteCard)) {
					expQuoteCard.add(js.getString("ListingResponse.response.docs[" + i + "].shortheadline_t"));

				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expQuoteCard;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getQuoteCard()" + e);
			throw e;
		}
	}

	public boolean getStoriesCarouselFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			// Assuming the API returns a boolean field indicating carousel presence
			boolean storiesCarousel = js
					.getBoolean("UnitednowconfigurationsResponse.response.docs[0].hideunstoriescarousal_b");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return storiesCarousel;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception in getStoriesCarouselFromApi(): " + e.getMessage());
			throw e;
		}
	}

	public String getUpsellTitleFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String upsellTitleFromAPI = js.getString("UpsellResponse.response.docs[0].title_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return upsellTitleFromAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getUpsellTitleFromApi()" + e);
			throw e;
		}
	}

	public String getWatchNowBtnTextFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String upsellTitleFromAPI = js.getString("UpsellResponse.response.docs[0].ctatitle_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return upsellTitleFromAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getWatchNowBtnTextFromAPI()" + e);
			throw e;
		}

	}

	public boolean getLiveVideoFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			if (js.getList("EpgLiveStreamResponse.response.docs").size() > 0) {
				// Assuming the API returns a boolean field indicating carousel presence
				boolean liveVideo = js.getBoolean("EpgLiveStreamResponse.response.docs[1].enablevideounitednow_b");
			} else
				return false;
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception in getLiveVideoFromApi(): " + e.getMessage());
			throw e;
		}
		return false;
	}

	public String getLiveVideoTextFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String LiveVideoText = js.getString("EpgLiveStreamResponse.response.docs[1].schedulemetadata_t.Title");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return LiveVideoText;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getLiveVideoTextFromApi()" + e);
		}
		return endpoint;
	}

	public ArrayList<String> getQuizCard(String endpoint) throws Exception {
		try {
			ArrayList<String> expQuizCard = new ArrayList<>();
			String contentTypeQuizCard = "quiz";

			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ListingResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
						.equalsIgnoreCase(contentTypeQuizCard)) {
					expQuizCard.add(js.getString("ListingResponse.response.docs[" + i + "].title"));

				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expQuizCard;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getQuizCard()" + e);
			throw e;
		}
	}

	public ArrayList<String> getPollCard(String endpoint) throws Exception {
		try {
			ArrayList<String> expPollCard = new ArrayList<>();
			String headline_tPollCard = "poll";

			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ListingResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
						.equalsIgnoreCase(headline_tPollCard)) {
					expPollCard.add(js.getString("ListingResponse.response.docs[" + i + "].teaser_t"));
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expPollCard;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getPollCard()" + e);
			throw e;
		}
	}

	public ArrayList<String> getCompetitionCard(String endpoint) throws Exception {
		try {
			ArrayList<String> expCompetitionCard = new ArrayList<>();
			String CategoryTypeCompetitionCard = "Competition";

			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ListingResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
						.equalsIgnoreCase(CategoryTypeCompetitionCard)) {
					expCompetitionCard.add(js.getString("ListingResponse.response.docs[" + i + "].shortheadline_t"));

				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expCompetitionCard;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getCompetitionCard()" + e);
			throw e;
		}
	}

	public ArrayList<String> getAdcardCard(String endpoint) throws Exception {
		try {
			ArrayList<String> expAdcardCard = new ArrayList<>();
			String contentTypeAdcardCard = "adcard";

			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ListingResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
						.equalsIgnoreCase(contentTypeAdcardCard)) {
					expAdcardCard.add(js.getString("ListingResponse.response.docs[" + i + "].shortheadline_t"));

				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expAdcardCard;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getAdcardCard()" + e);
			throw e;
		}
	}

	public ArrayList<String> getImageCard(String endpoint) throws Exception {
		try {
			ArrayList<String> expImageCard = new ArrayList<>();
			String contentTypeImageCard = "image";

			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ListingResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
						.equalsIgnoreCase(contentTypeImageCard)) {
					expImageCard.add(js.getString("ListingResponse.response.docs[" + i + "].shortheadline_t"));

				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expImageCard;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getImageCard()" + e);
			throw e;
		}
	}

	public String getStoriesCarouseMatchResultsApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String storiesCarouseMatchResult = js.getString("SpotlightResponse.response.docs[0].ctatitle_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return storiesCarouseMatchResult;

		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getStoriesCarouseMatchResultsApi()" + e);
			throw e;
		}
	}

	public ArrayList<String> allDropDownListBodyContent(String endpoint) throws Exception {
		ArrayList<String> allContent = new ArrayList<>();
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("FixtureListResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				allContent.add(js.getString("FixtureListResponse.response.docs["+i+"].competitionname_t"));
				}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return allContent;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception in getAll(): " + e.getMessage());
			throw e;
		}
	}
		
	
	
	//Under All 2024/25
	public String getEnglishFaCups(String endpoint) throws Exception {
		String getEnglishFaCup = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				getEnglishFaCup = js.getString("FixtureListResponse.response.docs[0].competitionname_t");
				
				ExtentsReportManager.extentReportLogging("info","Getting the response from the endpoint " + getURIInfo(endpoint));
				return getEnglishFaCup;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				getEnglishFaCup = js.getString("FixtureListResponse.response.docs[6].competitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return getEnglishFaCup;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				getEnglishFaCup = js.getString("FixtureListResponse.response.docs[0].competitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return getEnglishFaCup;
			}
			return getEnglishFaCup;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEnglishFaCups()" + e);
			throw e;
		}
	}
	
	
	
	
	public ArrayList<String> getEnglishFaCup(String endpoint) throws Exception {
		try {
			ArrayList<String> englishFaCup = new ArrayList<>();
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("FixtureListResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				englishFaCup.add(js.getString("FixtureListResponse.response.docs[" + i + "].competitionname_t"));

				}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return englishFaCup;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getImageCard()" + e);
			throw e;
		}
	}
	
	

//	public String getEnglishPremierLeague1(String endpoint) throws Exception {
//		try {
//			Response res = getUrlEncodedResponse(endpoint);
//			js = new JsonPath(res.asString());
//			String getAll = js.getString("FixtureListResponse.response.docs[0].competitionname_t");
//
//			ExtentsReportManager.extentReportLogging("info",
//					"Getting the response from the endpoint " + getURIInfo(endpoint));
//			return getAll;
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail",
//					"Exception in getEnglishPremierLeague(): " + e.getMessage());
//			throw e;
//		}
//	}
	
	// Under PremierLeague
	public String getEnglishPremierLeague(String endpoint) throws Exception {
		String  getEnglishPremierLeagueText = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				getEnglishPremierLeagueText = js.getString("FixtureListResponse.response.docs[0].competitionname_t");
				
				ExtentsReportManager.extentReportLogging("info","Getting the response from the endpoint " + getURIInfo(endpoint));
				return getEnglishPremierLeagueText;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				getEnglishPremierLeagueText = js.getString("FixtureListResponse.response.docs[9].competitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return getEnglishPremierLeagueText;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				getEnglishPremierLeagueText = js.getString("FixtureListResponse.response.docs[0].competitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return getEnglishPremierLeagueText;
			}
			return getEnglishPremierLeagueText;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEnglishPremierLeague()" + e);
			throw e;
		}
	}
	

//	public String getFACup1(String endpoint) throws Exception {
//		try {
//			Response res = getUrlEncodedResponse(endpoint);
//			js = new JsonPath(res.asString());
//			String getAll = js.getString("LatestResultsResponse.response.docs[0].aliascompetitionname_t");
//
//			ExtentsReportManager.extentReportLogging("info",
//					"Getting the response from the endpoint " + getURIInfo(endpoint));
//			return getAll;
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail", "Exception in getFACup(): " + e.getMessage());
//			throw e;
//		}
//	}
	
	//Under FA Cup
	public String getFACup(String endpoint) throws Exception {
		String  getFACupText = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				getFACupText = js.getString("LatestResultsResponse.response.docs[0].aliascompetitionname_t");
				
				ExtentsReportManager.extentReportLogging("info","Getting the response from the endpoint " + getURIInfo(endpoint));
				return getFACupText;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				getFACupText = js.getString("LatestResultsResponse.response.docs[0].aliascompetitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return getFACupText;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				getFACupText = js.getString("LatestResultsResponse.response.docs[0].aliascompetitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return getFACupText;
			}
			return getFACupText;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getFACup()" + e);
			throw e;
		}
	}

//	public String getUEFAEuropaLeague1(String endpoint) throws Exception {
//		try {
//			Response res = getUrlEncodedResponse(endpoint);
//			js = new JsonPath(res.asString());
//			String getAll = js.getString("FixtureListResponse.response.docs[0].competitionname_t");
//
//			ExtentsReportManager.extentReportLogging("info",
//					"Getting the response from the endpoint " + getURIInfo(endpoint));
//			return getAll;
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail", "Exception in getUEFAEuropaLeague(): " + e.getMessage());
//			throw e;
//		}
//	}
	
	// Under EuropaLeague
	public String getUEFAEuropaLeague(String endpoint) throws Exception {
		String  getUEFAEuropaLeagueText = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				getUEFAEuropaLeagueText = js.getString("FixtureListResponse.response.docs[0].competitionname_t");
				
				ExtentsReportManager.extentReportLogging("info","Getting the response from the endpoint " + getURIInfo(endpoint));
				return getUEFAEuropaLeagueText;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				getUEFAEuropaLeagueText = js.getString("FixtureListResponse.response.docs[0].competitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return getUEFAEuropaLeagueText;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				getUEFAEuropaLeagueText = js.getString("FixtureListResponse.response.docs[0].competitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return getUEFAEuropaLeagueText;
			}
			return getUEFAEuropaLeagueText;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getUEFAEuropaLeague()" + e);
			throw e;
		}
	}

//	public String getFriendly1(String endpoint) throws Exception {
//		try {
//			Response res = getUrlEncodedResponse(endpoint);
//			js = new JsonPath(res.asString());
//			String getAll = js.getString("FixtureListResponse.response.docs[6].competitionname_t");
//
//			ExtentsReportManager.extentReportLogging("info",
//					"Getting the response from the endpoint " + getURIInfo(endpoint));
//			return getAll;
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail", "Exception in getUEFAEuropaLeague(): " + e.getMessage());
//			throw e;
//		}
//	}
	
	//Under Friendly
	public String getFriendly(String endpoint) throws Exception {
		String  getFriendlyText = null;
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());

			if (Common.apiEnv().equalsIgnoreCase("stage")) {
				getFriendlyText = js.getString("FixtureListResponse.response.docs[6].competitionname_t");
				
				ExtentsReportManager.extentReportLogging("info","Getting the response from the endpoint " + getURIInfo(endpoint));
				return getFriendlyText;
			} else if (Common.apiEnv().equalsIgnoreCase("prod")) {
				getFriendlyText = js.getString("FixtureListResponse.response.docs[10].competitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from the endpoint " + getURIInfo(endpoint));
				return getFriendlyText;
			} else if (Common.apiEnv().equalsIgnoreCase("qa")) {
				getFriendlyText = js.getString("FixtureListResponse.response.docs[6].competitionname_t");
				ExtentsReportManager.extentReportLogging("info",
						"Getting the response from api endpoint: " + getURIInfo(endpoint));
				return getFriendlyText;
			}
			return getFriendlyText;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getFriendly()" + e);
			throw e;
		}
	}
	

	public String getDateTBC(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String getDateTBC = js.getString("LatestResultsResponse.response.docs[0].matchdatetbc_t");

			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return getDateTBC;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception in getDateTBC(): " + e.getMessage());
			throw e;
		}
	}

	public String getTicketInfo(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			ArrayList<String> getTicketInfo = new ArrayList<>();
			js = new JsonPath(res.asString());
			int size = js.getList("ResultListResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ResultListResponse.response.docs[" + i + "].ticketctatitle_t") != null) {
					getTicketInfo.add(js.getString("ResultListResponse.response.docs[" + i + "].ticketctatitle_t"));
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getTicketInfo.get(0) + "" + getURIInfo(endpoint));
			return getTicketInfo.get(0);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception in getTicketInfo(): " + e.getMessage());
			throw e;
		}
	}

	public String getMatchReview(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			ArrayList<String> getMatchReview = new ArrayList<>();
			js = new JsonPath(res.asString());
			int size = js.getList("LatestResultsResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("LatestResultsResponse.response.docs[" + i + "].matchdayresultctatitle_t") != null) {
					getMatchReview
							.add(js.getString("ResultListResponse.response.docs[" + i + "].matchdayresultctatitle_t"));
				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return getMatchReview.get(0);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception in getMatchReview(): " + e.getMessage());
			throw e;
		}
	}

	public String getMatchDayLive(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			ArrayList<String> getMatchReview = new ArrayList<>();
			js = new JsonPath(res.asString());
			int size = js.getList("ResultListResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ResultListResponse.response.docs[" + i + "].matchdayresultctatitle_t") != null) {
					getMatchReview
							.add(js.getString("ResultListResponse.response.docs[" + i + "].matchdayresultctatitle_t"));
				}
			}

			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return getMatchReview.get(0);
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception in getMatchDayLive(): " + e.getMessage());
			throw e;
		}
	}

	public ArrayList<String> getAllLeaguesFromApinew(String endpoint) throws Exception {
		try {
			boolean flag = true;
			ArrayList<String> allLeagueFilters = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
//			int currentYear = Year.now().getValue()-1;
//			int nextYear = Year.now().getValue() % 100;
//	        String sid="sid:"+currentYear;
//	        String expAll="All "+currentYear+"/"+nextYear;
			String getCurrentSeason = getcurrentSeason("currentSeason");
			js = new JsonPath(res.asString());
			int parentSize = js.getList("PageFilterResponse.grouped._parent.groups").size();
//			int sample = 0;
			for (int i = 0; i < parentSize; i++) {
				int childSize = js.getList("PageFilterResponse.grouped._parent.groups[" + i + "].doclist.docs").size();

				for (int j = 0; j < childSize; j++) {
					String actCurrentSeason = js.getString("PageFilterResponse.grouped._parent.groups[" + i
							+ "].doclist.docs[" + j + "].matchfilter_s");
					String leagueTable = js.getString("PageFilterResponse.grouped._parent.groups[" + i
							+ "].doclist.docs[" + j + "].matchfilter_s");
					if (actCurrentSeason.contains(getCurrentSeason)) {
						allLeagueFilters.add(js.getString("PageFilterResponse.grouped._parent.groups[" + i
								+ "].doclist.docs[" + j + "].label_t"));
//						sample=i;
//						break;
					}
				}
			}
//			int child1 = js.getList("PageFilterResponse.grouped._parent.groups["+sample+"].doclist.docs.label_t").size();
//			for(int j=0;j<child1;j++)
//			{
//				allLeagueFilters.add(js.getString("PageFilterResponse.grouped._parent.groups["+sample+"].doclist.docs["+j+"].label_t"));
//			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			allLeagueFilters.removeIf(item -> item.equalsIgnoreCase("2024-25") || item.equalsIgnoreCase("2025-26")|| item.equalsIgnoreCase("League Table") || item.equalsIgnoreCase("FA Community Shield")|| item.equalsIgnoreCase("Europa League"));
			Collections.sort(allLeagueFilters);
			return allLeagueFilters;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getDropDownValuesFromApi()" + e);
			throw e;
		}
	}

	public String getcurrentSeason(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String gecurrentSeason = js.getString("AppConfigurationResponse.response.docs[0].data_t.currentSeason");

			ExtentsReportManager.extentReportLogging("info",
					"Getting current Season response from the endpoint" + getURIInfo(endpoint));
			return gecurrentSeason;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception in getcurrentSeason(): " + e.getMessage());
			throw e;
		}
	}

	public String getDummyTestSiteCore(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String geDummyTestSiteCore = js.getString("FixtureListResponse.response.docs[0].competitionname_t");

			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			geDummyTestSiteCore = geDummyTestSiteCore.replaceAll("[0-9]", "");
			return geDummyTestSiteCore;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception in getDummyTestSiteCore(): " + e.getMessage());
			throw e;
		}
	}

	public ArrayList<String> getAllSponsorLogoFromAPI(String endpoint) throws Exception {
		ArrayList<String> allSponsorLogos = new ArrayList<>();
		try {
			Response res = getUrlEncodedResponse(endpoint);
			String[] expAllSponsorLogos = { "DXC", "Adidas", "MUTV", "Cadbury" };
			JsonPath js = new JsonPath(res.asString());

			List<Object> groups = js.getList("ModuleSponsorResponse.grouped.modulemappingtype_t.groups");
//	        ExtentsReportManager.extentReportLogging( "info","Group count = " + groups.size());

			for (int i = 0; i < groups.size(); i++) {
				List<Object> docs = js
						.getList("ModuleSponsorResponse.grouped.modulemappingtype_t.groups[" + i + "].doclist.docs");
//	            ExtentsReportManager.extentReportLogging( "info","Docs in group " + i + " = " + docs.size());

				for (int j = 0; j < docs.size(); j++) {
					List<Object> sponsorDetails = js.getList("ModuleSponsorResponse.grouped.modulemappingtype_t.groups["
							+ i + "].doclist.docs[" + j + "].sponsordetailinfo_s");

					if (sponsorDetails != null) {
						for (int k = 0; k < sponsorDetails.size(); k++) {
							String actualName = js.getString("ModuleSponsorResponse.grouped.modulemappingtype_t.groups["
									+ i + "].doclist.docs[" + j + "].sponsordetailinfo_s[" + k + "].PartnerName");

							for (String expectedLogo : expAllSponsorLogos) {
								if (actualName != null && actualName.equalsIgnoreCase(expectedLogo)) {
									if (!allSponsorLogos.contains(expectedLogo)) {
										allSponsorLogos.add(expectedLogo);
										ExtentsReportManager.extentReportLogging("info",
												"Found sponsor logo: " + expectedLogo);
									}
									break;
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Error while fetching sponsor logos: " + e.getMessage());
			throw e;
		}

		return allSponsorLogos;
	}

//	public ArrayList<String> getVideoCardFromApi(String string) {
//		 try {
//			ArrayList<String> englishFaCup = new ArrayList<>();
//			Response res = getResponse(endpoint);
//			js = new JsonPath(res.asString());
//			int size = js.getList("FixtureListResponse.response.docs").size();
//			for (int i = 0; i < size; i++) {
//				englishFaCup.add(js.getString("FixtureListResponse.response.docs[" + i + "].competitionname_t"));
// 
//				}
//			ExtentsReportManager.extentReportLogging("info",
//					"Getting the response from the endpoint " + getURIInfo(endpoint));
//			return englishFaCup;
//		} catch (Exception e) {
//			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getImageCard()" + e);
//			throw e;
//		}
//	}
}

