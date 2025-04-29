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

public class UnitedNowAPIResponse extends BaseApiService {
	private static final Logger log = LogManager.getLogger(UnitedNowAPIResponse.class);
	public JsonPath js;

	public String getWhatsNewOrLiveBlogTextFromEndPoint(String endpoint, String text) throws IOException {
		try {
			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			if (text.equalsIgnoreCase("whatNew")) {
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
			String matchReviewText=js.getString("ResultListResponse.response.docs[0].matchdayresultctatitle_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
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
	        boolean comingUpCarousal = js.getBoolean("UnitednowconfigurationsResponse.response.docs[0].comingupenableunitednow_b");

	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
	        return comingUpCarousal;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in isCarouselDisplayedFromApi(): " + e.getMessage());
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
				playerPageFilters
						.add(js.getString("PageFilterResponse.response.docs[" + i + "].label_t").toUpperCase());
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

	
		public String getPremierLeagueFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String premierLeagueTextAPI = js
					.getString("PageFilterResponse.grouped._parent.groups[11].doclist.docs[5].label_t").toUpperCase();
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return premierLeagueTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getPremierLeagueFromApi()" + e);
			throw e;
		}
	}

	public String getEuropaLeagueFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String europaLeagueTextAPI = js
					.getString("PageFilterResponse.grouped._parent.groups[11].doclist.docs[1].label_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return europaLeagueTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEuropaLeagueFromAPI()" + e);
			throw e;
		}
	}

