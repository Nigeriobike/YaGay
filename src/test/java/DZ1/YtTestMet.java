package DZ1;

import WebTestTranslate.TrClases;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class YtTestMet {
    WebDriver driver;
    //*[@id="search"]
    void setupTest()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    }

    void runYt () throws InterruptedException {
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Ван Даркхолм сидит и молчит");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.RETURN);
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//*[contains(@aria-label,\"Ван Даркхолм сидит и молчит\")])[1]")).click();

    }
    /*void search(String a){
        runYt();
        //WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(a);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.RETURN);
    }*/
}
