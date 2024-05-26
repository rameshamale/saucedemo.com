package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsPageTest extends BaseTests {
	
	@Test
	public void buttonsTest() {
		homepage.chooseHomePageMenu("Elements");
		buttonsPage.chooseElementsMenu("Buttons");
		buttonsPage.doubleClick();
		buttonsPage.rightClickBtn();
		buttonsPage.dyanamicClick();
		
		Assert.assertEquals(buttonsPage.doubleClickMessage(), "You have done a double click");
		Assert.assertEquals(buttonsPage.rightClickMessage(),"You have done a right click");
		Assert.assertEquals(buttonsPage.dynamicClickMessage(), "You have done a dynamic click");}

}
