package FlowStep.Utils;


import Common.Config.DriverContext;
import Common.Utils.Log;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

    public static void waitUntilElementDisplay(MobileElement element, int timeOut) {
        for (int i = 0; i < timeOut; i++) {
            try {
                if (element.isDisplayed() && element.isEnabled())
                    break;
                Thread.sleep(1000);
            } catch (Exception ex) {
                Log.info(ex.getMessage());
            }
        }
    }

    public static void waitUntilElementToBeClickable(MobileElement element){
        new WebDriverWait(DriverContext.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(element));
    }

}
