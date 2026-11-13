package se.sprinto.hakan.dbconnection;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Properties;

public class ConfigManager {
    private static final ConfigManager INSTANCE = new ConfigManager();
    private Properties properties;

    private ConfigManager() {
        properties = new Properties();

        String propertiesFile = System.getenv("config.file");
        if (propertiesFile == null) {
            propertiesFile = "config.properties";
        }

        try (InputStream input =
                     ConfigManager.class.getClassLoader().getResourceAsStream(propertiesFile)) {

            if (input == null) {
                throw new IllegalStateException("Ingen properties-fil hittades");
            }
            properties.load(input);


        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static ConfigManager getInstance() {
        return INSTANCE;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

}
