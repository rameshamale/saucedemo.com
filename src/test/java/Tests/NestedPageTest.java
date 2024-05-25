package Tests;

import org.testng.annotations.Test;

public class NestedPageTest extends BaseTests{
	
	@Test
	 public void nestedParentPagetest() {

		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Nested Frames");	
		nestedPage.switchToParentFrame();
		System.out.println(nestedPage.getTextFromParentFrame());	}
	@Test
	 public void nestedChildPagetest() {
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Nested Frames");	
		nestedPage.switchToChildFrame();
		System.out.println(nestedPage.getTextFromChildFrame());	}
	
}
