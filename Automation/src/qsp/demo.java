package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) { 
		TakesScreenshot e;
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.get("https://www.instagram.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.get("https://www.whatsapp.com");
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.get("https://www.cricbuzz.com");
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		driver.quit();

	}
}
 