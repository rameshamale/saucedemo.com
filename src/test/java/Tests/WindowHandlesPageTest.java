package Tests;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class WindowHandlesPageTest extends BaseTests {
	
	@Test
	public void tabHandleTest() 	{	
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Browser Windows");
		windowhandlepage.clickTabButton();
		System.out.println(methods.getCurrentTab());
		ArrayList<String> alltabs=methods.get_all_tabs();	
		methods.switch_to_tab(alltabs, 1);	
		System.out.println(methods.getCurrentTab());
		System.out.println(windowhandlepage.getTabText());
		
	}
	@Test
	public void windowHandleTest() {
		homepage.chooseHomePageMenu("Alerts, Frame & Windows");
		browserWindowPage.chooseAlertsMenu("Browser Windows");
		windowhandlepage.clickWindowButton();
		System.out.println(methods.getCurrentTab());
		ArrayList<String> alltabs=methods.get_all_tabs();
		methods.switch_to_tab(alltabs, 1);	
		System.out.println(methods.getCurrentTab());
		System.out.println(windowhandlepage.getTabText());

	}

}
