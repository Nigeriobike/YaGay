package WebTestYt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;


public class YtTestMet {
    //*[@id="search"]
    void runYt () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("gay");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.RETURN);

    }
    /*void search(String a){
        runYt();
        //WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(a);
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.RETURN);
    }*/
}
