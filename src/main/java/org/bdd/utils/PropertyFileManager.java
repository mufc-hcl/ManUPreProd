package org.bdd.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileManager {
    public static Properties props = new Properties();
    public static Properties propsApi = new Properties();
    private static final Logger log = LogManager.getLogger(PropertyFileManager.class);

    public Properties getProperties() throws IOException {
        FileInputStream fis = null;
        String fileName = System.getProperty("user.dir") + "/src/main/resources/config.properties";
        if (props.isEmpty()) {
            try {
                log.info("loading the properties from the config files");
                fis = new FileInputStream(fileName);
                props.load(fis);
            } catch (IOException e) {
                log.fatal("Failed to load config properties." + e);
                throw e;
            } finally {
                if (fis != null) {
                    fis.close();
                }
            }
        }
        return props;
    }

    public Properties getApiProperties() throws IOException {
        FileInputStream fis = null;
        String fileName = System.getProperty("user.dir") + "/src/main/resources/apiDetails.properties";
        if (propsApi.isEmpty()) {
            try {
                log.info("loading the properties from the apiDetails files");
                fis = new FileInputStream(fileName);
                propsApi.load(fis);
            } catch (IOException e) {
                log.fatal("Failed to load apiDetails properties." + e);
                throw e;
            } finally {
                if (fis != null) {
                    fis.close();
                }
            }
        }
        return propsApi;
    }

}
