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
import org.bdd.utils.GlobalParams;
import org.bdd.utils.PropertyFileManager;

public class IdmAPIResponse extends BaseApiService {
	private static final Logger log = LogManager.getLogger(IdmAPIResponse.class);
	public JsonPath js;
	
	
	public ArrayList<String> getContentOfMyProfileFromAPIScFourApi(String endpoint) throws Exception {
		try {
				ArrayList<String> myProfileContent = new ArrayList<>();
				Response res = getUrlEncodedResponse(endpoint);
				js = new JsonPath(res.asString());
				int size=js.getList("AppConfigurationResponse.response.docs[0].data_t.settingsDictionary.myprofile[0].val").size();
				System.out.println("size=" +size);
				for (int i = 0; i < size; i++) {
					myProfileContent.add(js.getString("AppConfigurationResponse.response.docs[0].data_t.settingsDictionary.myprofile[0].val[" + i + "].disp").toUpperCase());
				}
				ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
				return myProfileContent;
			} catch (Exception e) {
				ExtentsReportManager.extentReportLogging("fail",
						"Exception occurred in function getContentOfMyProfileFromAPIScFourApi()" + e);
				throw e;
			}
	}


	public String getappearencesFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String appearencesFromAPI=js.getString("UserInfo.SeasonInfo[0].TotalMatchAppearances");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return appearencesFromAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getappearencesFromAPI()" + e);
			throw e;
		}
			}


	public String getdailyStreaksFromAPI(String endpoint) throws Exception {
		try {
			Response res = getUrlEncodedResponse(endpoint);
			js = new JsonPath(res.asString());
			String dailyStreaksFromAPI=js.getString("UserInfo.DailyStreakCount");
			ExtentsReportManager.extentReportLogging("info", "Getting the response from the endpoint " + getURIInfo(endpoint));
		return dailyStreaksFromAPI;
		} catch (Exception e) {
			ExtentsReportManager.extentReportLogging("fail", "Exception occurred in function getdailyStreaksFromAPI()" + e);
			throw e;
		}
	}
	}



	



	