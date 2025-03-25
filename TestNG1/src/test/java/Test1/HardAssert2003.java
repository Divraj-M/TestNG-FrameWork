package Test1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssert2003 {
	WebDriver driver;
  @Test
  public void testingninja() {
	  driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
	  driver.findElement(By.xpath("//ul[@class=\"dropdown-menu dropdown-menu-right\"]//li[1]//a")).click();
	  String actual="Register Account";
	  String exp=driver.getTitle();
	  Assert.assertEquals(actual, exp);
	  System.out.println("title are same in register");
	  
	 
	  
	  
	  
	  
  }
  @Test
  public void test1()
  {
	  driver.findElement(By.xpath("//div[@id=\"logo\"]//h1//a")).click();
	  String actual1="Your Store";
	  String exp1=driver.getTitle();
	  Assert.assertEquals(actual1, exp1);
	  System.out.println("title are same in home page");
  }
  
  @BeforeTest
  public void beforeTest() {

	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://tutorialsninja.com/demo/");
  }

  @AfterTest
  public void afterTest() {
  }

}
