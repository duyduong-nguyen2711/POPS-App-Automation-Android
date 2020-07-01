package Suite;

import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

@CucumberOptions(
        features = "src/test/resources/Features/Android",
        glue = {"Suite.StepDefs"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests { }
