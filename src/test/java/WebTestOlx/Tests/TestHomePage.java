package WebTestOlx.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestHomePage extends TestInit {
    String s1;
    @Test
    void likeCheck ()
    {
        goToOlx();
        homePageC().getLogClick();
        logPageC().loginIn();
        sleep(5);
        goToOlx();
        homePageC().searchClick("pixel 5");
        //searchPageC().enableCheck();
        searchPageC().likeAndCheck();
    }
    //@Test
    void check(){

    }
}
