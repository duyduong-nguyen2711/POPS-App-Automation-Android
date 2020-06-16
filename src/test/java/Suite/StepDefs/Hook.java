package Suite.StepDefs;

import Common.Config.Config;
import Common.Config.DriverContext;
import Common.Utils.Log;
import FlowStep.Pages.Home.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hook {

    @Before(order = 0)
    public void beforeScenario(){
        try{
            Config.loadConfigFileValues();
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, Config.mobileCaps);
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
