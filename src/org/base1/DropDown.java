package org.base1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html\r\n");
		driver.manage().window().maximize();
		
		WebElement Ddncountries = driver.findElement(By.id("countries"));
		
		Select select = new Select (Ddncountries);
		
		//List<WebElement> options = select.getOptions();
		//int len = options.size();
		//System.out.println(len);
		
		
	}

}
