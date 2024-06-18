package Pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class RadioButtonPage extends Methods {
	
	By yesButton=By.xpath("(//label[normalize-space()='Yes'])[1]");
	By impressiveButton=By.xpath("(//label[@class='custom-control-label'])[2]");
	By response=By.className("mt-3");
	
    public RadioButtonPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }
    public void clickOnYesButton(){
    	javaExecutorScrollIntoView(yesButton);
    	click(yesButton);
    }
    public void clickOnImpressiveButton(){
    	javaExecutorScrollIntoView(impressiveButton);
    	click(impressiveButton);
    }

    public String responseRadioButton(){
        return getText(response);
    }

}
