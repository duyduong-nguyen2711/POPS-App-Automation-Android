package FlowStep.Pages.Comics;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ComicsPage {
    public static ComicsPage getInstance(){return new ComicsPage();}

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0 and @text='Comics']")
    public MobileElement comics_lbl;

}
