package WebTestOlx.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxObjSearchPage extends BasePage{
    //cons
    public OlxObjSearchPage(WebDriver driver){super(driver);}
    //elementsLoc
    protected String sortBtn = "//*[@data-testid=\"sorting-icon\"]";
    protected String categoriBtn ="//*[@class=\"css-1qvyz1h\"] ";
    protected String favourAdd ="//*[@data-testid=\"adAddToFavorites\"]";
    protected String favourRemove = "//*[@data-testid=\"adRemoveFromFavorites\"]";
    protected String advertisementType = "//*[@data-cy=\"l-card\"]";
    protected String advertisementType2 = "//*[@class=\"offer-wrapper\"]";
    protected String adrevtismentNoLike = "//*[@data-testid='adAddToFavorites']/../../../../..";
    //range
    protected String rangeFrom = "//*[@aria-labelledby=\"range-from-input-label\"]";
    protected String rangeTo = "//*[@aria-labelledby=\"range-to-input-label\"]";
    protected String nextPage ="//*[@data-cy=\"pagination-forward\"]";
    protected String goToLastPageBtn = "(//*[@data-testid=\"pagination-wrapper\"]//*[contains(@data-testid,\"pagination-list-item\")])[last()]";
    //page

    //webelements
    public WebElement getSort(){
        return getElByXpath(sortBtn);
    }
    public WebElement getCategori() {
        return getElByXpath(categoriBtn);
    }
    public WebElement getAdvertisement(int a) {
        return getElsByXpath(advertisementType).get(a);
    }
    public WebElement getAdvertisementNotLike(int a) {
        return getElsByXpath(adrevtismentNoLike).get(a);
    }
    public WebElement getFavour(int a){
        return getElsByXpath(favourAdd).get(a);
    }
    public WebElement getRangeFrom() {
        return getElByXpath(rangeFrom);
    }
    public WebElement getRangeTo() {
        return getElByXpath(rangeTo);
    }
    public WebElement getNextPage() {return getElByXpath(nextPage);}
    public WebElement getGoToLastPageLoc(){return getElByXpath(goToLastPageBtn);}
    //ints
    //advertisements
    public int getAdvertisementsCount() {
        return getElsByXpath(advertisementType).size();
    }
    public int getAdvertisementNotLikeCount() {
        return getElsByXpath(adrevtismentNoLike).size();
    }
    public int getFavourCount(){
        return getElsByXpath(favourRemove).size();
    }
    public int getPagesCount(){return Integer.parseInt(getGoToLastPageLoc().getAttribute(text));}



}
