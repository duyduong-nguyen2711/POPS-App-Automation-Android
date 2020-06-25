package FlowStep.Pages.Home;

import Common.Config.Settings;
import FlowStep.Pages.BasePage;
import FlowStep.Utils.Wait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {
    public static HomePage getInstance(){
        return new HomePage();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Got it']")
    public MobileElement gotIt_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index = '0' and @text='Home']")
    public MobileElement home_lbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='0' and @text='Home']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.widget.TextView")
    public MobileElement search_btn;

    public boolean isHomePageDisplayed(){
        return isDisplayed(home_lbl);
    }

    public void waitForHomePageLoadSuccess(){
        Wait.waitUntilElementDisplay(home_lbl, Settings.LONG_TIMEOUT_SECOND);
    }

    public void checkTutorial() throws InterruptedException{
        Thread.sleep(5000);
        Wait.waitUntilElementDisplay(gotIt_btn, Settings.LONG_TIMEOUT_SECOND);
        Wait.waitUntilElementToBeClickable(gotIt_btn);
        click(gotIt_btn);
    }
}
