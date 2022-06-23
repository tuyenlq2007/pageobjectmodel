
package setup;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.iosHome;
import page.iosSignUpPage;

public class iosSetUp {
    String driverPath = "C:\\geckodriver.exe";
    IOSDriver driver;
    iosHome objBrowserStackHomePage;
    iosSignUpPage objBrowserStackSignUpPage;

    @BeforeTest
    public void setup() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "15");
        caps.setCapability("deviceName", "iPhone 12");
        caps.setCapability("isRealMobile", true);
        caps.setCapability("app", "APP_URL"); //Enter your app url
        caps.setCapability("platformName", "iOS");
        caps.setCapability("build", "Java Vanilla - iOS");
        caps.setCapability("name", "Sample Test Java");
        caps.setCapability("devicelog", true);
        caps.setCapability("network", true);
        driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCaps);

    }

    @Test(priority = 1)
    public void navigate_to_homepage_click_on_getstarted() {
        objBrowserStackHomePage = new iosHome(driver);
        objBrowserStackHomePage.veryHeader();
        objBrowserStackHomePage.clickOnGetStarted();
    }

    @Test(priority = 2)
    public void enter_userDetails() {
        objBrowserStackSignUpPage = new iosSignUpPage(driver);
        objBrowserStackSignUpPage.veryHeader();
        objBrowserStackSignUpPage.enterFullName("TestUser");
        objBrowserStackSignUpPage.enterBusinessEmail("TestUser@gmail.com");
        objBrowserStackSignUpPage.enterPasswrod("TestUserPassword");
    }
}