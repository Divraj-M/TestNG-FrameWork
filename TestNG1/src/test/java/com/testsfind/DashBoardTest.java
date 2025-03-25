package com.testsfind;
 
 import org.testng.Assert;
 import org.testng.annotations.Test;
 
 import com.pages.DashBoardPage;
 import com.pages.LoginPage;
 
 public class DashBoardTest extends BaseTest {
 	LoginPage objLogin;
 	DashBoardPage objDashBoardPage;
   @Test(priority = 0)
   public void DashBoardtest() {
 	  objLogin=new LoginPage(driver);
 	  objLogin.login("Admin", "admin123");
 	  objDashBoardPage=new DashBoardPage(driver);
 	  Assert.assertTrue(objDashBoardPage.getHomePagetext().contains("Dashboard"));
   }
 }