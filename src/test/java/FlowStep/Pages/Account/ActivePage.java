package FlowStep.Pages.Account;

import Common.Config.Settings;
import FlowStep.Data.DataContext.ScenarioContext;
import FlowStep.Data.DataContext.TestContext;
import FlowStep.Data.Enum.Context;
import FlowStep.Pages.BasePage;
import FlowStep.Pages.Home.HomePage;
import FlowStep.Utils.EmailUtils;
import FlowStep.Utils.Mail;
import FlowStep.Utils.Wait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class ActivePage extends BasePage {

    private String activeCode = null;
    private HomePage homePage = HomePage.getInstance();
    private EmailUtils emailUtils = EmailUtils.getInstance();
    private ScenarioContext scenarioContext = TestContext.getScenarioContext();
    public static ActivePage getInstance(){return new ActivePage();}

    @AndroidFindBy(id = "android:id/message")
    public MobileElement message_txt;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement message_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Activate later']")
    public MobileElement activeLater_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Resend activation email']")
    public MobileElement resend_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Resend activation email']/parent::android.view.ViewGroup/android.widget.TextView[3]")
    public MobileElement activeCode_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Resend activation email']/parent::android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement activeAccount_lbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ACTIVATE']")
    public MobileElement active_btn;

    public void confirmActivatePopUps(){
        Wait.waitUntilElementDisplay(message_txt, Settings.SHORT_TIMEOUT_SECOND);
        Assert.assertTrue(message_txt.getText().contains("Please input the activate code which is sent to your email."));
        click(message_btn);
    }

    public void getActivateCodeFromEmail() throws IOException {
        List<Mail> list = emailUtils.getIncomingMailList(scenarioContext.getContext(Context.EMAIL).toString());
        emailUtils.getLastMailContent(scenarioContext.getContext(Context.EMAIL).toString());
    }

    public void activeAccount() throws IOException {
        getActivateCodeFromEmail();
        type(activeCode_txt ,activeCode);
        click(active_btn);
        Wait.waitUntilElementDisplay(homePage.home_lbl, Settings.SHORT_TIMEOUT_SECOND);
    }

    public void activeLater(){
        click(activeLater_btn);
        Wait.waitUntilElementDisplay(homePage.home_lbl, Settings.SHORT_TIMEOUT_SECOND);
    }

    public void resendEmail(){
        click(resend_btn);
        Wait.waitUntilElementDisplay(message_txt, Settings.SHORT_TIMEOUT_SECOND);
        Assert.assertTrue(message_txt.getText().contains("Please wait 3 minutes from the last responding"));
        click(message_btn);
    }

}
