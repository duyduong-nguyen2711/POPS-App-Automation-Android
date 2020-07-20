package Common.Utils;

import Common.Config.Config;
import Common.Config.DriverContext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class CapabilitiesManager {

    public DesiredCapabilities getCaps() throws IOException {
        GlobalParams params = new GlobalParams();
        Properties props = new Config().getConfig();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("udid", params.getUdid());
        caps.setCapability("deviceName", params.getDeviceName());
        caps.setCapability("automationName", props.getProperty("automationName"));
        caps.setCapability("appPackage", props.getProperty("appPackage"));
        caps.setCapability("appActivity", props.getProperty("appActivity"));
        caps.setCapability("systemPort", params.getSystemPort());
        caps.setCapability("chromeDriverPort", params.getChromeDriverPort());

        return caps;
    }

    public AndroidDriver<MobileElement> initializeDriver() throws Exception {
        ServerManager serverManager = new ServerManager();
        String url = serverManager.getServer().getUrl().toString();
        DesiredCapabilities caps = getCaps();

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL(url), caps);

        return driver;
    }

}
