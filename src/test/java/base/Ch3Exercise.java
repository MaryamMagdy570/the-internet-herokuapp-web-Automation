package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class Ch3Exercise {

    public WebDriver driver;

    @Test
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(375,812));
        System.out.println(driver.getTitle());

        WebElement inputLink = driver.findElement(By.linkText("Shifting Content"));
        inputLink.click();

        inputLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        inputLink.click();

        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems.size());



        Thread.sleep(2000);
        driver.quit();
    }
}