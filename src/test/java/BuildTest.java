import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BuildTest {
    int bruh = 125;
    @Test
    public void startBr(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
    }
    @Test
    void outToScreen(){
        System.out.println("YaGay");
    }

}
