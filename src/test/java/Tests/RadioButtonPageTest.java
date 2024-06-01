package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonPageTest extends BaseTests {
	
	@Test
	public void yesButtonTest() {
        homepage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Radio Button");
        waitTime();
        radioButtonPage.clickOnYesButton();
        waitTime();
        Assert.assertEquals(radioButtonPage.responseRadioButton(),"You have selected Yes"); 
	}
	@Test
	public void impressiveButtonTest() {
	    homepage.chooseHomePageMenu("Elements");
	    buttonsPage.chooseElementsMenu("Radio Button");
	    waitTime();
	    radioButtonPage.clickOnImpressiveButton(); // Assuming there's a method to click on the Impressive button
	    waitTime();
	    Assert.assertEquals(radioButtonPage.responseRadioButton(),"You have selected Impressive");
	}


}
