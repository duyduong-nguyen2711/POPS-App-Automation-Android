package FlowStep.Pages.Music;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MusicPage {
    public static MusicPage getInstance(){return new MusicPage();}

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0 and @text='Music']")
    public MobileElement music_lbl;

}
