package com.pages;
 
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.testng.annotations.Test;
 
 public class LoginPage {
 	WebDriver driver;
 	By username=By.name("username");
 	By password=By.name("password");
 	By titleText=By.xpath("//h5[text()='Login']");
 	By login=By.xpath("//button[text()=\" Login \"] ");
 	
 	public LoginPage(WebDriver driver) {
 		this.driver=driver;
 	}
 	
 	public void setUserName(String strUsername) {
 		driver.findElement(username).sendKeys(strUsername);
 	}
 	public void setPassword(String strPassword) {
 		driver.findElement(password).sendKeys(strPassword);
 	}
 	public void ClickLogin() {
 		driver.findElement(login).click();
 	}
 	public String getLoginTitle() {
 		return driver.findElement(titleText).getText();
 	}
 	public void login(String strUserName,String strPassword) {
 		this.setUserName(strUserName);
 		this.setPassword(strPassword);
 		this.ClickLogin();
 	}
  
 }