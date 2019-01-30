package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            String path = "configuration.properties";

            FileInputStream inputStream = new FileInputStream(path);

            properties = new Properties();
            properties.load(inputStream);

            inputStream.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
