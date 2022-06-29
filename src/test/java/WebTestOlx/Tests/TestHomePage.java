package WebTestOlx.Tests;

import WebTestOlx.Objects.OlxObjHomePage;
import org.testng.annotations.Test;


public class TestHomePage extends TestInit {
    @Test
    void checkSearch ()
    {
        OlxObjHomePage olxObjHomePage = new OlxObjHomePage(driver);
        goToOlx();
        olxObjHomePage.getSearch().sendKeys("pixel 5");
    }
}
