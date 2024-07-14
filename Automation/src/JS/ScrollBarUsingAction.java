package JS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollBarUsingAction {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.bbc.com/");
		 Actions a = new Actions(driver);
		 a.scrollByAmount(0, 3000).perform();
	}

}
