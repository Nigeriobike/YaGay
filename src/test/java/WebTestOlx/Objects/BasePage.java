package WebTestOlx.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;
    Duration timeToWait = Duration.ofSeconds(5);
    //cons
    public BasePage(WebDriver driver){this.driver=driver;}
    //
    protected WebElement getElByXpath(String xpath) {
        return (new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
    }
    protected List<WebElement> getElsByXpath(String xpath) {
        return (new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))));
    }
    public WebElement waitForElementClick(String element) {
       return ( new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(element))));
    }


}