	public String getWomensSuperLeagueFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String womensSuperLeagueTextAPI = js
					.getString("PageFilterResponse.grouped._parent.groups[5].doclist.docs[2].label_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return womensSuperLeagueTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getWomensSuperLeagueFromApi()" + e);
			throw e;
		}
	}

	public String getContenentalLeagueCupFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String contenentalLeagueCupTextAPI = js
					.getString("PageFilterResponse.grouped._parent.groups[5].doclist.docs[0].label_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return contenentalLeagueCupTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getContenentalLeagueCupFromAPI()" + e);
			throw e;
		}
	}

	public String getPremierLeague2FromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String premierLeague2TextAPI = js
					.getString("PageFilterResponse.grouped._parent.groups[14].doclist.docs[2].label_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return premierLeague2TextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getPremierLeague2FromAPI()" + e);
			throw e;
		}
	}

	public String getEFLTrophyFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String eflTrophyTextAPI = js
					.getString("PageFilterResponse.grouped._parent.groups[14].doclist.docs[1].label_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return eflTrophyTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEFLTrophyFromAPI()" + e);
			throw e;
		}
	}

	public String getU18PremierLeagueFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String u18PremierLeagueTextAPI = js
					.getString("PageFilterResponse.grouped._parent.groups[8].doclist.docs[2].label_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return u18PremierLeagueTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEFLTrophyFromAPI()" + e);
			throw e;
		}
	}

	public String getUEFAYouthLeagueFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String uefaYouthLeagueTextAPI = js
					.getString("PageFilterResponse.grouped._parent.groups[8].doclist.docs[3].label_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return uefaYouthLeagueTextAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getEFLTrophyFromAPI()" + e);
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
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t")
						.equalsIgnoreCase(contentTypeVideoCard)) {
					expVideoCard.add(js.getString("ListingResponse.response.docs[" + i + "].shortheadline_t"));

				}
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return expVideoCard;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getVideoCard()" + e);
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
	        boolean storiesCarousel = js.getBoolean("UnitednowconfigurationsResponse.response.docs[0].hideunstoriescarousal_b");
	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		        return storiesCarousel;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in getStoriesCarouselFromApi(): " + e.getMessage());
	        throw e;
	    }
	}

	public String getUpsellTitleFromApi(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String upsellTitleFromAPI=js.getString("UpsellResponse.response.docs[0].title_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
			return upsellTitleFromAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getUpsellTitleFromApi()" + e);
			throw e;
		}
	}

	public String getWatchNowBtnTextFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String upsellTitleFromAPI=js.getString("UpsellResponse.response.docs[0].ctatitle_t");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
			return upsellTitleFromAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWatchNowBtnTextFromAPI()" + e);
			throw e;
		}

	}

	public boolean getLiveVideoFromApi(String endpoint) throws Exception {
		try {
	        Response res = getUrlEncodedResponse(endpoint);
	        js = new JsonPath(res.asString());
			if(js.getList("EpgLiveStreamResponse.response.docs").size()>0) {
				// Assuming the API returns a boolean field indicating carousel presence
				boolean liveVideo = js.getBoolean("EpgLiveStreamResponse.response.docs[1].enablevideounitednow_b");
			}else return false;
	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));

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
			String LiveVideoText=js.getString("EpgLiveStreamResponse.response.docs[1].schedulemetadata_t.Title");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
			return LiveVideoText;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getLiveVideoTextFromApi()" + e);
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
			String contentTypePollCard = "poll";

			Response res = getResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("ListingResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				if (js.getString("ListingResponse.response.docs[" + i + "].contenttype_t").equalsIgnoreCase(contentTypePollCard)) {
					expPollCard.add(js.getString("ListingResponse.response.docs[" + i + "].unitednowhighlightstitle_t"));

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
	
	public String getEnglishFaCups(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
	        String getAll = js.getString("LatestResultsResponse.response.docs[0].competitionname_t");

	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
	        return getAll;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in getAll(): " + e.getMessage());
	        throw e;
	    }
	}
	
	public String getEnglishPremierLeague(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
	        String getAll = js.getString("FixtureListResponse.response.docs[0].competitionname_t");

	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
	        return getAll;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in getEnglishPremierLeague(): " + e.getMessage());
	        throw e;
	    }
	}
	
	public String getFACup(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
	        String getAll = js.getString("LatestResultsResponse.response.docs[0].aliascompetitionname_t");

	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
	        return getAll;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in getFACup(): " + e.getMessage());
	        throw e;
	    }
	}
	
	public String getUEFAEuropaLeague(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
	        String getAll = js.getString("FixtureListResponse.response.docs[18].competitionname_t");

	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
	        return getAll;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in getUEFAEuropaLeague(): " + e.getMessage());
	        throw e;
	    }
	}
	
	public String getFriendly(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
	        String getAll = js.getString("FixtureListResponse.response.docs[18].competitionname_t");

	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
	        return getAll;
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in getUEFAEuropaLeague(): " + e.getMessage());
	        throw e;
	    }
	}
	
	public String getDateTBC(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
	        String getDateTBC = js.getString("LatestResultsResponse.response.docs[0].matchdatetbc_t");

	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
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
			for(int i=0;i < size; i++) {
				if(js.getString("ResultListResponse.response.docs["+i+"].ticketctatitle_t")!=null){
					getTicketInfo.add(js.getString("ResultListResponse.response.docs["+i+"].ticketctatitle_t"));
				}
			}
	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint "+getTicketInfo.get(0)+"" + getURIInfo(endpoint));
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
			for(int i=0;i < size; i++) {
				if(js.getString("LatestResultsResponse.response.docs["+i+"].matchdayresultctatitle_t")!=null){
					getMatchReview.add(js.getString("ResultListResponse.response.docs["+i+"].matchdayresultctatitle_t"));
				}
			}
	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
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
			for(int i=0;i < size; i++) {
				if(js.getString("ResultListResponse.response.docs["+i+"].matchdayresultctatitle_t")!=null){
					getMatchReview.add(js.getString("ResultListResponse.response.docs["+i+"].matchdayresultctatitle_t"));
				}
			}
			
	    	ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
	        return getMatchReview.get(0);
	    } catch (Exception e) {
	        ExtentsReportManager.extentReportLogging("fail", "Exception in getMatchDayLive(): " + e.getMessage());
	        throw e;
	    }
	}
}
