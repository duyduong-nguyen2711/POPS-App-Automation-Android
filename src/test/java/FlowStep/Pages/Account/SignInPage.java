package FlowStep.Pages.Account;

import FlowStep.Pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInPage extends BasePage {

    public static SignInPage getInstance(){return new SignInPage();}

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0 and @text='Sign In']")
    public MobileElement signIn_lbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='OR']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/android.view.ViewGroup[1]")
    public MobileElement facebook_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='OR']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/android.view.ViewGroup[2]")
    public MobileElement google_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='OR']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[1]")
    public MobileElement email_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='OR']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
    public MobileElement email_placeholder;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='OR']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[2]")
    public MobileElement password_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='OR']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
    public MobileElement password_placeholder;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='OR']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[3]")
    public MobileElement signIn_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='OR']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
    public MobileElement forgotPwd_btn;

    public void clickSignUpByText(){
        scrollToElementContainsTextAndClick(756, 1676);
    }
}
