package WebTestOlx.Objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OlxObjLogPageHelper extends OlxObjLogPage{
    //cons
    public OlxObjLogPageHelper(WebDriver driver) {super(driver);}
    //
    public void loginIn() {
        if(getCookies().isDisplayed()){getCookies().click();}
        getUserMailLog().sendKeys("znatov1881@gmail.com");
        getPassMailLog().sendKeys("OlxPass1234554321");
        getPassMailLog().sendKeys(Keys.RETURN);
    }
}
