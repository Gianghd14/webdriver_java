package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OptionForBuyPage {
    private WebDriver driver;

    public OptionForBuyPage(WebDriver driver){
        this.driver = driver;
    }

    public CheckoutPage clicktoCheckout(){
        chooseQuantity();
        selectSize();
        selectColor();
        addtoCart();
        proceed();
        return new CheckoutPage(driver);
    }

    private void chooseQuantity(){
        driver.findElement(By.id("quantity_wanted")).clear();
        driver.findElement(By.id("quantity_wanted")).sendKeys("3");
    }
    private void selectSize(){
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='group_1']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("L");
    }
    private void selectColor(){
        driver.findElement(By.id("color_8")).click();
    }
    private void addtoCart(){
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
    }
    private void proceed(){
        driver.findElement
                (By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span"))
                .click();
    }
}
