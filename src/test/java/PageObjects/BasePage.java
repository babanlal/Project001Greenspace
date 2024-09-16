package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Example utility method to get the current page title
    public String getPageTitle() {
        return driver.getTitle();
    }

    // Example utility method to get the current URL
    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    // Add more utility methods as needed...
}
