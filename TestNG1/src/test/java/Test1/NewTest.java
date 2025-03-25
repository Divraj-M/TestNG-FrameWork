package Test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	  WebDriver driver = new ChromeDriver();

  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("hard drive");
	  driver.findElement(By.id("nav-search-submit-button")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}