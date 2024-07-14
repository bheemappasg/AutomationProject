package bheem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.amazon.com/");
		 List<WebElement> ALL = d.findElements(By.xpath("//div"));
		 int count = ALL.size();
		 System.out.println(count);
		 for (int i=0;i<count;i++)
				 {
					String text = ALL.get(i).getText();
					System.out.println(text);
				 }
		 d.quit();
		


	}

}
