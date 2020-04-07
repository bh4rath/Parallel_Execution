package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("username");
    private By password = By.id("password");
    private By showLink = By.linkText("Show");
    private By remeberMe = By.xpath("//label[contains(text(),'Remember me')]");
    private By learnMoreLink = By.id("learn_more");
    private By signIn = By.xpath("//button[contains(text(),'Sign in')]");
    private By forgotPasswordLink = By.xpath("//a[contains(text(),'Forgot password?')]");
    private By joinNowLink = By.xpath("//a[contains(text(),'Join now')]");

    public DashBoardPage login(String Username, String Password){
        driver.findElement(username).sendKeys(Username);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(signIn).click();
        return new DashBoardPage(driver);
    }
}
