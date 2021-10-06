package org.base1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPro {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement txtusername = driver.findElement(By.id("email"));
//typecast
JavascriptExecutor executor =(JavascriptExecutor) driver;
executor.executeScript("arguments[0].setAttribute('value','welcome')", txtusername);

Object name = executor.executeScript("return arguments[0].getAttribute('value')", txtusername);
System.out.println(name);

WebElement txtpass = driver.findElement(By.id("pass"));
JavascriptExecutor executor2 = (JavascriptExecutor)driver;
executor2.executeScript("arguments[0].setAttribute('value','mary')", txtpass);
Object name1 = executor2.executeScript("return arguments[0].getAttribute('value')", txtpass);
System.out.println(name1);

WebElement btnlogin = driver.findElement(By.name("login"));
//JavascriptExecutor executor3=(JavascriptExecutor)driver;
//executor.executeAsyncScript("arguments[0],click()", btnlogin);

executor.executeScript("arguments[0].click()", btnlogin);

driver.quit()
;
	}

}
