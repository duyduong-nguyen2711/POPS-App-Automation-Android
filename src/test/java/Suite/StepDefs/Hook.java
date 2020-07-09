package Suite.StepDefs;

import Common.Config.Config;
import Common.Config.DriverContext;
import Common.Utils.Log;
import FlowStep.Data.DataContext.ScenarioContext;
import FlowStep.Data.DataContext.TestContext;
import FlowStep.Data.Enum.Context;
import FlowStep.Pages.Home.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hook {
    private ScenarioContext scenarioContext = TestContext.getScenarioContext();
    @Before(order = 0)
    public void beforeScenario(){
        try{
            Config.loadEnvInfo();
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", Config.getProp("platformName"));
            caps.setCapability("platformVersion",scenarioContext.getContext(Context.PLATFORM_VERSION));
            caps.setCapability("deviceName", scenarioContext.getContext(Context.DEVICE_NAME));
            caps.setCapability("appPackage", Config.getProp("appPackage"));
            caps.setCapability("appActivity", Config.getProp("appActivity"));
            URL url = new URL(Config.getProp("url"));
            //WebDriver driver = new RemoteWebDriver(new URL("http://192.168.90.14:4444/wd/hub"), Config.mobileCaps);
            AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, caps);
            DriverContext.setDriver(driver);
            Log.info("Open application successful");
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    @Before(order = 1)
    public void waitForPageLoad(){
        HomePage.getInstance().waitForHomePageLoadSuccess();
        Log.info("Home Page load successful");
    }

    @After(order = 0)
    public void afterScenario(){
        DriverContext.getDriver().quit();
        Log.info("End Scenario");
    }
}
