package login;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest extends BaseTests {

    @Test
    public void LoginTest(){
        LoginPage loginPage = homePage.clickLoginLink();
        loginPage.setUsernameForm("tomsmith");
        loginPage.setPwForm("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickButtonLogin();
        String noti = secureAreaPage.getNoti();
        Assert.assertTrue(noti.contains("You logged into a secure area!"),"Can't login");

    }

}
