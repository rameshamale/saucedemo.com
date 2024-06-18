package Pages.alertframeanwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class FrameHandlePage extends Methods  {
	
	By iFrame1=By.id("frame1");
	By iFrame2=By.id("frame2");
	By sampleHeading=By.id("sampleHeading");
	
	public FrameHandlePage(WebDriver driver, WebDriverWait wait, Actions actions) {
		super(driver,wait,actions);
	}

	public void switchToiframe1() {
		switchToFrame(iFrame1);
	}
    
	public void switchToiframe2() {
		switchToFrame(iFrame2);
	}
	public String getSampleText() {
		return	getText(sampleHeading);
	}
    

}
