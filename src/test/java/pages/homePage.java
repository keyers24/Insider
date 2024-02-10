package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage extends basePage {

    public homePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    @FindBy(css = ".announce-info.d-flex")
    public WebElement announce1;
    @FindBy(xpath = "//p[contains(text(),'Connect data across channels, predict future behavior with AI, and automate cross-channel journeys, as unique as each customer, from a single platform - with the fastest time to value.')]")
    public  WebElement announce2;
    @FindBy(id = "wt-cli-accept-all-btn")
    public WebElement cookies;



}
