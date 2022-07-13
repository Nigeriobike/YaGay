package WebTestOlx.Objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OlxObjHomePageHelper extends OlxObjHomePage{

    //cons
    public OlxObjHomePageHelper(WebDriver driver) {super(driver);}
    //

    public void searchClick(String a){
        getSearch().sendKeys(a);
        getSearch().sendKeys(Keys.RETURN);
    }
    public void getLogClick(){
        getLog().click();
    }
}
