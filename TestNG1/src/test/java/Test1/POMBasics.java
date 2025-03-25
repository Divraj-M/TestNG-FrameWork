package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POMBasics {
    WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchBox;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeClass
    public void initPageObjects() {
        PageFactory.initElements(driver, this);
    }

    public void searchFor(String text) {
        searchBox.sendKeys(text);
        searchBox.submit();
    }

    @Test
    public void googleSearchTest() {
        driver.get("https://www.google.com/");
        searchFor("Selenium WebDriver");
    }

  
}