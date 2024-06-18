package Pages.alertframeanwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class NestedPage extends Methods {
	By frame1=By.id("frame1");
	By parentframetext=By.xpath("//body[text()='Parent frame']");
	By childframText=By.cssSelector("body p");
	By childFrame=By.xpath("/html[1]/body[1]/iframe[1]");
	
	public NestedPage(WebDriver driver,WebDriverWait wait, Actions actions ) {
		super(driver, wait,actions);}
	
	public void switchToParentFrame() {
		switchToFrame(frame1);
	}
	public String getTextFromParentFrame() {
		return getText(parentframetext);
	}
	public String getTextFromChildFrame() {
		return getText(childframText);
	}
	public void switchToChildFrame() {
		javaExecutorScrollIntoView(frame1);
		switchToFrameByIndex(1);}
	
}
