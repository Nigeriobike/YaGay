package WebTestOlx.Objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxObjSearchPageHelper extends OlxObjSearchPage {
    //cons
    public OlxObjSearchPageHelper(WebDriver driver) {
        super(driver);
    }
    //var
    int count=0;
    //
    public void getSortClick(){
        getSort().click();
    }
    public void getCategoryClick(){
        getCategori().click();
    }
    public void favourClick(int a){
        scrollToEl(getFavour(a));
        getFavour(a).click();
    }
    public String getAttributeText(int a){
        scrollToEl(getAdvertisement(a));
        return getAdvertisement(a).getAttribute(text);
    }
    public String getNotLikeAttributeText(int a){
        scrollToEl(getAdvertisementNotLike(a));
        return getAdvertisementNotLike(a).getAttribute(text);
    }
    public String getHref(int a){
        scrollToEl(getAdvertisement(a));
        return getAdvertisement(a).getAttribute(href);
    }
    public WebElement isLikeEnabled(int i){
        return getElByXpath("(//*[@data-cy=\"l-card\"])["+i+"]//*[contains(@data-testid,\"adAddToFavorites\")]");
    }
    public void checkAndlike(String result){
        for (int i=1; i<getAdvertisementNotLikeCount();i++)
        {
            if(getNotLikeAttributeText(i).contains(result)){
                getFavour(i).click();
            }
        }
    }
    public void changeToNextPage()
    {
            getNextPage().click();
    }
    public void enableCheck(){
        for (int i=1; i<getAdvertisementsCount();i++)
        {
            scrollToEl(getAdvertisement(i));
            if(isLikeEnabled(i).isEnabled()){
                System.out.println(getAttributeText(i));
            }
        }
    }
    public void setRange(String a,String b){
        getRangeFrom().sendKeys(a);
        getRangeTo().sendKeys(b);
        getRangeTo().sendKeys(Keys.RETURN);
        sleep(3);
    }
}
