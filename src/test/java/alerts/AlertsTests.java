package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {

    @Test
    public void alert_AcceptAlertTest(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        assertEquals(alertsPage.getAlertText(),"I am a JS Alert","incorrect alert text");

        alertsPage.acceptAlert();
        assertEquals(alertsPage.getAlertResult(),"You successfully clicked an alert","incorrect alert result");
    }

    @Test
    public void confirm_AcceptAlertTest(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.getAlertText(),"I am a JS Confirm","incorrect alert text");

        alertsPage.acceptAlert();
        assertEquals(alertsPage.getAlertResult(),"You clicked: Ok","incorrect alert result");

    }


    @Test
    public void confirm_DismissAlertTest(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.getAlertText(),"I am a JS Confirm","incorrect alert text");

        alertsPage.dismissAlert();
        assertEquals(alertsPage.getAlertResult(),"You clicked: Cancel","incorrect alert result");

    }


    @Test
    public void prompt_SetInputAlertTestWithAccept(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        assertEquals(alertsPage.getAlertText(),"I am a JS prompt","incorrect alert text");

        String text = "hi";
        alertsPage.setAlertInput(text);
        alertsPage.acceptAlert();

        assertEquals(alertsPage.getAlertResult(),"You entered: "+text,"incorrect alert result");
    }


    @Test
    public void prompt_SetInputAlertTestWithDismiss(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        assertEquals(alertsPage.getAlertText(),"I am a JS prompt","incorrect alert text");

        String text = "hi";
        alertsPage.setAlertInput(text);
        alertsPage.dismissAlert();

        assertEquals(alertsPage.getAlertResult(),"You entered: null","incorrect alert result");
    }

}
