package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedoption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/FOOD.html");
		 WebElement slvlistbox = driver.findElement(By.id("slv"));
		 
      Select s = new Select(slvlistbox);
               WebElement fsoptions = s.getFirstSelectedOption();
              String TEXT = fsoptions.getText();
               
              System.out.println(TEXT);
              driver.quit();
	}

}
