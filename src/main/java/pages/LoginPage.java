package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameForm = By.id("username");
    private By pwForm = By.id("password");
    private By button = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsernameForm(String username){
        driver.findElement(usernameForm).sendKeys(username);
    }
    public void setPwForm(String password){
        driver.findElement(pwForm).sendKeys(password);
    }

    public SecureAreaPage clickButtonLogin(){
        driver.findElement(button).click();
        return new SecureAreaPage(driver);
    }
}
