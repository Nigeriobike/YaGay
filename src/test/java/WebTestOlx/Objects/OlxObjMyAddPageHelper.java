package WebTestOlx.Objects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

public class OlxObjMyAddPageHelper extends OlxObjMyAddPage{
    public OlxObjMyAddPageHelper(WebDriver driver) {
        super(driver);
    }
    public void skipDoNotShow(){
        /*do{
            sleep(3);
        }
        while (!(getDoNotShowLoc().isDisplayed()));*/
        waitForElementClick(doNotShowLoc);
        getDoNotShowLoc().click();
    }
    public void goToHomePage(){
        getHomePageBtnLoc().click();
    }
}
