package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homePage;
import java.time.Duration;

public class homePageTest extends baseTest {

    WebDriver driver;
    WebDriverWait wait;
    homePage homepage;
    baseTest baseTest;

    public homePageTest() {
        this.baseTest = new baseTest();
        this.driver= getDriver();
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        this.homepage=new homePage(driver,wait);

    }
    @Test
    public void checkHomepage(){
       baseTest.click(homepage.cookies);
        Assertions.assertAll(
                () -> Assertions.assertTrue(baseTest.isDisplayed(homepage.announce1)),
                () -> Assertions.assertTrue(baseTest.isDisplayed(homepage.announce2))
        );
    }
}
