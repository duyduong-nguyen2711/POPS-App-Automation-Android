package FlowStep.Pages.Kids;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class KidsPage {
    public static KidsPage getInstance(){return new KidsPage();}

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0 and @text='Kids']")
    public MobileElement kids_lbl;
}
