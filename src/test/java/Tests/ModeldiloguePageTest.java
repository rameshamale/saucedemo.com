package Tests;

import org.testng.annotations.Test;

public class ModeldiloguePageTest extends BaseTests {
	@Test
	public void smallModelTest() {
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Modal Dialogs");
		modeldilogue.clickSmallModal();
		modeldilogue.smallModalResponse();
		modeldilogue.clickCloseSmallModal();
		
	}	
	@Test
	public void largeModelTest() {
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Modal Dialogs");
		modeldilogue.clickLargeModal();
		modeldilogue.largeModalResponse();
		modeldilogue.clickCloseLargeModal();
	}
	

}
