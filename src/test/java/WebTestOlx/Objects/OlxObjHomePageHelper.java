package WebTestOlx.Objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class OlxObjHomePageHelper extends OlxObjHomePage{

    public OlxObjHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public OlxObjHomePage searchClick(String a){
        getSearch().sendKeys(a);
        getSearch().sendKeys(Keys.RETURN);
        return new OlxObjHomePage(driver);
    }
}
