package Common.Config;

import Common.Utils.Log;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Queue;

public class Config {

    private static final String CONFIG = "Config.properties";
    private static final ThreadLocal<Properties> propTL = new ThreadLocal<>();
    private static Properties prop = new Properties();

    public static void loadEnvInfo() {
        try {
            File configFile = new File(CONFIG);
            InputStream stream = new FileInputStream(configFile);
            prop.load(stream);
            Settings.SHORT_TIMEOUT_SECOND = Integer.parseInt(getProp("SHORT_TIMEOUT_SECOND"));
            Settings.LONG_TIMEOUT_SECOND = Integer.parseInt(getProp("LONG_TIMEOUT_SECOND"));
        } catch (Throwable ex) {
            Log.error(ex.getMessage());
        }
    }

    public static String getProp(String propKey) {
        if (propTL.get() == null) {
            propTL.set(prop);
        }
        return propTL.get().getProperty(propKey);
    }

}
