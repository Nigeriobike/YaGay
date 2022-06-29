package WebTestOlx.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OlxObjHomePage extends BasePage {
    public OlxObjHomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement  getSearch()
    {
        return driver.findElement(By.xpath("//input[@data-cy=\"homepage_input_textsearch\"]"));
    }


}
