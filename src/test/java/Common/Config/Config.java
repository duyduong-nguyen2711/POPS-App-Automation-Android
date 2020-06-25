package Common.Config;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Queue;

public class Config {

    private static final String CONFIG_FOlDER = "Config.properties";
    private static final String Device_Config = "src/test/resources/Environments/";
    public static Queue<Properties> envQueue;
    private static ThreadLocal<Properties> propTL = new ThreadLocal<>();
    private static Properties prop = new Properties();
    public static DesiredCapabilities mobileCaps = null;

    public static void loadConfigFileValues() {
        readConfigFile(CONFIG_FOlDER);
        String deviceName = prop.getProperty("device");

        readConfigFile(Device_Config + deviceName + ".properties");
        mobileCaps = setDeviceCapability();
        if (prop.getProperty("runType").equalsIgnoreCase("Remote")){
            mobileCaps.setCapability("", "");
        }
    }

    public static DesiredCapabilities setDeviceCapability() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, prop.getProperty("automationName"));
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("deviceName"));
        caps.setCapability(MobileCapabilityType.UDID, prop.getProperty("udid"));
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platformName"));
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("platformVersion"));

        caps.setCapability("appPackage", prop.getProperty("appPackage"));
        caps.setCapability("appActivity", prop.getProperty("appActivity"));

        return caps;
    }

    public static void readConfigFile(String propPath) {
        try {
            InputStream input = new FileInputStream(propPath);
            prop.load(input);
            Settings.SHORT_TIMEOUT_SECOND = Integer.parseInt(prop.getProperty("SHORT_TIMEOUT_SECOND"));
            Settings.LONG_TIMEOUT_SECOND = Integer.parseInt(prop.getProperty("LONG_TIMEOUT_SECOND"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProp(String propKey) {
        if (propTL.get() == null) {
            propTL.set(envQueue.poll());
        }
        return propTL.get().getProperty(propKey);
    }


}
