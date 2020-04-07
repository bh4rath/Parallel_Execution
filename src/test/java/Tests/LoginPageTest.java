package Tests;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    @Test
    @Description("This test case verifies the successful login to linkedin")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest(){
       LoginPage loginpage = homepage.clickSignIn();
       DashBoardPage dashboardpage = loginpage.login("", "");
        Assert.assertTrue(dashboardpage.clickHome(),"true");
        HomePage homePage = dashboardpage.clickSignOut();
        homePage.waitUntilHomeScreenIsDisplayed();
    }
}