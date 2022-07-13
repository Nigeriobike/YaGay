package WebTestOlx.Objects;

import org.openqa.selenium.WebDriver;

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
        getFavour(a).click();
    }
    public String getAtrebuteText(int a){
        return getAdvertisement(a).getAttribute("outerText");
    }

}
