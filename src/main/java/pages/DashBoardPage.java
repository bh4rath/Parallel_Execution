package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {
    private WebDriver driver;
    DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By writeArticleLink = By.xpath("//a[contains(text(),'Write an article')]");
    private By imageIcon = By.xpath("//li[@id='profile-nav-item']");
    private By signOut = By.xpath("//a[@id='ember40']");

    By homeIcon = By.id("feed-tab-icon");

    public boolean clickHome(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(homeIcon)).isDisplayed();
    }

    public HomePage clickSignOut(){
        driver.findElement(imageIcon).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(signOut)).click();
        return new HomePage(driver);
    }
}