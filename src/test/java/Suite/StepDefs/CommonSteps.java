package Suite.StepDefs;

import Common.Config.Settings;
import Common.Utils.Log;
import FlowStep.Pages.Account.AccountPage;
import FlowStep.Pages.Account.SignInPage;
import FlowStep.Pages.Account.SignUpPage;
import FlowStep.Pages.Home.HomePage;
import FlowStep.Pages.NavigationBar.Navigation;
import FlowStep.Utils.Wait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CommonSteps {

    @Given("^User is at Home Page$")
    public void stayAtHomePage(){
        Assert.assertTrue(HomePage.getInstance().isHomePageDisplayed(), "User is not at Home Page");
        Log.info("User is at Home page");
    }

    @Then("^User should see tutorial and click Got It$")
    public void confirmTutorial() throws InterruptedException{
        HomePage.getInstance().checkTutorial();
        Log.info("Tutorial Display and can be skipped");
    }

    @When("^User navigate to \"([^\"]*)\"$")
    public void navigateToPage(String pageName){
        Navigation.getInstance().navigateToPage(pageName);
        Log.info("User navigates to " + pageName);
    }

    @When("^User click back from Account Page$")
    public void backToHomePage(){
        AccountPage.getInstance().back_btn.click();
        Wait.waitUntilElementDisplay(HomePage.getInstance().home_lbl, Settings.SHORT_TIMEOUT_SECOND);
    }
}
