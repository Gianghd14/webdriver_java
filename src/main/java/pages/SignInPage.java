package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By emailForm = By.id("email");
    private By passwordForm = By.id("passwd");
    private By signinBtn = By.id("SubmitLogin");
    public SignInPage(WebDriver driver){
        this.driver = driver;
    }
    public void setEmailForm(String email){
        driver.findElement(emailForm).sendKeys(email);
    }
    public void setPasswordForm(String pwd){
        driver.findElement(passwordForm).sendKeys(pwd);
    }
    public AfterSignInPage clickSignInButton(){
        driver.findElement(signinBtn).click();
        return new AfterSignInPage(driver);
    }


}
