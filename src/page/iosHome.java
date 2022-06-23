package page;

public class iosHome {
    IOSDriver driver;
    MobileBy Header=MobileBy.id("speedTest");
    MobileBy getStarted=MobileBy.xpath("//XCUIElementTypeButton[@name='ComputeSumButton']");

    public HomePage(IOSDriver driver) {
        this.driver=driver;
    }

    public void veryHeader() {
        String getheadertext=driver.findElement(Header).getText();
        assertEquals("App & Browser Testing Made Easy", getheadertext);
    }
    public void clickOnGetStarted() {
        driver.findElement(getStarted).click();
    }
}
