package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderStart2503 {
	WebDriver driver;
  @DataProvider(name="testData")
  public Object[][] dataProvFunc()
  {
	  return new Object[][]{{"Selenium"},{"TestNG"}};
  }
  @BeforeMethod
  public void setup()
  {
	  System.out.println("start the test");
	  driver=new ChromeDriver();
	  driver.get("https://www.bing.com/");
	  driver.manage().window().maximize();
  }
  @Test(dataProvider="testData")
  public void search(String keyword)
  {
	  WebElement txtbox=driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]"));
	  txtbox.sendKeys(keyword);
	  System.out.println("Keyword entered :"+keyword);
	  txtbox.sendKeys(Keys.ENTER);
	  System.out.println("search result is displayed");
	  
  }
  
  @AfterMethod
  public void teardown()
  {
	  driver.close();
	  System.out.println("End the test");
  }
  
  
  
  
}
