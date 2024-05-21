package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class windowHandlesPage extends Methods {

	By tabButton=By.id("tabButton");
	By windowButton=By.id("windowButton");
	By messageWindowButton=By.id("messageWindowButton");
	
	public windowHandlesPage ( WebDriver driver, WebDriverWait wait, Actions actions){
        super(driver, wait, actions);
    }
	public void clickTabButton() {
		javaExecutorScrollIntoView(tabButton);
		element(tabButton).click();}
	public void clickWindowButton() {
		element(windowButton).click();
	}
	public void clickmessageWindowButton() {
		element(messageWindowButton).click();
	}
	
}
