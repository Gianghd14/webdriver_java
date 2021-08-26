package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void proceedToCheckout(){
        Actions actions = new Actions(driver);
        //checkout
        WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span"));
        actions.moveToElement(btn).click().perform();

        WebElement btn1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
        actions.moveToElement(btn1).click().perform();

        WebElement term = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
        actions.moveToElement(term).click().perform();

        WebElement btn2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span"));
        actions.moveToElement(btn2).click().perform();

        WebElement btn3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a"));
        actions.moveToElement(btn3).click().perform();

        WebElement btn4 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span"));
        actions.moveToElement(btn4).click().perform();
    }

    public String getAlert(){
        return driver
                .findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']"))
                .getText();
    }
}
