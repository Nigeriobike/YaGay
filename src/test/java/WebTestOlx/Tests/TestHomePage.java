package WebTestOlx.Tests;

import org.testng.annotations.Test;


public class TestHomePage extends TestInit {
    String search="pixel 5";
    String range1="5000";
    String range2="10000";
    @Test
    void likeCheck ()
    {
        goToOlx();
        homePageC().getLogClick();
        logPageC().loginIn();
        myAddPageC().skipDoNotShow();
        myAddPageC().goToHomePage();
        homePageC().searchClick(search);
        searchPageC().setRange(range1,range2);
        for (int i =0;i<searchPageC().getPagesCount();i++){
            searchPageC().checkAndlike(search);
            if(i< searchPageC().getPagesCount()-1){
                searchPageC().changeToNextPage();
            }
        }
    }
    //@Test
    void check(){

    }
}
