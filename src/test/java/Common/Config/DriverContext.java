package Common.Config;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverContext {

    public static AndroidDriver<MobileElement> getDriver() {
        return driver;
    }

    public static void setDriver(AndroidDriver<MobileElement> driver) {
        DriverContext.driver = driver;
    }

    private static AndroidDriver<MobileElement> driver;

}
