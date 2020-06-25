package Suite.StepDefs;

import Common.Config.Settings;
import Common.Utils.Log;
import FlowStep.Data.DataContext.ScenarioContext;
import FlowStep.Data.DataContext.TestContext;
import FlowStep.Pages.Account.AccountPage;
import FlowStep.Pages.Account.SignInPage;
import FlowStep.Pages.Account.SignUpPage;
import FlowStep.Utils.Wait;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class LoginSteps {

    SignInPage signInPage = SignInPage.getInstance();
    SignUpPage signUpPage = SignUpPage.getInstance();
    AccountPage accountPage = AccountPage.getInstance();
    //ScenarioContext scenarioContext = TestContext.getScenarioContext();

    @When("^User login successful$")
    public void loginSuccessful(){

    }

    @When("^User open Login Page$")
    public void openLoginPage(){
        accountPage.clickSignIn();
        Wait.waitUntilElementDisplay(SignInPage.getInstance().signIn_lbl, Settings.SHORT_TIMEOUT_SECOND);
        Log.info("User is at Sign In page");
    }

    @When("^User open Sign Up page$")
    public void openSignUpPage(){
        signInPage.clickSignUpByText();
        Wait.waitUntilElementDisplay(SignUpPage.getInstance().signUp_lbl, Settings.SHORT_TIMEOUT_SECOND);
        Log.info("User is at Sign Up page");
    }

    @And("^User sign up with incorrect info$")
    public void signUpWithIncorrectInfo(DataTable dataTable){
        signUpPage.registerWithIncorrectInfo(dataTable);
        Log.info("Error message is displayed");
    }

    @And("^User sign up with correct info$")
    public void signUpWithCorrectInfo(DataTable dataTable){
        signUpPage.registerWithCorrectInfo(dataTable);
        Log.info("User register successful");
    }

    @Then("^Register button should be disabled to click$")
    public void checkRegisterButton(){
        Assert.assertFalse(signUpPage.checkRegisterStatus(), "Register button is able to be clicked without correct info");
    }
}
