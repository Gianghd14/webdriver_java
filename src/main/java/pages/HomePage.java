package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
//    private By loginLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignInPage clickSignin(){
        clickLink("Sign in");
        return new SignInPage(driver);
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
