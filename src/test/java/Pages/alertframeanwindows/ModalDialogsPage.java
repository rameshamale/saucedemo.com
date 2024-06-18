package Pages.alertframeanwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.Methods;

public class ModalDialogsPage extends Methods {

    By smallModalButton= By.id("showSmallModal");
    By largeModalButton=By.id("showLargeModal");
    By smallResponse=By.id("example-modal-sizes-title-sm");
    By largeResponse=By.id("example-modal-sizes-title-lg");
    By closeSmallModal=By.id("closeSmallModal");
    By closeLargeModal=By.id("closeLargeModal");

    public ModalDialogsPage(WebDriver driver, WebDriverWait wait, Actions actions){
      super(driver,wait,actions);
    }

    public void clickSmallModal(){
    	javaExecutorScrollIntoView(smallModalButton);
    	click(smallModalButton);
    }
    public void clickLargeModal(){
    	javaExecutorScrollIntoView(largeModalButton);
    	click(largeModalButton);
    }
    public void clickCloseSmallModal() {
    	javaExecutorScrollIntoView(closeSmallModal);
        click(closeSmallModal);
    }
    public String smallModalResponse(){
    	javaExecutorScrollIntoView(smallResponse);
        return getText(smallResponse);
    }
    public String largeModalResponse(){
    	javaExecutorScrollIntoView(largeResponse);
        return getText(largeResponse);
    }
    public void clickCloseLargeModal(){
        click(closeLargeModal);
    }
}
