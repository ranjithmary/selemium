package org.base1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionsintocaps {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement txtuser = driver.findElement(By.id("email"));
		Actions actions= new Actions(driver);
		actions.keyDown(txtuser,Keys.SHIFT).sendKeys(txtuser, "mary").keyUp(txtuser, Keys.SHIFT).perform();
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		Actions actions1= new Actions(driver);
		actions1.keyDown(txtpass,Keys.SHIFT).sendKeys(txtpass, "love").keyUp(txtpass, Keys.SHIFT).perform();
		
	}

}
