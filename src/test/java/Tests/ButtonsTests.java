package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTests {

    @Test
    public void testClickButtons() {
        homepage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Buttons");
        buttonsPage.clickClickMeButton();
        waitTime();
        buttonsPage.doubleClickMeButton();
        waitTime();
        buttonsPage.rightClickButton();

      
        Assert.assertEquals(buttonsPage.responseClickMe(), "You have done a dynamic click");
        Assert.assertEquals(buttonsPage.doubleClickResponse(), "You have done a double click");
        Assert.assertEquals(buttonsPage.getRightClickResponse(),"You have done a right click");

    }



}
