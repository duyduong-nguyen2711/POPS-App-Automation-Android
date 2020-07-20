package Common.Config;

import Common.Utils.CapabilitiesManager;
import Common.Utils.GlobalParams;
import Common.Utils.ServerManager;
import cucumber.api.java8.Ur;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

public class DriverContext {

    public AndroidDriver<MobileElement> getDriver() {
        return threadLocal.get();
    }

    public void setDriver(AndroidDriver<MobileElement> driver) {
        threadLocal.set(driver);
    }

    protected static ThreadLocal<AndroidDriver<MobileElement>> threadLocal = new ThreadLocal<>();

}
