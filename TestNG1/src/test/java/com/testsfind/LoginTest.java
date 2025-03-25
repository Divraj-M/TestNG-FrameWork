package com.testsfind;
 
 import org.testng.Assert;
 import org.testng.annotations.Test;
 
 import com.pages.LoginPage;
 
 public class LoginTest extends BaseTest {
 	LoginPage objLogin;
 	
   @Test(priority = 0)
   public void loginTest() {
 	  objLogin=new LoginPage(driver);
 	  String loginPageTitle=objLogin.getLoginTitle();
 	  Assert.assertTrue(loginPageTitle.contains("Login"));
   }
 }