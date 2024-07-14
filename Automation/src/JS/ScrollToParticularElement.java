package JS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollToParticularElement {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.bbc.com/");
	 int y = driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();
	 FirefoxDriver f=(FirefoxDriver)driver;
	 f.executeScript("window.scrollBy(0,"+y+")");
	

	}

}
