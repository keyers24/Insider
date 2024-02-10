package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class qaPage extends basePage {
    public qaPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    @FindBy(css = ".btn.btn-outline-secondary.rounded.text-medium.mt-2.py-3.px-lg-5.w-100.w-md-50")
    public WebElement qaJobs;
    @FindBy(css = "[aria-labelledby=\"select2-filter-by-location-container\"]")
    public WebElement filterByLocation;
    @FindBy(xpath = "//ul[@id=\"select2-filter-by-location-results\"]//li[2]")
    public WebElement locationIstanbulTurkiye;
    @FindBy(css = "[id=\"select2-filter-by-location-container\"]")
    public WebElement checkLocation;
    @FindBy(css = "[id=\"select2-filter-by-department-container\"]")
    public WebElement department;
    @FindBy(css = ".col-12.d-flex.flex-column.flex-lg-row.justify-content-lg-between.align-items-lg-end")
    public WebElement browseOpenPositions;
    @FindBy(xpath = "//div[@id='jobs-list']/div[1]//span[@class='position-department text-large font-weight-600 text-primary']")
    public WebElement positionContains1;
    @FindBy(xpath = "//div[@id='jobs-list']//div[2]//span[@class='position-department text-large font-weight-600 text-primary']")
    public WebElement positionContains2;
    @FindBy(xpath = "//div[@id='jobs-list']//div[3]//span[@class='position-department text-large font-weight-600 text-primary']")
    public WebElement positionContains3;
    @FindBy(xpath = "//div[@id='jobs-list']/div[1]//div[@class='position-location text-large']")
    public WebElement positionLocations1;
    @FindBy(xpath = "//div[@id='jobs-list']/div[2]//div[@class='position-location text-large']")
    public WebElement positionLocations2;
    @FindBy(xpath = "//div[@id='jobs-list']/div[3]//div[@class='position-location text-large']")
    public WebElement positionLocations3;
    @FindBy(css = "section[id='career-position-list'] div[class='container'] div[class='row'] div[id='jobs-list'] div:nth-child(1) div:nth-child(1)")
    public WebElement viewRole;
    @FindBy(css = "[href='https://jobs.lever.co/useinsider/78ddbec0-16bf-4eab-b5a6-04facb993ddc']")
    public WebElement viewRoleBtn;
    @FindBy(css = "div[class='postings-btn-wrapper'] a[class='postings-btn template-btn-submit shamrock']")
    public WebElement checkThisJob;
    @FindBy(xpath = "//h4[normalize-space()='Submit your application']")
    public WebElement appFormPage;
}
