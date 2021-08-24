package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        // cho he thong biet vi tri file chromedriver
        System.setProperty("webdriver.chrome.driver","resources/chromedriver_linux64/chromedriver");
        // khoi tao webdriver
        driver = new ChromeDriver();
        //truy cap toi URL
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

        /**
//        driver.manage().window().setSize(new Dimension(375,812));
        System.out.println(driver.getTitle());
        //tuong tac tren page, tim phan tu co the la a
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        // tương tác trên page, tìm đường link tên là Shif...
        driver.findElement(By.linkText("Shifting Content")).click();

        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        //findElements trả về 1 list các elements
        List<WebElement> count = driver.findElements(By.tagName("li"));
        System.out.println(count.size());
//        WebElement link = driver.findElement(By.linkText("Library"));
//        link.click();
         **/
//        driver.quit();
    }

    @AfterClass
    public void endScenario(){
        driver.quit();
    }

}
