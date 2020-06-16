package Suite.StepDefs;

import Common.Utils.Log;
import FlowStep.Pages.Account.AccountPage;
import FlowStep.Pages.Account.LoginPage;
import FlowStep.Pages.NavigationBar.Navigation;
import FlowStep.Utils.Wait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginSteps {

    @Given("^User is at Login Page")
    public void confirmLoginPage(){
        AccountPage.getInstance().clickSignin();
        Wait.waitUntilElementDisplay(LoginPage.getInstance().signIn_lbl, 5);
        Log.info("User is at Login page");
    }

    @When("^User login successful$")
    public void loginSuccessful(){

    }
}
