package page;


import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By Header=By.xpath("//h1");
    By getStarted=By.xpath("//*[@id='signupModalButton']");

    public HomePage(WebDriver driver) {
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
