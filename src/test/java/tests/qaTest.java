package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.homePage;
import pages.qaPage;
import java.time.Duration;

public class qaTest extends baseTest{
    WebDriver driver;
    WebDriverWait wait;
    qaPage qaPage;
    baseTest baseTest;
    homePage homePage;
    private  static final String qaPagePrefix="careers/quality-assurance/";

    public qaTest(){
        this.baseTest=new baseTest();
        this.driver=getDriver();
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.qaPage = new qaPage(driver,wait);
        this.homePage=new homePage(driver,wait);
    }

    @Test
    public void navigateQA(){
        driver.get(baseURL+qaPagePrefix);
        Assertions.assertEquals(baseURL+qaPagePrefix,driver.getCurrentUrl());
        baseTest.click(qaPage.qaJobs);
       // baseTest.click(homePage.cookies);
    }

    @Test
    public void checkJobList(){
        navigateQA();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        baseTest.click(qaPage.filterByLocation);
        baseTest.click(qaPage.locationIstanbulTurkiye);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("Istanbul, Turkey",qaPage.checkLocation.getAttribute("title"));
        Assertions.assertEquals("Quality Assurance",qaPage.department.getAttribute("title"));
    }

    @Test
    public void checkPositionContains(){
        checkJobList();
        baseTest.scrollToElement(qaPage.browseOpenPositions);
        Assertions.assertAll(
                ()->    Assertions.assertEquals("Quality Assurance",qaPage.positionContains1.getText()),
                ()->    Assertions.assertEquals("Quality Assurance",qaPage.positionContains2.getText()),
                ()->    Assertions.assertEquals("Quality Assurance",qaPage.positionContains3.getText()),
                ()->    Assertions.assertEquals("Istanbul, Turkey",qaPage.positionLocations1.getText()),
                ()->    Assertions.assertEquals("Istanbul, Turkey",qaPage.positionLocations2.getText()),
                ()->    Assertions.assertEquals("Istanbul, Turkey",qaPage.positionLocations3.getText())
        );
    }
    @Test
    public void clickToViewRole(){
        checkPositionContains();
        baseTest.hover(qaPage.viewRole);
        baseTest.click(qaPage.viewRoleBtn);
        baseTest.getWindowHandle();
        Assertions.assertTrue(baseTest.isDisplayed(qaPage.checkThisJob));
        baseTest.click(qaPage.checkThisJob);
        Assertions.assertTrue(baseTest.isDisplayed(qaPage.appFormPage));
    }

}
