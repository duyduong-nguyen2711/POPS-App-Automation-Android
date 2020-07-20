package FlowStep.Pages;

import Common.Config.DriverContext;
import FlowStep.Utils.Wait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected AndroidDriver<MobileElement> driver;
    public BasePage() {
        driver = new DriverContext().getDriver();
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
        Wait.waitUntilElementToBeClickable(element);
        element.click();
    }

    public void scrollToElementContainsTextAndClick(int xOffset, int yOffset) {
        TouchAction t = new TouchAction(new DriverContext().getDriver());
        t.tap(PointOption.point(xOffset, yOffset)).perform();
    }

    public boolean isButtonEnabledToClick(MobileElement button){
        try {
            return button.isEnabled();
        } catch (Throwable e){
            return false;
        }
    }

}
