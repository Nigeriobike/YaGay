package WebTestOlx.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxObjMyAddPage extends BasePage{
    public OlxObjMyAddPage(WebDriver driver) {
        super(driver);
    }

    protected String doNotShowLoc = "//*[contains(text(),\"Не показувати протягом тижня\")]";
    protected String homePageBtnLoc = "(//*[contains(@class,\"app-header\")]//a)[1]";

    protected WebElement getDoNotShowLoc(){
        return getElByXpath(doNotShowLoc);
    }
    protected WebElement getHomePageBtnLoc(){
        return getElByXpath(homePageBtnLoc);
    }
}
