package Suite.StepDefs;

import Common.Utils.Log;
import FlowStep.Pages.Account.AccountPage;
import FlowStep.Pages.Account.LoginPage;
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
    public void confirmTutorial(){
        HomePage.getInstance().checkTutorial();
        Log.info("Tutorial Display and can be skipped");
    }

    @When("^User navigate to \"([^\"]*)\"$")
    public void navigateToPage(String pageName){
        Navigation.getInstance().navigateToPage(pageName);
        Log.info("User navigates to " + pageName);
    }

    @When("^User click Sign Up on Sign In page$")
    public void clickSignUp(){
        LoginPage.getInstance().clickSignUpByText();
        Wait.waitUntilElementDisplay(SignUpPage.getInstance().signUp_lbl, 10);
        Log.info("User navigate to Sign Up page");
    }
}
