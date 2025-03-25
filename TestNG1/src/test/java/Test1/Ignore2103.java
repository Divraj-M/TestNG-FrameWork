package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Ignore2103 {
	WebDriver driver;
	@Test
	public void z()
	{
		System.out.println("log in z successfully");
	}
	
	@Test()
	public void c()
	{
		System.out.println("Log in c successfully");
		driver.findElement(By.xpath("googles"));
	}
  @Test(dependsOnMethods= {"c"})
  public void f() {
	  System.out.println("Log in  f successfully");
  }
  
  @Test(dependsOnMethods= {"f"})
  public void a()
  {
	  System.out.println("log in a successfully");
  }}
