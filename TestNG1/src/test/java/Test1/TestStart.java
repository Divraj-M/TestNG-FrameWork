package Test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestStart {
	WebDriver driver;
	@Test
	public void z()
	{
		System.out.println("log in z successfully");
	}
	
	@Test(priority=1,enabled=false)
	public void c()
	{
		System.out.println("Log in c successfully");
	}
	@Ignore
  @Test(priority=5)
  public void f() {
	  System.out.println("Log in  f successfully");
  }
  
  @Test(priority=4)
  public void a()
  {
	  System.out.println("log in a successfully");
  }
//  @Test
//  public void testassert()
//  {
//	  String str1=new String("TestNG");
//	  String str2=new String("TestNG");
//	  String str3=null;
//	  String str4="TestNG";
//	  String str5="TestNG";
//	  String str6=new String("Not_TestNG");
//	  
//	  int val1=5;
//	  int val2=6;
//	  
//	  Assert.assertSame(str4, str5);
//	  System.out.println("objects are same");
//	  
//	  Assert.assertEquals(str1, str2);
//	  System.out.println("Equal assertion is successful");
//	  
//	 // Assert.assertEquals(str1, str6);
//	  System.out.println("Not equal assert is successfull");
//	  
//	  //check by condition
//	  Assert.assertTrue(val1<val2);
//	  System.out.println("true assert is successfully");
//	  
//	  
//	  //condition false
//	  
//	  Assert.assertFalse(val1>val2);
//	  System.out.println("It is false");
//	  
//	  Assert.assertNotSame(str5, str6);
//	  System.out.println("both are not same");
//  }
//  @Test
//  
//  public void verifytitle()
//  {
//	  String original="Google";
//	  String expected=driver.getTitle();
//	  Assert.assertEquals(original, expected,"Title is not same");
//  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in the before method 1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("in the after method 1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("in the before class method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("in the after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("in the before test");
	   driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.co.in/");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("in the ater test method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In the before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("in the after suite");
  }

}
