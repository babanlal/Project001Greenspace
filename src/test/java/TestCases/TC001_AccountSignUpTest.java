package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import TestBase.BaseClass;

public class TC001_AccountSignUpTest extends BaseClass {
    
    @Test
    public void VerifySignup() {
        
        // Navigate to the sign-up page
        HomePage hp = new HomePage(driver);
        hp.clickSignUp();
        
        // Fill out the registration form
        AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
        regPage.setFirstName(randomString(6).toUpperCase());
        regPage.setFullName(randomString(8).toUpperCase());
        regPage.setPhoneNum(randomNumeric(10));
        regPage.setDescription("Sale of plants and seedlings");
        regPage.setAddress("10 Reset Street, Monkel");
        regPage.setEmail(randomAlphaNum(5, 3) + "@gmail.com");
        
        // Generate a random password
        String password = randomAlphaNum(6, 4);
        regPage.setPassword1(password);
        regPage.setPassword2(password);
        
        // Select state and city
        regPage.setState();
        regPage.setCity();
        
        // Submit the form
        //regPage.submitForm();
        
        // Verify the confirmation message
        String confmsg = hp.getConfirmationMsg();
        Assert.assertEquals(confmsg, "Community Garden Coordinator", "Confirmation message does not match!");
    }
}
