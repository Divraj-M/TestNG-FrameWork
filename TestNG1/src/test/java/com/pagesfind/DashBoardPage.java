package com.pagesfind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DashBoardPage extends Basepage {
	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		super(driver);
		
	}
 	@FindBy(xpath="//h6[text()='Dashboard']")
 	public WebElement dashboardpagetitle;
 	public String getHomePagetext() {
 		return dashboardpagetitle.getText();
 	}
}
