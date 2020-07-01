package FlowStep.Pages.Account;

import Common.Config.Settings;
import Common.Utils.Log;
import FlowStep.Data.DataContext.ScenarioContext;
import FlowStep.Data.DataContext.TestContext;
import FlowStep.Data.Enum.Context;
import FlowStep.Pages.BasePage;
import FlowStep.Utils.EmailHelper;
import FlowStep.Utils.Wait;
import io.cucumber.datatable.DataTable;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.util.List;

public class SignUpPage extends BasePage {

    public static SignUpPage getInstance(){return new SignUpPage();}

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Full name']/parent::android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement signUp_lbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Full name']/following-sibling::android.view.ViewGroup[1]/android.widget.EditText")
    public MobileElement fullName_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your email']/following-sibling::android.view.ViewGroup[1]/android.widget.EditText")
    public MobileElement email_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your password']/following-sibling::android.view.ViewGroup[1]/android.widget.EditText")
    public MobileElement password_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Register New Account']")
    public MobileElement register_btn;

    @AndroidFindBy(id = "android:id/message")
    public MobileElement message_txt;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement message_btn;

    public boolean checkRegisterStatus(){
        boolean isRegisterButtonEnabled = isButtonEnabledToClick(message_btn);
       if (!isRegisterButtonEnabled){
           Log.info("Register button is disabled");
           return false;
       }
       return true;
    }

    public void register(String fullName, String email, String password){
        type(fullName_txt, fullName);
        type(email_txt, email);
        type(password_txt, password);
        click(register_btn);
    }

    public void checkErrorMessage(String errorMessage){
        Wait.waitUntilElementDisplay(message_txt, Settings.SHORT_TIMEOUT_SECOND);
        Assert.assertEquals(errorMessage, message_txt.getText(), "Message is incorrect");
        click(message_btn);
    }

    public void registerWithIncorrectInfo(DataTable dataTable){
        List<List<String>> table = dataTable.asLists(String.class);
        for (int i = 0; i < table.size(); i++){
            String fullName = table.get(i).get(0);
            String email = table.get(i).get(1);
            String password = table.get(i).get(2);
            String errorMessage = table.get(i).get(3);

            register(fullName, email, password);
            checkErrorMessage(errorMessage);
        }
    }

    public void registerWithCorrectInfo(DataTable dataTable){
        ScenarioContext scenarioContext = TestContext.getScenarioContext();
        List<String> users = dataTable.asList(String.class);
        String fullName = users.get(0);
        scenarioContext.setContext(Context.FULL_NAME, fullName);
        String email = EmailHelper.generateEmail(users.get(1));
        scenarioContext.setContext(Context.EMAIL, email);
        String password = users.get(2);
        scenarioContext.setContext(Context.PASSWORD, password);
        register(fullName, email, password);
        Wait.waitUntilElementDisplay(ActivePage.getInstance().activeAccount_lbl, Settings.SHORT_TIMEOUT_SECOND);
    }

}
