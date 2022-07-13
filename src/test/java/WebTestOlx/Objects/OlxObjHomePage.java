package WebTestOlx.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxObjHomePage extends BasePage {
    //cons
    public OlxObjHomePage(WebDriver driver) {super(driver);}
    //
    private String textSearch = "//input[@data-cy=\"homepage_input_textsearch\"]";
    private String logClick = "//*[@data-cy=\"common_link_header_myaccount\"]";
    public WebElement  getSearch() {
        return getElByXpath(textSearch);
    }
    public WebElement getLog(){
        return getElByXpath(logClick);
    }


}
