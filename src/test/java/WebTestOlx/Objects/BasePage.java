package WebTestOlx.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;
    Actions actions;
    Duration timeToWait = Duration.ofSeconds(5);
    //cons
    public BasePage(WebDriver driver){this.driver=driver;}
    //attributes
    protected String text = "\"outerText\"";
    protected String href = "\"href\"";
    protected WebElement getElByXpath(String xpath) {
        return (new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
    }
    protected List<WebElement> getElsByXpath(String xpath) {
        return (new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))));
    }
    protected WebElement waitForElementClick(String element) {
       return ( new WebDriverWait(driver, timeToWait)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(element))));
    }
    protected void scrollToEl(WebElement s){
        Actions a1 = new Actions(driver);
        a1.scrollToElement(s);
    }

}

