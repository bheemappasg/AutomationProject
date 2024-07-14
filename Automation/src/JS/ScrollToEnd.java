package JS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollToEnd {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.bbc.com/");
		 JavascriptExecutor j=(JavascriptExecutor)driver;
		 j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 Thread.sleep(3000);
		 j.executeScript("window.scrollTo(0,0)");
		 

	}

}
