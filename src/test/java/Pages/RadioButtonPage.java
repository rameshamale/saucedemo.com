package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class RadioButtonPage extends Methods {
	
	By yesButton=By.xpath("(//label[normalize-space()='Yes'])[1]");
	By impressiveButton=By.xpath("(//label[normalize-space()='Impressive'])[1]");
	By response=By.className("mt-3");
	
    public RadioButtonPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }
    public void clickOnYesButton(){
    	javaExecutorScrollIntoView(yesButton);
    	click(yesButton);
    }
    public void clickOnImpressiveButton(){
        click(impressiveButton);
    }

    public String responseRadioButton(){
        return getText(response);
    }

}
