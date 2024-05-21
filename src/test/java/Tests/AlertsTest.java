package Tests;

import org.testng.annotations.Test;

public class AlertsTest extends BaseTests {
	@Test
	public void alertTests(){
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Alerts");	
		alertpage.clickAlertButton();
		alertpage.acceptAlert();
		alertpage.clicktimerAlertButton();
		alertpage.acceptAlert();	
		
		}
	}
