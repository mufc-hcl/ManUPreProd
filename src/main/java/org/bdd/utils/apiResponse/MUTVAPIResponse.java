package org.bdd.utils.apiResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.ExtentsReportManager;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class MUTVAPIResponse extends BaseApiService {
	private static final Logger log = LogManager.getLogger(MUTVAPIResponse.class);
	public JsonPath js;

	public String getMUTVPodcastTextFromApi(String endpoint) throws IOException {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String mutvPodcast = js.getString("VodResponse.response.docs[0].shortheadline_t");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return mutvPodcast;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getWelcomeTextApi()" + e);
			throw e;
		}
	}

	public List getViewAllfromMUTVApi(String endpoint) throws Exception {
		try {
			ArrayList<String> viewAllone = new ArrayList<>();
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size = js.getList("UpNextResponse.grouped._language.groups[0].doclist.docs").size();
			for (int i = 0; i < size; i++) {
				viewAllone.add(js.getString("UpNextResponse.grouped._language.groups[0].doclist.docs[" + i + "].socialtitle_t_en").toLowerCase());
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return viewAllone;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getViewAllfromMUTVApi()" + e);
			throw e;
		}
	}
	
	public List getMUTVCalendarWidgetTextDexcriptionApi(String endpoint) throws Exception {
		try {
			ArrayList<String> calenderlist = new ArrayList<>();
			Set<String> uniqueString = new HashSet<>(calenderlist);
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			int size=js.getList("EpgScheduleWeeklyResponse.response.docs").size();
			for (int i = 0; i < size; i++) {
				calenderlist.add(js.getString("EpgScheduleWeeklyResponse.response.docs[" + i + "].schedulemetadata_t.Title").toLowerCase());
			}
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			uniqueString.addAll(calenderlist);
			ArrayList<String> calenderlist1 = new ArrayList<>(uniqueString);
			Collections.sort(calenderlist1);
			return calenderlist1;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getMUTVCalendarWidgetTextDexcriptionApi()" + e);
			throw e;
		}
	}

	public String getMyListTitleFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String mutvPodcast = js.getString("DictionaryResponse.response.docs[0].dictionary_s.podcast_library_title");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return mutvPodcast;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getMyListTitleFromAPI()" + e);
			throw e;
		}
	}

	public String getMyListDescFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String mutvPodcast = js.getString("DictionaryResponse.response.docs[0].dictionary_s.podcast_library_desc");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return mutvPodcast;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getMyListDescFromAPI()" + e);
			throw e;
		}
	}

	public String getFindSomeThingToAddFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String mutvPodcast = js.getString("DictionaryResponse.response.docs[0].dictionary_s.FindSomethingToAdd");
			ExtentsReportManager.extentReportLogging("info",
					"Getting the response from the endpoint " + getURIInfo(endpoint));
			return mutvPodcast;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getFindSomeThingToAddFromAPI()" + e);
			throw e;
		}
	}
	public ArrayList<String> getMutvCarouselListFromEndPoint(String getMutvCarouselListEndPoint) throws IOException {
		try {
			ArrayList<String> carouselList = new ArrayList<>();
			Response res = getUrlEncodedResponse(getMutvCarouselListEndPoint);
			js = new JsonPath(res.asString());
			int size=js.getList("AppConfigurationResponse.response.docs[0].data_t.exploreMUTV").size();
			for (int i = 0; i < size-1; i++) {
				carouselList.add(js.getString("AppConfigurationResponse.response.docs[0].data_t.exploreMUTV[" + i + "].title").trim().toUpperCase());
			}
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(getMutvCarouselListEndPoint));
			return carouselList;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail",
					"Exception occurred in function getShopTabMenuItemsFromApi()" + e);
			throw e;
		}
	}
}
