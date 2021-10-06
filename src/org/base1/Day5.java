package org.base1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	driver.manage().window().maximize();
	
	WebElement tablecontent = driver.findElement(By.id("task-table"));
	List<WebElement> webtable = tablecontent.findElements(By.xpath("//table//td[text()='Wireframes']//following-sibling ::td[2]"));
	for (WebElement webElement : webtable) {
		String text = webElement.getText();
		System.out.println(text);
		
	
	
	}
	}
	
		
	
	/*WebElement  prime = driver.findElement(By.xpath("//span[text()='Prime']"));
	Actions actions =new Actions(driver);
	actions.moveToElement(prime).perform();
	
	
	WebElement element = driver.findElement(By.id("nav-logo-sprites"));
	String text = element.getText();
	System.out.println(text); 	
	
	Thread.sleep(3000);
	WebElement mouseover = driver.findElement(By.id("multiasins-img-link"));
	mouseover.click();*/
	
	
	
	
	//Actions actions = new Actions(driver);
	//actions.moveToElement(mouseover).perform();
	

}
