package Tests;

import org.testng.annotations.Test;

import Pages.windowHandlesPage;

public class WindowHandlesPageTest extends BaseTests {
	
	@Test
	public void windowHandleTest() 
	{	
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Browser Windows");
		windowhandlepage.clickTabButton();
		
	}

}
