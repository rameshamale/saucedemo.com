package Pages.elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import staticvariables.StaticVariables;

public class LinksPage extends Methods {

    By links= By.xpath("//a[@href='https://demoqa.com']");
    By apiLinks=By.xpath("//a[@href='javascript:void(0)']");
    By responseCode = By.id("linkResponse");

    public LinksPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }
    public void clickLinks(String linkName) {
        int i = arrayListToInt(StaticVariables.ELEMENTS_LINKS_MENU, linkName);
        clickActionsWithIndex(links,i);
    }
    public void clickApiLinks(String linkName) {
        int i = arrayListToInt(StaticVariables.ELEMENTS_API_LINKS_MENU, linkName);
        javaExecutorScrollIntoView(apiLinks);
        clickActionsWithIndex(apiLinks,i);
    }

    public String response() {
        javaExecutorScrollIntoView(responseCode);
        return getText(responseCode);
    }

    public String codes(String code,String text){
        return "Link has responded with staus "+code+" and status text "+text;
    }
}
