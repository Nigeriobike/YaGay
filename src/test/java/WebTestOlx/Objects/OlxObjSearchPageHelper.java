package WebTestOlx.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class OlxObjSearchPageHelper extends OlxObjSearchPage {
    //cons
    public OlxObjSearchPageHelper(WebDriver driver) {
        super(driver);
    }
    //
    public void getSortClick(){
        waitForElementClick(sortBtn);
        getSort().click();
    }
    public void getCategoriClick(){
        getCategori().click();
    }
    public void favourClick(int a){
        scrollToEl(getFavour(a));
        getFavour(a).click();
    }
    public String getAtrebuteText(int a){
        return getAdvertisement(a).getAttribute(text);
    }
    public String getHref(int a){
        return getAdvertisement(a).getAttribute(href);
    }

}
