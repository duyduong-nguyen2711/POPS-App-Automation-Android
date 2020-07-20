package Suite;

import Common.Config.Config;
import Common.Config.DriverContext;
import Common.Utils.CapabilitiesManager;
import Common.Utils.GlobalParams;
import Common.Utils.Log;
import Common.Utils.ServerManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.ThreadContext;
import org.testng.annotations.*;

@CucumberOptions(
        features = "src/test/resources/Features/Android",
        glue = {"Suite.StepDefs"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"}
)

public class TestRunner {

    private TestNGCucumberRunner testNGCucumberRunner;


    @Parameters({"deviceName", "udid", "systemPort", "chromeDriverPort"})
    @BeforeMethod(alwaysRun = true)
    public void setupClass(String deviceName, String udid, String systemPort, String chromeDriverPort) throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        ThreadContext.put("ROUTING KEY", "Android_" + deviceName);

        GlobalParams params = new GlobalParams();
        params.setDeviceName(deviceName);
        params.setUdid(udid);
        params.setSystemPort(systemPort);
        params.setChromeDriverPort(chromeDriverPort);
        params.initializeGlobalParams();

        new ServerManager().startServer();
        CapabilitiesManager capabilitiesManager = new CapabilitiesManager();
        AndroidDriver<MobileElement> driver = capabilitiesManager.initializeDriver();
        new DriverContext().setDriver(driver);
        Config.getTimeOut();
    }

    @Test(groups = "cucumber", description = "Runs cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleEventWrapper pickle, CucumberFeatureWrapper cucumberFeature) throws Throwable {
        testNGCucumberRunner.runScenario(pickle.getPickleEvent());
    }

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownClass() {

//        ServerManager serverManager = new ServerManager();
//        if (serverManager.getServer() != null) {
//            serverManager.getServer().stop();
//        }
//
//        DriverContext.getDriver().quit();

        if (testNGCucumberRunner != null) {
            testNGCucumberRunner.finish();
        }
    }
}
