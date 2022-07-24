package WebTestTranslate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.security.Key;

public class TrTestMet  {
    WebDriver driver;
    TrClases r1;
    @BeforeTest
    void setupTest()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        r1 = new TrClases(driver);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    }

    void startTestT(String lg , String txt)
    {
        driver.get("https://translate.google.com/");
        r1.driverFindClick("(//*[@jsname='zumM6d'])[1]");
        driverFindSendKeysReturn("(//*[@jsname=\"oA4zhb\"])[2]",lg);
        driver.findElement(By.xpath("//textarea")).sendKeys(txt);
    }
    @Test
    void check ()
    {
        startTestT("eng","приведствие");
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
