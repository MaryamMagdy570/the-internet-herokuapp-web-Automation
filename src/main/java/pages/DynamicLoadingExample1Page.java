package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    //private By startButton = By.cssSelector("#start button");
    private By startButton = By.id("start");

    private By loadingIndicator = By.id("loading");
    private By loadedResult = By.id("finish");


    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).findElement(By.tagName("button")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedResult (){
        return driver.findElement(loadedResult).getText();
    }


}
