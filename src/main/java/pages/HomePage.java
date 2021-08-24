package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    //dn formAuthenLink la element co ten la Form...
    private By formAuthenLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    //tao phuong thuc click vao se chuyen toi LoginPage
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenLink).click();
        return new LoginPage(driver);
    }
}
