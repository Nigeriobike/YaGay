package WebTestTranslate;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.security.Key;

public class TrTestMet {

    void startTestT(String lg , String txt)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

        driver.get("https://translate.google.com/");
        driver.findElement(By.xpath("(//*[@aria-label=\"Другие языки перевода\"])[1]")).click();
        driver.findElement(By.xpath("(//c-wiz/div[2]/div/div[2]/input)[1]")).sendKeys(lg);
        driver.findElement(By.xpath("(//c-wiz/div[2]/div/div[2]/input)[1]")).sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//*[@aria-label=\"Исходный текст\"]")).sendKeys(txt);
        //driver.findElement(By.xpath("//*[@aria-label=\"Исходный текст\"]")).sendKeys(Keys.RETURN);
        //driver.findElement(By.xpath("//*[@aria-label=\"Исходный текст\"]")).
        //returnKey("//*[@aria-label=\"Исходный текст\"]");


    }
    void returnKey(String s)
    {
        //driver.findElement(By.xpath(s)).sendKeys(Keys.RETURN);
    }
}
