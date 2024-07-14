package JS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingScrollbar {

	public static void main(String[] args) {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.bbc.com/");
	 JavascriptExecutor j=(JavascriptExecutor)driver;
	 j.executeScript("window.scrollTo(0,3000)");
	 
	}

}
