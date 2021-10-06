package org.base1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.automationtesting.in/Register.html ");
		driver.manage().window().maximize();
		
		WebElement Ddn = driver.findElement(By.id("Skills"));
		Ddn.click();
		
		Select select = new Select(Ddn);
		
		
		
		List<WebElement> options = select.getOptions();
		
		int size = options.size();
		
		System.out.println(size);
		
		
for (int i = 6; i < options.size(); i++) {
			
	WebElement webElement = options.get(i);
	
	webElement.click();
		String text = webElement.getText();
			System.out.println(text);
			
	
			
			
			
			
			
			
			
		}
	}
}
	
	
	
	


