package org.base1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.amazon.in");
	driver.manage().window().maximize();
		
	

	WebElement d = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	
	executor.executeScript("arguments[0].scrollIntoView(true)", d);
	
	Thread.sleep(3000);
	
	WebElement s = driver.findElement(By.xpath("//img[@alt='Up to 70% off | Electronics clearance store']"));
	JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	executor2.executeScript("arguments[0].scrollIntoView(false)", s);
	Thread.sleep(3000);

	}

}
