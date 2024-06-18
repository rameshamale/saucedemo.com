package Pages.alertframeanwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class windowHandlesPage extends Methods {

	By tabButton=By.id("tabButton");
	By windowButton=By.id("windowButton");
	By messageWindowButton=By.id("messageWindowButton");
    By tabText = By.xpath("//h1[text()='This is a sample page']");

	
	public windowHandlesPage ( WebDriver driver, WebDriverWait wait, Actions actions){
        super(driver, wait, actions);
    }
	public void clickTabButton() {
		javaExecutorScrollIntoView(tabButton);
		element(tabButton).click();}
	public void clickWindowButton() {
		javaExecutorScrollIntoView(windowButton);
		element(windowButton).click();
	}
	public void clickmessageWindowButton() {
		javaExecutorScrollIntoView(messageWindowButton);
		element(messageWindowButton).click();
	}
	public String getTabText() {
		javaExecutorScrollIntoView(tabText);
		return getText(tabText);}
	

}
