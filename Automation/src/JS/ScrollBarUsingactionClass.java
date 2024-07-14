package JS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollBarUsingactionClass {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.bbc.com/");
		int d = driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();		 
		 Actions a = new Actions(driver);
		 a.scrollToElement();
		 

	}

}
