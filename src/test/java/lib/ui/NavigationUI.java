package lib.ui;

import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class NavigationUI extends MainPageObject {
    protected static  String
            MY_LISTS_LINK,
            OPEN_NAVIGATION,
            CLICK_LIST;


    public NavigationUI(RemoteWebDriver driver) {
        super(driver);
    }

    public void openNavigation() {
        if(Platform.getInstance().isMw()) {
            this.waitForElementAndClick(OPEN_NAVIGATION, "Cannot find and click navigation button", 5);
        } else {
            System.out.println("Method openNavigation() do nothing for platform " + Platform.getInstance().getPlatformVar());
        }
    }

    public void  clickMyLists(){

        if (Platform.getInstance().isMw()) {
            this.tryClickElementWithFewAttempts(
                    MY_LISTS_LINK,
                    "Cannot find navigation button to My list",
                    5
            );
        } else {

            this.waitForElementAndClick(
                    MY_LISTS_LINK,
                    "Cannot find navigation button to My list",
                    5);
        }
    }
}
