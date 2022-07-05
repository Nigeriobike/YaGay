package WebTestOlx.Objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OlxSearchPageHelper extends OlxSearchPage{

    public OlxSearchPageHelper(WebDriver driver) {
        super(driver);
    }
    public OlxSearchPage getSortClick(){
        getSort().click();
        return new OlxSearchPageHelper(driver);
    }
}
