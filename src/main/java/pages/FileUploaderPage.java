package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFileResult = By.id("uploaded-files");


    public FileUploaderPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param absolutePath the complete path for file on your device
     */
    public void uploadFile(String absolutePath){
        driver.findElement(inputField).sendKeys(absolutePath);
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public String getFileUpload(){
        return driver.findElement(uploadedFileResult).getText();
    }
}
