package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By signIn = By.xpath("//a[contains(text(),'Sign in')]");

    public LoginPage clickSignIn(){
        driver.findElement(signIn).click();
        return new LoginPage(driver);
    }

    public void waitUntilHomeScreenIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIn)).isDisplayed();
    }
}