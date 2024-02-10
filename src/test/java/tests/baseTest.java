package tests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class baseTest extends initializeDriver {
     WebDriver driver;
     WebDriverWait wait;
     Actions actions;

    public baseTest() {
        this.driver = getDriver();
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public  boolean isDisplayed(WebElement element){
        try
        {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public WebElement checkElement(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public  void click(WebElement Element){
        WebElement element=checkElement(Element);
        element.click();
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void hover(WebElement element){
        new Actions(driver).moveToElement(element).build().perform();
    }
    public void getWindowHandle(){
        String mainWindowHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
  }
