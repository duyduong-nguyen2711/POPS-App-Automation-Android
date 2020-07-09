package Suite;

import FlowStep.Data.DataContext.ScenarioContext;
import FlowStep.Data.DataContext.TestContext;
import FlowStep.Data.Enum.Context;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "src/test/resources/Features/Android",
        glue = {"Suite.StepDefs"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @BeforeMethod
    @Parameters({"deviceName", "platformVersion"})
    public void setup(String deviceName, String platformVersion){
        ScenarioContext scenarioContext = TestContext.getScenarioContext();
        scenarioContext.setContext(Context.DEVICE_NAME, deviceName);
        scenarioContext.setContext(Context.PLATFORM_VERSION, platformVersion);
    }
}
