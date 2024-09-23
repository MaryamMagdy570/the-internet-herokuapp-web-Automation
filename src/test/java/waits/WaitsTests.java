package waits;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitsTests extends BaseTests {

    @Test
    public void waitClickTest(){
        var loadingPage = homePage.clickDynamicLoading().clickDynamicLoadingExample1Page();


        loadingPage.clickStartButton();
        assertEquals(loadingPage.getLoadedResult(),"Hello World!","incorrect result");


    }

}
