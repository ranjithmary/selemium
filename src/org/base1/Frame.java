package org.base1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://netbanking.hdfcbank.com/ ");
	driver.manage().window().maximize();
	WebElement frameweb = driver.findElement(By.name("login_page"));//we need to find out xpath for frame	
	driver.switchTo().frame(frameweb);
	WebElement username = driver.findElement(By.name("fldLoginUserId"));
	username.sendKeys("12384426");
	
	WebElement btnclick = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
	btnclick.click();
	
	driver.quit();
	}

}
