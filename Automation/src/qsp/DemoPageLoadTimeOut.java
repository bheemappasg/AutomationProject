package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPageLoadTimeOut {

	public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
      try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("page is loaded within 7 second & pass");
	} catch (Exception e) {
      System.out.println("page is not loaded within 7 second & fail");
	}

	}

}
