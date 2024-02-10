package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class careersPage extends basePage {

    public careersPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    @FindBy(css = "li:nth-child(6) > a:nth-child(1)")
    public WebElement company;
    @FindBy(xpath = "//a[normalize-space()='Careers']")
    public WebElement Careers;
    @FindBy(xpath = "//h2[normalize-space()='Our story']")
    public  WebElement ourStroy;
    @FindBy(css = ".big-title.big-title-media.mt-4.mt-lg-0")
    public  WebElement disrupt;


}
