package FlowStep.Pages.Account;

import Common.Config.DriverContext;
import FlowStep.Pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccountPage extends BasePage {

    public static AccountPage getInstance(){
        return new AccountPage();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='2' and @text='Account']")
    public MobileElement account_lbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='2' and @text='Account']/parent::android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    public MobileElement back_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='Sign in']")
    public MobileElement signIn_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='Sign out']")
    public MobileElement signOut_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0 and @text='SIGN UP NOW']")
    public MobileElement signUp_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=6]")
    public MobileElement starAmount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='My List']")
    public MobileElement myList_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0 and @text='Setting']")
    public MobileElement setting_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0 and @text='Switch profile']")
    public MobileElement switchProfile_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=2 and @text='Profile Adult']")
    public MobileElement profile;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='Account settings']")
    public MobileElement accountSetting_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='Transaction history']")
    public MobileElement transactionHistory_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='General settings']")
    public MobileElement generalSetting_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='Feedback']")
    public MobileElement feedback_btn;

    public void clickSignin(){
        scrollToElementContainsTextAndClick("Sign in");
    }
}
