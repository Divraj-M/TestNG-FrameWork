package Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
  @Test 
  @Parameters({"browser"})
  public void parametertest(String browser) {
	  if(browser.equals("chrome")) {
		  driver=new ChromeDriver();
	  }else if(browser.equals("firefox")) {
		  driver=new FirefoxDriver();
		  
	  }else if(browser.equals("edge")) {
		  driver=new EdgeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @Test 
  @Parameters({"val1","val2"})
  public void loginassert(String val1,String val2) {
	  WebElement log=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5"));
	  String text=log.getText();
	  Assert.assertEquals("Login", text);
	  WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	  username.sendKeys(val1);
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys(val2,Keys.ENTER);
}
  
  @Test
  
  public void dash()
  {
	  WebElement dashbo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
	  String text1=dashbo.getText();
	  Assert.assertEquals("Dashboard", text1);
  }
  @AfterTest
  public void beforetest() {
	  driver.quit();
  }
}