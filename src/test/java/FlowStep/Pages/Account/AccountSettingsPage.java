package FlowStep.Pages.Account;

import FlowStep.Pages.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class AccountSettingsPage extends BasePage {

    public static AccountSettingsPage getInstance(){return new AccountSettingsPage();}

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='Edit']")
    MobileElement edit_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='Edit']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    MobileElement back_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0 and @text='Account']")
    MobileElement account_lbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='Full Name']/following-sibling::android.view.ViewGroup[1]/android.widget.EditText")
    MobileElement fullName_placeholder;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=1 and @text='Full Name']/following-sibling::android.view.ViewGroup[1]")
    MobileElement fullName_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=3 and @text='Phone Number']/following-sibling::android.view.ViewGroup[1]/android.widget.EditText")
    MobileElement phoneNumber_placeholder;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=3 and @text='Phone Number']/following-sibling::android.view.ViewGroup[1]")
    MobileElement phoneNumber_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=5 and @text='Contact via Email']/following-sibling::android.view.ViewGroup[1]/android.widget.EditText")
    MobileElement emailContact_placeholder;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=5 and @text='Contact via Email']/following-sibling::android.view.ViewGroup[1]")
    MobileElement emailContact_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=7 and @text='Email']/following-sibling::android.view.ViewGroup[1]")
    MobileElement email_txt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=7 and @text='Email']/following-sibling::android.view.ViewGroup[2]")
    MobileElement update_btn;

    public void checkAccountInfoPlaceHolder(){
        Assert.assertEquals(fullName_placeholder.getText(), "Enter Full Name");
        Assert.assertEquals(phoneNumber_placeholder.getText(), "Enter Phone Number");
        Assert.assertEquals(emailContact_placeholder.getText(), "Enter Email");
    }


}
