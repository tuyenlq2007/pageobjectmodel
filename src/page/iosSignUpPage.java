package page;

public class iosSignUpPage {
    IOSDriver driver;
    MobileBy Header = MobileBy.xpath("//h1");
    MobileBy userName = MobileBy.xpath("//*[@id='user_full_name']");
    MobileBy businessEmail = MobileBy.xpath("//*[@id='user_email_login']");
    MobileBy password = MobileBy.xpath("//*[@id='user_password']");

    public iosSignUpPage(IOSDriver driver) {
        this.driver = driver;
    }

    public void veryHeader() {
        String getheadertext = driver.findElement(Header).getText().trim();
        assertEquals("Create a FREE Account", getheadertext);
    }
    public void enterFullName(String arg1) {
        driver.findElement(userName).sendKeys(arg1);
    }
    public void enterBusinessEmail(String arg1) {
        driver.findElement(businessEmail).sendKeys(arg1);
    }
    public void enterPasswrod(String arg1) {
        driver.findElement(password).sendKeys(arg1);
    }
}