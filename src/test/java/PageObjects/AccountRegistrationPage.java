package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage extends BasePage {

    public AccountRegistrationPage(WebDriver driver) 
    {
        super(driver);
    }

    @FindBy(xpath="//input[@name='organization_name']")
    WebElement firstName;

    @FindBy(xpath="//input[@placeholder='Full Name']")
    WebElement fullName;

    @FindBy(xpath="//textarea[@name='description']")
    WebElement textBox;

    @FindBy(xpath="//input[@name='phone']")
    WebElement phoneNum;

    @FindBy(xpath="//input[@name='address']")
    WebElement address;

    @FindBy(xpath="//select[@name='state']")
    WebElement state;

    @FindBy(xpath="//select[@name='city']")
    WebElement city;

    @FindBy(xpath="//input[@name='email']")
    WebElement email;

    @FindBy(xpath="//input[@name='password']")
    WebElement password1;

    @FindBy(xpath="//input[@placeholder='Repeat Password']")
    WebElement password2;

    @FindBy(xpath="//button[@type='submit']")
    WebElement submit;

    public void setFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void setFullName(String fullname) {
        fullName.sendKeys(fullname);
    }

    public void setPhoneNum(String fphonenum) {
        phoneNum.sendKeys(fphonenum);
    }

    public void setDescription(String ftext) {
        textBox.sendKeys(ftext);
    }

    public void setAddress(String faddress) {
        address.sendKeys(faddress);
    }

    public void setState() {
        Select liststate = new Select(state);
        liststate.selectByIndex(1);
    }

    public void setCity() {
        Select listcity = new Select(city);
        listcity.selectByIndex(12);
    }

    public void setEmail(String femail) {
        email.sendKeys(femail);
    }

    public void setPassword1(String fpass) {
        password1.sendKeys(fpass);
    }

    public void setPassword2(String fpass2) {
        password2.sendKeys(fpass2);
    }

    public void submitForm() {
        submit.click();
    }
}
