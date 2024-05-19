package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class HomePage {
    WebDriver driver;

    // Constructor to initialize the WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Open the browser with the specified URL
    public void openHomePage(String url) {
        driver.get(url);
    }

}
