package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class NestedPage extends Methods {
	By frame1=By.id("frame1");
	By parentframetext=By.xpath("//body[text()='Parent frame']");
	By childframe=By.xpath("//p[normalize-space()='Child Iframe']");
	
	
	public NestedPage(WebDriver driver,WebDriverWait wait, Actions actions ) {
		super(driver, wait,actions);}
	
	public void switchToParentFrame() {
		switchToFrame(frame1);
	}
	public String getTextFromParentFrame() {
		return getText(parentframetext);
	}
	public String getTextFromChildFrame() {
		return getText(childframe);
	}
	public String switchToChildFrame() {
		return getText(childframe);
	}
	
	
}
