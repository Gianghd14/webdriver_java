package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AfterSignInPage {
    private WebDriver driver;
    private By womenField = By.linkText("WOMEN");

    public AfterSignInPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickWomenField(){
        driver.findElement(womenField).click();
    }
    public OptionForBuyPage chooseItem(){
        WebElement img = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
        WebElement moreBtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/div[2]/a[2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).moveToElement(moreBtn).click().perform();
        return new OptionForBuyPage(driver);
    }


}
