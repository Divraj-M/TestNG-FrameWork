package com.pagesfind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Loginpage extends Basepage{
	public Loginpage(WebDriver driver) {
		super(driver);
	}
 	@FindBy(name="username")
 	public WebElement username;
 	@FindBy(name="password")
 	public WebElement password;
 	@FindBy(xpath="//h5[text()='Login']")
 	public WebElement titleText;
 	@FindBy(xpath="//button[text()=\" Login \"] ")
 	public WebElement login;
 	
 	public String getLoginTitle() {
 		return titleText.getText();
 	}
 	public void login(String strUserName,String strPassword) {
 		username.sendKeys(strUserName);
 		password.sendKeys(strPassword);
 		login.click();
 	}
}