package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class CheckBoxPage extends Methods {
	
    By home = By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-uncheck'])[1]");
    By result=By.id("result");
    
    public CheckBoxPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }
    public void clickcOnHome() {
    	javaExecutorScrollIntoView(home);
    	click(home);
    }
    public String getResultText() {
    	return getText(result);
    }
    
}
