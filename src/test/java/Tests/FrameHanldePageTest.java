package Tests;

import org.testng.annotations.Test;

public class FrameHanldePageTest extends BaseTests {
	
	@Test 
	public void iframe1Test() {
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Frames");	
		frameHandlePage.switchToiframe1();
		System.out.println(frameHandlePage.getSampleText());
	}
	@Test
	public void iframe2Test() {
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Frames");	
		frameHandlePage.switchToiframe2();
		System.out.println(frameHandlePage.getSampleText());
	}
	
	

}
