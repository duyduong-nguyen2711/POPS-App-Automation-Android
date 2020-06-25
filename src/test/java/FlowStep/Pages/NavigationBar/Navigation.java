package FlowStep.Pages.NavigationBar;

import Common.Config.Settings;
import FlowStep.Pages.Account.AccountPage;
import FlowStep.Pages.BasePage;
import FlowStep.Pages.Comics.ComicsPage;
import FlowStep.Pages.Home.HomePage;
import FlowStep.Pages.Kids.KidsPage;
import FlowStep.Pages.More.MorePage;
import FlowStep.Pages.Music.MusicPage;
import FlowStep.Utils.Wait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Navigation extends BasePage {

    public static Navigation getInstance(){
        return new Navigation();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Home, tab, 1 of 6']")
    MobileElement home_btn;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Comics, tab, 2 of 6']")
    MobileElement comics_btn;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Music, tab, 3 of 6']")
    MobileElement music_btn;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Kids, tab, 4 of 6']")
    MobileElement kids_btn;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='More, tab, 5 of 6']")
    MobileElement more_btn;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Account, tab, 6 of 6']")
    MobileElement account_btn;

    public void navigateToPage(String pageName){
        switch (pageName){
            case "Home":
                click(home_btn);
                Wait.waitUntilElementDisplay(HomePage.getInstance().home_lbl, Settings.SHORT_TIMEOUT_SECOND);

            case "Comisc":
                click(comics_btn);
                Wait.waitUntilElementDisplay(ComicsPage.getInstance().comics_lbl, Settings.SHORT_TIMEOUT_SECOND);

            case "Music":
                click(music_btn);
                Wait.waitUntilElementDisplay(MusicPage.getInstance().music_lbl, Settings.SHORT_TIMEOUT_SECOND);

            case "Kids":
                click(kids_btn);
                Wait.waitUntilElementDisplay(KidsPage.getInstance().kids_lbl, Settings.SHORT_TIMEOUT_SECOND);

            case "More":
                click(more_btn);
                Wait.waitUntilElementDisplay(MorePage.getInstance().more_lbl, Settings.SHORT_TIMEOUT_SECOND);

            case "Account":
                click(account_btn);
                Wait.waitUntilElementDisplay(AccountPage.getInstance().account_lbl, Settings.SHORT_TIMEOUT_SECOND);
        }
    }
}
