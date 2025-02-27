package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass 
{
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("closeBrowser",true);
		//driver.close();
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();		
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}
