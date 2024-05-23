package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Methods.Methods;
import Pages.AlertsPage;
import Pages.BrowserWindowPage;
import Pages.HomePage;
import Pages.windowHandlesPage;

public class BaseTests {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;
    public HomePage homepage;
    public BrowserWindowPage browserWindowPage;
    public AlertsPage alertpage;
    public windowHandlesPage windowhandlepage ;
    public Methods methods;
    public static final String URL = "https://demoqa.com/";
    public static final String URL1="";
    
    
    public void waitTime() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();    
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);
        actions = new Actions(driver);
        waitTime();
        homepage=new HomePage(driver, wait, actions);
        browserWindowPage= new BrowserWindowPage(driver, wait, actions);
        windowhandlepage=new windowHandlesPage(driver, wait, actions);
        alertpage=new AlertsPage(driver, wait, actions); 
        methods=new Methods(driver, wait, actions);
    
    }

    @AfterMethod
    public void tear_down() {
        waitTime();
        driver.quit();
    }
}
