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
    protected String advertisement = "//*[@data-cy=\"l-card\"]";

    //page
    public WebElement getSort(){
        return getElByXpath(sortBtn);
    }

    public WebElement getCategori() {
        return getElByXpath(categoriBtn);
    }
    //advertisements
    public int getAdvertisementsCount() {
        return getElsByXpath(advertisement).size();
    }
    public WebElement getAdvertisement(int a) {
        return getElsByXpath(advertisement).get(a-1);
    }
    public WebElement getFavour(int a){
        return getElsByXpath(favourAdd).get(a-1);
    }

}
