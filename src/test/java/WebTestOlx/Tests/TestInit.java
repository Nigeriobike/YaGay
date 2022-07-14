package WebTestOlx.Tests;

import WebTestOlx.Objects.OlxObjHomePageHelper;
import WebTestOlx.Objects.OlxObjLogPageHelper;
import WebTestOlx.Objects.OlxObjSearchPageHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestInit {
    WebDriver driver;
    Actions action ;
    private String website = "https://www.olx.ua/";
    void goToOlx()
    {
        driver.get(website);
    }



    @BeforeMethod
    void setupTest()
    {
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        driver.manage().window().maximize();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        //Set implicit wait:
        //wait for WebElement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //wait for loading page
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        //wait for an asynchronous script to finish execution
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
    }
    //
   @AfterMethod
    void tearDown()
    {
        //driver.quit();
    }

    //
    void sleep(int s)
    {
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    //drivers
    protected OlxObjLogPageHelper logPageC(){
        return new OlxObjLogPageHelper(driver);
    }
    protected OlxObjHomePageHelper homePageC(){
        return new  OlxObjHomePageHelper(driver);
    }
    protected OlxObjSearchPageHelper searchPageC(){
        return new OlxObjSearchPageHelper(driver);
    }

}
