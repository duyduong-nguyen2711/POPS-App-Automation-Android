package FlowStep.Pages.Account;

import FlowStep.Pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpPage extends BasePage {

    public static SignUpPage getInstance(){return new SignUpPage();}

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Full name']/parent::android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement signUp_lbl;

}
