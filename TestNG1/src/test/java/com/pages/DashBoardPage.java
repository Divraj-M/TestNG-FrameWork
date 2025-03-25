package com.pages;
 
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.testng.annotations.Test;
 
 public class DashBoardPage {
 	WebDriver driver;
 	By homePageUserName=By.xpath("//h6[text()='Dashboard']");
 	public DashBoardPage(WebDriver driver) {
 		this.driver=driver;
 	}
 	public String getHomePagetext() {
 		return driver.findElement(homePageUserName).getText();
 	}
 }