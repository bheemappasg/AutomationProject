package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.language.Selection;

public class MultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/FOOD.html");
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 
      Select s = new Select(mtrlistbox);
        
      s.selectByIndex(0);
      Thread.sleep(4000);
      s.selectByValue("v");
      Thread.sleep(4000);
      s.selectByVisibleText("dosa");
      Thread.sleep(4000);
       
      s.deselectByIndex(2);
      Thread.sleep(4000);
      s.deselectByValue("d");
      Thread.sleep(4000);
      s.deselectByVisibleText("dosa");
      Thread.sleep(4000);
      System.out.println(s.isMultiple());
	}

}
