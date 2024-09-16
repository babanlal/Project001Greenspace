package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) 
    {
        super(driver);
    }

    @FindBy(xpath="//a[@class='nav-link me-2']")
    WebElement signUp;

    @FindBy(xpath="//a[@class='navbar-brand font-weight-bolder ms-lg-0 ms-3']")
    WebElement textVerify;

    public void clickSignUp() {
        try {
            signUp.click();
        } catch (Exception e) {
            System.out.println("Error clicking SignUp: " + e.getMessage());
        }
    }

    public String getConfirmationMsg() {
        try {
            return textVerify.getText();
        } catch (Exception e) {
            System.out.println("Error retrieving confirmation message: " + e.getMessage());
            return null;
        }
    }
}
