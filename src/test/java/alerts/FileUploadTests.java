package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void uploadFileTest(){
        var fileUploaderPage = homePage.clickFileUploaderPage();

        String fileName = "New Text Document.txt";
        String fileAbsolutePath = "D:\\New Text Document.txt";

        fileUploaderPage.uploadFile(fileAbsolutePath);
        fileUploaderPage.clickUploadButton();

        assertEquals(fileUploaderPage.getFileUpload(),fileName,"wrong file uploaded");

    }

}
