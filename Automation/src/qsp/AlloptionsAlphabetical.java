package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlloptionsAlphabetical {

	public static void main(String[] args) {
	

	        // Create a WebDriver instance (in this case, ChromeDriver)
	        WebDriver driver = new ChromeDriver();

	        // Open the HTML page with the multi-select list box
	        driver.get("file:///path_to_your_html_file.html");

	        // Locate the multi-select list box
	        WebElement multiListBox = driver.findElement(By.id("multiListBox"));

	        // Get all the options from the list box
	        List<WebElement> options = multiListBox.findElements(By.tagName(""));

	        // Create an ArrayList to store the option texts
	        List<String> optionTexts = new ArrayList<>();

	        // Extract the option texts and add them to the ArrayList
	        for (WebElement option : options) {
	            optionTexts.add(option.getText());
	        }

	        // Sort the option texts in alphabetical order
	        Collections.sort(optionTexts);

	        // Print the sorted options
	        System.out.println("Options in alphabetical order:");
	        for (String optionText : optionTexts) {
	            System.out.println(optionText);
	}

}}
