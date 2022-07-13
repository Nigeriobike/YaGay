package WebTestOlx.Tests;

import WebTestOlx.Objects.OlxObjHomePageHelper;
import WebTestOlx.Objects.OlxObjLogPageHelper;
import WebTestOlx.Objects.OlxObjSearchPage;
import WebTestOlx.Objects.OlxObjSearchPageHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestHomePage extends TestInit {
    @Test
    void checkSearch ()
    {

        goToOlx();
        homePageC().getLogClick();
        logPageC().loginIn();
        goToOlx();
        homePageC().searchClick("pixel 5");
        String a1 = searchPageC().getAtrebuteText(7);
        System.out.println(a1);

        /*olxObjHomePageHelper.searchClick("pixel 5");
        OlxObjSearchPageHelper olxObjSearchPageHelper = new OlxObjSearchPageHelper(driver);
        olxObjSearchPageHelper.getSortClick();*/


        //olxObjSearchPageHelper.getCategoriClick();
        //WebDriverWait wait = new WebDriverWait(driver,10);
        //sleep(20);
        //WebElement serchButton = wait.until(olxSearchPage.getSort().isDisplayed())
        //if(Assert.assertTrue(olxSearchPage.getSort().isDisplayed())){}
        //Assert.assertTrue(olxSearchPage.getSort().isDisplayed());

        //driver.findElement(By.xpath("//*[@data-testid='sorting-wrapper']")).click();
        //olxSearchPageHelper.getSortClick();

    }
    //@Test
    void testClick ()
    {
        driver.get("https://www.olx.ua/");
        driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("кукла\n");
        driver.findElement(By.xpath("(//div[@class='css-twyho5'])[2]")).click();
    }

}
