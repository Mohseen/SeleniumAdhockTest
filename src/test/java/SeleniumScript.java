import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

import java.time.Duration;

public class SeleniumScript {
    WebDriver driver;
    Actions actions;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.gecko.driver", "/Users/mali4/Documents/GitRepo/SeleniumAdhockTest/src/main/resources/drivers/geckodriver");
        driver = new FirefoxDriver();

//        System.setProperty("webdriver.chrome.driver", "/Users/mali4/Documents/GitRepo/SeleniumAdhockTest/src/main/resources/drivers/chromedriver 3");
//        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
    @Test
    public void dragDrop(){
        driver.findElement(By.linkText("Droppable")).click();
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[contains(@src, 'droppable')]"));
        driver.switchTo().frame(iframeElement);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable)
                .build()
                .perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
