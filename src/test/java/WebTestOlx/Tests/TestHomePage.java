package WebTestOlx.Tests;

import WebTestOlx.Objects.OlxObjHomePage;
import WebTestOlx.Objects.OlxObjHomePageHelper;
import WebTestOlx.Objects.OlxSearchPage;
import WebTestOlx.Objects.OlxSearchPageHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestHomePage extends TestInit {
    @Test
    void checkSearch ()
    {
        goToOlx();
        OlxObjHomePageHelper olxObjHomePageHelper = new OlxObjHomePageHelper(driver);
        olxObjHomePageHelper.searchClick("кукла");
        //OlxSearchPageHelper olxSearchPageHelper = new OlxSearchPageHelper(driver);
        sleep(5);
        driver.findElement(By.xpath("//*[@data-testid=\"sorting-wrapper\"]")).click();
        //olxSearchPageHelper.getSortClick();

    }
}
