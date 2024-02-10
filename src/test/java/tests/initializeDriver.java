package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class initializeDriver {

    static WebDriver driver;
    static WebDriverWait wait;
    static Actions actions;
    public static final String baseURL="https://useinsider.com/";
    public static   WebDriver initializeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","src/main/Drivers/chromedriver.exe");

        System.setProperty("chromeDriver","src/main/Drivers/chromedriver.exe");
        driver =new ChromeDriver(options);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(baseURL);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return getDriver();
    }
    public static synchronized WebDriver getDriver(){return driver;}

    @BeforeClass
    public static void before(){
        driver=initializeDriver();
    }
    @AfterClass
    public static void tearDown(){driver.quit();}
}
