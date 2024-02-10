package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.careersPage;
import java.time.Duration;

public class careersTest extends baseTest {

    WebDriver driver;
    WebDriverWait wait;
    careersPage careersPage;
    baseTest baseTest;


    public careersTest() {
        this.baseTest = new baseTest();
        this.driver = getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.careersPage = new careersPage(driver,wait);

    }

    @Test
    public void navigateCareers(){
        baseTest.click(careersPage.company);
        baseTest.click(careersPage.Careers);
    }
    @Test
    public void checkPage(){
        navigateCareers();
        Assertions.assertAll(
                ()-> Assertions.assertTrue(baseTest.isDisplayed(careersPage.ourStroy)),
                ()-> Assertions.assertTrue(baseTest.isDisplayed(careersPage.disrupt))
        );
    }

}
