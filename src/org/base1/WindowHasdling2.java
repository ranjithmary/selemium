package org.base1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHasdling2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("sweatshirt for women stylish",Keys.ENTER);
		WebElement sweatshirt = driver.findElement(By.xpath("(//img[@class='s-image'])[6]"));
		sweatshirt.click();
		String ParentWindow = driver.getWindowHandle();
		System.out.println(ParentWindow);
		
		Set<String>  ChildWindow= driver.getWindowHandles();
		System.out.println(ChildWindow);
		
		for (String eachelement : ChildWindow) {
			
		if (!ParentWindow.equals(eachelement)) {
			
			driver.switchTo().window(eachelement);
WebElement Addtokart = driver.findElement(By.id("add-to-cart-button"));
			
			
			
			Addtokart.click();
			
			WebElement Size = driver.findElement(By.name("dropdown_selected_size_name"));
			Select select = new Select(Size);
			select.selectByVisibleText("L");
			
			
		
			
driver.switchTo().window(ParentWindow);
			
			WebElement sweatshirt2 = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
			sweatshirt2.click();
			
			driver.quit();
		
	}

}
}
} 