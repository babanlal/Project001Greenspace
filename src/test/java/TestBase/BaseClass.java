package TestBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void setup()
    {
  //  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\New chromedriver\\chromedriver-win64\\chromedriver.exe");
    driver = new FirefoxDriver();
    
    /*
//    @Parameters("browser")
    public void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\selenium\\New chromedriver\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "E:\\selenium\\Geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "E:\\selenium\\edge  jar file\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        */
    	driver.get("http://campus.sicsglobal.co.in/Project/communitygarden/index.php");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        

        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());
    }

    @AfterClass
    public void afterClass() 
    {
        if (driver != null) 
    	{
            driver.quit();
        }
    }

    public String randomString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public String randomNumeric(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public String randomAlphaNum(int alphaLength, int numLength) {
        return RandomStringUtils.randomAlphabetic(alphaLength) + "@" + RandomStringUtils.randomNumeric(numLength);
    }
}
