package WebTestOlx.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxSearchPage extends BasePage{
    public OlxSearchPage (WebDriver driver){super(driver);}

    public WebElement getSort(){
        return driver.findElement(By.xpath("//*[@data-testid=\"sorting-icon\"]"));
    }
}
