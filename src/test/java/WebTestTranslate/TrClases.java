package WebTestTranslate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TrClases {
    WebDriver driver;

    public TrClases (WebDriver driver)
    {
        this.driver=driver;
    }
    void returnKey(String s)
    {
        driver.findElement(By.xpath(s)).sendKeys(Keys.RETURN);
    }
    void driverFindClick (String s){
        driver.findElement(By.xpath(s)).click();
    }
    void driverFindSendKeys(String path , String txt)
    {
        driver.findElement(By.xpath(path)).sendKeys(txt);
    }
    void driverFindSendKeysReturn(String path , String txt)
    {
        driver.findElement(By.xpath(path)).sendKeys(txt);
        driver.findElement(By.xpath(path)).sendKeys(Keys.RETURN);
    }
    void sleep(int s)
    {
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
