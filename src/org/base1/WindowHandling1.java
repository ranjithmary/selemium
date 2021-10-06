package org.base1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txtiphone = driver.findElement(By.id("twotabsearchtextbox"));
		
		txtiphone.sendKeys("iphone", Keys.ENTER);
		
		WebElement iphoneclick = driver.findElement(By.xpath("//img[@class='s-image']"));
		iphoneclick.click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		

		
Set<String> childwindowhandle = driver.getWindowHandles();
		
		System.out.println(childwindowhandle);
		
		//for (String newwindow : childwindowhandle) {
			
			//if (!windowHandle.equals(newwindow)) {
				
				//driver.switchTo().window(newwindow);
		
		List<String> childwindow = new ArrayList<String>();
		childwindow.addAll(childwindowhandle);
		String string = childwindow.get(1);
		driver.switchTo().window(string);
		
		
		
				
			WebElement Addtokart = driver.findElement(By.id("add-to-cart-button"));	
			Addtokart.click();
			
			driver.close();
			
			
			driver.switchTo().window(windowHandle);
				
			}
			
			
		
		
				
		
		
		
	}
		
		
		
		
		
		

		
	
		
			
		
		
		
			
		


		
	
	

	

