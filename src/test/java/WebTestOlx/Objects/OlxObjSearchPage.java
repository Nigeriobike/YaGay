package WebTestOlx.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxObjSearchPage extends BasePage{
    //cons
    public OlxObjSearchPage(WebDriver driver){super(driver);}
    //elements
    protected String sortBtn = "//*[@data-testid=\"sorting-icon\"]";
    protected String categoriBtn ="//*[@class=\"css-1qvyz1h\"] ";
    protected String favourAdd ="//*[@data-testid=\"adAddToFavorites\"]";
    protected String favourRemove = "//*[@data-testid=\"adRemoveFromFavorites\"]";
    protected String advertisementType1 = "//*[@data-cy=\"l-card\"]";
    protected String advertisementType2 = "//*[@class=\"offer-wrapper\"]";
    protected String adrevtismentNoLike = "//*[@data-testid='adAddToFavorites']/../../../../..";
    //page
    public WebElement getSort(){
        return getElByXpath(sortBtn);
    }

    public WebElement getCategori() {
        return getElByXpath(categoriBtn);
    }
    //advertisements
    public int getAdvertisementsCount() {
        return getElsByXpath(advertisementType1).size();
    }
    public int getAdvertisementNotLikeCount() {
        return getElsByXpath(adrevtismentNoLike).size();
    }
    public int getFavourCount(){
        return getElsByXpath(favourRemove).size();
    }
    public WebElement getAdvertisement(int a) {
        return getElsByXpath(advertisementType1).get(a);
    }
    public WebElement getAdvertisementNotLike(int a) {
        return getElsByXpath(adrevtismentNoLike).get(a);
    }
    public WebElement getFavour(int a){
        return getElsByXpath(favourAdd).get(a);
    }

}
