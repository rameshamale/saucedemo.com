package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePageTest {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setUp() {
        // Set the path for the ChromeDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver
        driver = new ChromeDriver();

        // Initialize the HomePage object
        homePage = new HomePage(driver);
    }

    @Test
    public void testOpenHomePage() {
        // Open the home page
        homePage.openHomePage("https://demoqa.com/");

        // Add assertions to verify the page title or other elements
        String expectedTitle = "DEMOQA";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }
    @Test
    public void webDriverMethods() {
    	String currentUrl=driver.getCurrentUrl();
    	System.out.println(currentUrl);
    	driver.getPageSource();
    	driver.getPageSource();
    	driver.getWindowHandle();
    	driver.getWindowHandles();
    	driver.manage().deleteAllCookies();
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
