package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTests {
	@Test
	public void alertTests(){
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Alerts");
        waitTime();
        alertsPage.clickAlertButton();
        alertsPage.acceptAlert();
        alertsPage.clickUntilAlertIsPresent();
        waitTime();
        alertsPage.acceptAlert();
        alertsPage.clickConfirmButton();
        alertsPage.acceptAlert();
        alertsPage.confirmButtonResponse();
        Assert.assertEquals(alertsPage.confirmButtonResponse(), "You selected Ok");
        alertsPage.clickPromptButton();
        alertsPage.enterPromptData("Ramesh");
        alertsPage.acceptAlert();
        Assert.assertEquals(alertsPage.promptResultResponse(), "You entered Ramesh");    }
}