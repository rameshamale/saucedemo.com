package Tests;

import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.github.javafaker.Faker;

import Methods.Methods;
import Pages.alertframeanwindows.AlertsPage;
import Pages.alertframeanwindows.BrowserWindowPage;
import Pages.alertframeanwindows.FrameHandlePage;
import Pages.elements.ButtonsPage;
import Pages.elements.CheckBoxPage;
import Pages.HomePage;
import Pages.alertframeanwindows.ModalDialogsPage;
import Pages.elements.TextBox;
import Pages.elements.LinksPage;
import Pages.alertframeanwindows.NestedPage;
import Pages.elements.RadioButtonPage;
import Pages.alertframeanwindows.windowHandlesPage;

public class BaseTests {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;
    public HomePage homepage;
    public BrowserWindowPage browserWindowPage;
    public AlertsPage alertsPage;
    public NestedPage nestedPage;
    public FrameHandlePage frameHandlePage;
    public TextBox textBoxPage;
    public CheckBoxPage checkBoxPage;
    public ModalDialogsPage modeldilogue;
    public ButtonsPage buttonsPage;
    public RadioButtonPage radioButtonPage;
    public windowHandlesPage windowhandlepage ;
    public Methods methods;
    public LinksPage linksPage;
    public static final String URL = "https://demoqa.com/";
    public static final String URL1="";
    
    public Faker ukFaker;
    public Faker faker;

    public void waitTime() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
    }

    @BeforeMethod
    public void setup() {
    	
        // Setup ChromeDriver
        // WebDriverManager.chromedriver().setup();
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    	
////        
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu");
//        options.addArguments("--no-sandbox");

        // Initialize WebDriver with ChromeOptions
    	driver = new ChromeDriver();  
        //driver = new ChromeDriver(options);    
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);
        actions = new Actions(driver);
        waitTime();
        homepage=new HomePage(driver, wait, actions);
        browserWindowPage= new BrowserWindowPage(driver, wait, actions);
        alertsPage=new AlertsPage(driver, wait, actions);
        buttonsPage=new ButtonsPage(driver, wait, actions);
        radioButtonPage=new RadioButtonPage(driver, wait, actions);
        methods=new Methods(driver, wait, actions);
        textBoxPage=new TextBox(driver, wait, actions);
        ukFaker=new Faker(new Locale("en-GB"));
        faker=new Faker();
        checkBoxPage=new CheckBoxPage(driver, wait, actions);
        buttonsPage=new ButtonsPage(driver, wait, actions);
        frameHandlePage=new FrameHandlePage(driver, wait, actions);
        modeldilogue=new ModalDialogsPage(driver, wait, actions);
        nestedPage=new NestedPage(driver, wait, actions);
        windowhandlepage=new windowHandlesPage(driver, wait, actions);
        linksPage=new LinksPage(driver, wait, actions);
        methods=new Methods(driver, wait, actions);

    }

    @AfterMethod
    public void tear_down() {
        waitTime();
        driver.quit();
    }
}
