package Suite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoTest {

    protected AndroidDriver<MobileElement> driver;

    @BeforeMethod
    @Parameters({"deviceName", "platformVersion", "url", "udid"})
    public void setup(String deviceName, String platformVersion, String url, String udid) throws MalformedURLException {
        System.out.println("TestNG Before");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("udid", udid);
        capabilities.setCapability("appPackage", "com.popsworldwide.popsapp.staging");
        capabilities.setCapability("appActivity", "com.popsworldwide.popsapp.MainActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://" + url), capabilities);
    }

    @Test
    public void test1() throws InterruptedException {

//        System.out.println("TestNG Before");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "Nokia 7 plus");
//        capabilities.setCapability("platformVersion", "9");
//        capabilities.setCapability("udid", "B2NGAA8872103667");
//        capabilities.setCapability("appPackage", "com.popsworldwide.popsapp.staging");
//        capabilities.setCapability("appActivity", "com.popsworldwide.popsapp.MainActivity");
//
//        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.2:5000/wd/hub"), capabilities);

        Thread.sleep(10000);
        driver.quit();
        System.out.println("Test end");
    }
}
