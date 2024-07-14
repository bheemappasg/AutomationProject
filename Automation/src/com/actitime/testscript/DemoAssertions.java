package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertions {
	@Test
	public void verifyTitle()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String eTitle = "soogle";
	    String aTitle = driver.getTitle();
	    Assert.assertEquals(eTitle,aTitle);
	    driver.quit();	
	    }

}
