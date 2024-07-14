package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/FILE.html");
		Thread.sleep(4000); 
		
		   File f = new File("./Data/PROJECTEXPLANATION.docx");
		        String absolutepath = f.getAbsolutePath();
		        System.out.println( absolutepath);
		     
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
		
	}

}
