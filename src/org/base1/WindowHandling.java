package org.base1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.id("customers"));
		
				
		String text = table.getText();
		
		System.out.println(text);
		
		List<WebElement> rows = driver.findElements(By.tagName("\tr"));

		
		
		for (int i = 0; i < rows.size(); i++) {
			
			WebElement webElement = rows.get(i);
			
			String text2 = webElement.getText();
			System.out.println("row"+i);
			
	List<WebElement> tabledate = driver.findElements(By.tagName("\td"));
			
			for (int j = 0; j <tabledate .size(); j++) {
				
				WebElement webElement2 = tabledate.get(j);
				System.out.println();
				
				
				
				
				
				
				
			}
		}
		}
}
			
			
		

		



