package com.testsfind;
 
 import java.time.Duration;
 
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
 import com.pages.DashBoardPage;
 import com.pages.LoginPage;
 
 public class BaseTest {
 	public static WebDriver driver;
 	LoginPage objLogin;
 	DashBoardPage objDashBoardPage;
 	
 	@BeforeMethod
 	public void setup() {
 		ChromeOptions options=new ChromeOptions();
 		options.addArguments("--headless");
 		options.addArguments("--remote-allow-origins=*");
 		driver=new ChromeDriver(options);
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 	}
 	
 	@AfterMethod
 	public void close() {
 		driver.close();
 	}
 }