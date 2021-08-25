package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");


    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
//    public void selectDropdown(String option){
//        Select dropdownElement = new Select(driver.findElement(dropdown));
//        dropdownElement.selectByVisibleText(option);
//    }
//
//    public

}
