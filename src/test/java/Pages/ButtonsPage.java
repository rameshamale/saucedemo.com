package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Methods.Methods;
import staticvariables.StaticVariables;

public class ButtonsPage extends Methods {
	By ad = By.id("close-fixedban");
    By clickElementsItems = By.xpath("//*[contains(@class,\"collapse show\")]/ul/li");
	By doubleClickBtn=By.id("doubleClickBtn");
	By doubleClickMessage=By.id("doubleClickMessage");
	By rightClickBtn=By.id("rightClickBtn");
	By rightClickMessage=By.id("rightClickMessage");
	By dyanamicClick=By.xpath("(//button[@Class='btn btn-primary'])[3]");
	By dynamicClickMessage=By.id("dynamicClickMessage");
	
	public ButtonsPage(WebDriver driver, WebDriverWait wait, Actions actions) {
		super(driver,wait,actions);	
	}
	public void doubleClick() {
		javaExecutorScrollIntoView(doubleClickBtn);
		doubleClick(doubleClickBtn);
	}
	public String doubleClickMessage() {
		return getText(doubleClickMessage);
	}
	public void rightClickBtn() {
		javaExecutorScrollIntoView(rightClickBtn);
		rightClick(rightClickBtn);
	}
	public String rightClickMessage() {
		return getText(rightClickMessage);
	}
	public void dyanamicClick() {
		javaExecutorScrollIntoView(dyanamicClick);
		click(dyanamicClick);
	}
	public String dynamicClickMessage() {
		return getText(dynamicClickMessage);
		
	}
	
	public void chooseElementsMenu(String elementsMenuList) {
        int i = arrayListToInt(StaticVariables.ELEMENTS_MENU, elementsMenuList);
        javaExecutorScrollIntoView(clickElementsItems);
        clickActionsWithIndex(clickElementsItems,i);
    }

	
}