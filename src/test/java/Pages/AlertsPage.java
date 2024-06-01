package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class AlertsPage extends Methods  {
	
	By alertButton=By.id("");
	By timerAlertButton=By.id("timerAlertButton");
	By confirmButton=By.id("confirmButton");
	By promtButton=By.id("promtButton");
	
	public AlertsPage( WebDriver driver, WebDriverWait wait, Actions actions){
        super(driver,wait,actions);
    }
	
	public void clickAlertButton() {
		javaExecutorScrollIntoView(alertButton);
		element(alertButton).click();}
	
	public void clicktimerAlertButton() {
		element(timerAlertButton).click();}
	
	public void clickconfirmButton() {
		element(timerAlertButton).click();}
	
	public void clickpromtButton() {
		element(timerAlertButton).click();}
	
}