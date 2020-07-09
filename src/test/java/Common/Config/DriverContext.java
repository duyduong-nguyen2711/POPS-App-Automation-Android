package Common.Config;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverContext {

    public static AndroidDriver<MobileElement> getDriver() {
       return threadLocal.get();
    }

    public static void setDriver(AndroidDriver<MobileElement> driver) {
        threadLocal.set(driver);
    }

    protected static ThreadLocal<AndroidDriver<MobileElement>> threadLocal = new ThreadLocal<>();

}
