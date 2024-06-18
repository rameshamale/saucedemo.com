package Pages.alertframeanwindows;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;
import staticvariables.StaticVariables;

public class BrowserWindowPage extends Methods {
    By browserwindow = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");
    By newTab = By.id("tabButton");
    By newWindow=By.id("windowButton");
    By newWindowMessage=By.id("messageWindowButton");
    By title=By.id("sampleHeading");

    public BrowserWindowPage(WebDriver driver, WebDriverWait wait, Actions actions) {
       super(driver,wait,actions);
    }

    public void chooseAlertsMenu(String alertsName) {
        int i = ArrayUtils.indexOf(StaticVariables.ALERTS_MENU, alertsName);
        javaExecutorScrollIntoView(browserwindow);
        clickWithIndex(browserwindow,i);
    }

    public void click_new_tab() {
    	javaExecutorScrollIntoView(newTab);
        click(newTab);
    }

    public void click_new_window(){
    	javaExecutorScrollIntoView(newWindow);
        click(newWindow);
    }

    public String returnNewWindowTitle() {
        return getText(title);
    }

    public void clickNewMessage() {
        click(newWindowMessage);
    }
}
