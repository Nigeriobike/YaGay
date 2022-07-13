package WebTestOlx.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OlxObjLogPage extends BasePage {
    //cons
    public OlxObjLogPage(WebDriver driver) {super(driver);}
    //Elements
    private String userMailLog = "(//*[@id=\"userEmail\"])[1]";
    private String passMailLog = "(//*[@id=\"userPass\"])[1]";
    private String logBtn = "(//*[@class=\"login-button login-button--submit\"])[1]";
    private  String cookies = "//button[@class=\"cookie-close abs cookiesBarClose\"]";
    //gets
    public WebElement getUserMailLog() {
        return getElByXpath(userMailLog);
    }
    public WebElement getPassMailLog() {
        return getElByXpath(passMailLog);
    }
    public WebElement getLogBtn() {
        return getElByXpath(logBtn);
    }
    public WebElement getCookies() {
        return getElByXpath(cookies);
    }
}
