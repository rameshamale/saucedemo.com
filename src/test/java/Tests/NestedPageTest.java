package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class NestedPageTest extends BaseTests{
	
	@Test
	 public void nestedParentPagetest() {

		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Nested Frames");
		nestedPage.switchToParentFrame();
		System.out.println(nestedPage.getTextFromParentFrame());
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		String frameId = (String) jse.executeScript("return frameElement.id");
		System.out.println(frameId);	
	}
	
}
