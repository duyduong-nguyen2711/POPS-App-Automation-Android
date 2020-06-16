package FlowStep.Pages;

import Common.Config.DriverContext;
import Common.Utils.Log;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected AndroidDriver<MobileElement> driver;
    public BasePage() {
        driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean isDisplayed(MobileElement element) {
        try {
            return element.isDisplayed();
        } catch (Throwable e) {
            return false;
        }
    }

    public String getText(MobileElement element) {
        return element.getText();
    }

    protected void type(MobileElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void click(MobileElement element) {
        element.click();
    }

    public void scrollToElementContainsTextAndClick(String text) {
        try {
            driver.findElementByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector()" +
                            ".textContains(\"" + text + "\").instance(0))").click();

        } catch (Exception ex){
            Log.warn(ex.getMessage());
        }
    }
}
