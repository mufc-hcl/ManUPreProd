package org.bdd.utils.apiResponse;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bdd.utils.ExtentsReportManager;
import org.bdd.utils.PropertyFileManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class BaseApiService {
    private static final Logger log = LogManager.getLogger(BaseApiService.class);

    public String apiEnv() {
        return System.getProperty("env");
    }

    public Map<String, String> tokenDetails(String env) throws IOException {
        Map<String, String> headers = new HashMap<>();
        Properties props;
        try {
            props = new PropertyFileManager().getApiProperties();
            String token = null;
            if (env.equalsIgnoreCase("stage")) {
                token = props.getProperty("stage_token");
            } else if (env.equalsIgnoreCase("prod")) {
                token = props.getProperty("prod_token");
            }
            headers.put("x-api-key", token);
        } catch (Exception e) {
            log.error("Exception occurred in getting header information" + e);
            throw e;
        }
        return headers;
    }

    public String getURIInfo(String endPoint) throws IOException {
        Properties props;
        try {
            props = new PropertyFileManager().getApiProperties();
            String env = null;
            String baseUri=null;
            if (apiEnv().equalsIgnoreCase("stage")) {
                 baseUri = props.getProperty("baseUri_stage");
            }else if (apiEnv().equalsIgnoreCase("prod")) {
                baseUri = props.getProperty("baseUri_prod");
            }
            String endPt = props.getProperty(endPoint);
            return baseUri + endPt;
        } catch (Exception e) {
            log.error("Exception occurred in getting url information" + e);
            throw e;
        }
    }

    public Response getResponse(String endPoint) throws IOException {
        Properties props;
        try {
            props = new PropertyFileManager().getApiProperties();
            String baseUri = null;
            String endPt = props.getProperty(endPoint);
            String env = null;
            if (apiEnv().equalsIgnoreCase("stage")) {
                env = "stage";
                baseUri = props.getProperty("baseUri_stage");
            } else if (apiEnv().equalsIgnoreCase("prod")) {
                env = "prod";
                baseUri = props.getProperty("baseUri_prod");
            }
            RestAssured.config= RestAssuredConfig.config().httpClient(HttpClientConfig.httpClientConfig().
                    setParam("http.connection.timeout",200000).
                    setParam("http.socket.timeout",200000).
                    setParam("http.connection-manager.timeout",200000));
            return given().headers(tokenDetails(env)).baseUri(baseUri)
                    .basePath(endPt).when().get().then().extract().response();
        } catch (Exception e) {
            log.error("Exception occurred in getting Response" + e);
            throw e;
        }
    }

    public Response getUrlEncodedResponse(String endPoint) throws IOException {
        Properties props;
        try {
            props = new PropertyFileManager().getApiProperties();
            String baseUri = null;
            String endPt = props.getProperty(endPoint);
            String env = null;
            if (apiEnv().equalsIgnoreCase("stage")) {
                env = "stage";
                baseUri = props.getProperty("baseUri_stage");
            } else if (apiEnv().equalsIgnoreCase("prod")) {
                env = "prod";
                baseUri = props.getProperty("baseUri_prod");
            }
            RestAssured.config=RestAssuredConfig.config().httpClient(HttpClientConfig.httpClientConfig().
                    setParam("http.connection.timeout",200000).
                    setParam("http.socket.timeout",200000).
                    setParam("http.connection-manager.timeout",200000));
            return given().urlEncodingEnabled(false).headers(tokenDetails(env)).baseUri(baseUri)
                    .basePath(endPt).when().get().then().extract().response();
        } catch (Exception e) {
            log.error("Exception occurred in getting url encoded Response" + e);
            throw e;
        }
    }

//    public Response postRequest(Object details, String endpoint) {
//        return given().baseUri(getApiProperty().getProperty("baseUri_stage")).basePath(endpoint).contentType(ContentType.JSON)
//                .body(details).when().post();
//    }

}
