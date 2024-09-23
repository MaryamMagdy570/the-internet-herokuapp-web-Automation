package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By alertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By confirmButton = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By promptButton = By.xpath(" //button[contains(text(),'Click for JS Prompt')]");
    private By alertResult = By.id("result");


    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }


    //////////////////////////////////////////////////////

    public void triggerAlert() {
        driver.findElement(alertButton).click();
    }

    public void triggerConfirm() {
        driver.findElement(confirmButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(promptButton).click();
    }

    public String getAlertResult() {
        return driver.findElement(alertResult).getText();
    }


    //////////////////////////////////////////////////////
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void setAlertInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }


}