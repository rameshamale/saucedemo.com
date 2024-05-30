package Tests;

import org.testng.annotations.Test;

public class CheckBoxPageTest extends BaseTests {
	

    @Test
    public void testCheckBoxExpansion() {
        homepage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Check Box");
        checkBoxPage.clickcOnHome();
        System.out.println(checkBoxPage.getResultText());
    }
}