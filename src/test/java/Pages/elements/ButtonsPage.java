package Pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;
import staticvariables.StaticVariables;

public class ButtonsPage extends Methods {

    By ad = By.id("close-fixedban");
    By clickElementsItems = By.xpath("//*[contains(@class,\"collapse show\")]/ul/li");
    By clickMeButton = By.xpath("//*[@class=\"mt-4\"][2]/button");
    By responseDynamicClick = By.id("dynamicClickMessage");
    By doubleClickMe = By.id("doubleClickBtn");
    By getDoubleClickMeMessage = By.id("doubleClickMessage");
    By rightClick = By.id("rightClickBtn");
    By rightClickResponse = By.id("rightClickMessage");

    public ButtonsPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }

    public void clickXAd() {
    	javaExecutorScrollIntoView(ad);
    	click(ad);
    }

    public void clickClickMeButton() {
    	javaExecutorScrollIntoView(clickMeButton);
    	click(clickMeButton);
    }

    public String responseClickMe() {
    	javaExecutorScrollIntoView(responseDynamicClick);
    	return getText(responseDynamicClick);
    }

    public void doubleClickMeButton() {
    	javaExecutorScrollIntoView(doubleClickMe);
    	doubleClick(doubleClickMe);
    }

    public String doubleClickResponse() {
    	javaExecutorScrollIntoView(getDoubleClickMeMessage);
        return getText(getDoubleClickMeMessage);
    }

    public void rightClickButton() {
    	javaExecutorScrollIntoView(rightClick);
    	rightClick(rightClick);
    }

    public String getRightClickResponse() {
    	javaExecutorScrollIntoView(rightClickResponse);
        return getText(rightClickResponse);
    }

    public void chooseElementsMenu(String elementsMenuList) {
        int i = arrayListToInt(StaticVariables.ELEMENTS_MENU, elementsMenuList);
        javaExecutorScrollIntoView(clickElementsItems);
        clickActionsWithIndex(clickElementsItems,i);
    }
}

