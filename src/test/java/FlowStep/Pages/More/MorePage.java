package FlowStep.Pages.More;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MorePage {
    public static MorePage getInstance(){return new MorePage();}

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0 and @text='More']")
    public MobileElement more_lbl;

}
