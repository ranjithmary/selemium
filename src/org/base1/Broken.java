package org.base1;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.seleniumhq.jetty9.server.HttpConnection;

public class Broken {

	public static void main(String[] args ) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> linknames = driver.findElements(By.tagName("a"));
		
		int size1 = linknames.size();
		int linkcount = 0;
		for (int i = 0; i < linknames.size(); i++) {
			
			
			WebElement webElement = linknames.get(i);
		
			String attribute = webElement.getAttribute("href");	
			
			System.out.println(attribute);
			
			URL url = new URL(attribute);
			
			URLConnection openConnection = url.openConnection();
			
			HttpsURLConnection  connection =(HttpsURLConnection)openConnection;
			int responseCode = connection.getResponseCode();
			
			if (responseCode!= 200) {
				
				linkcount++;	
				System.out.println("All links are "+attribute);
				
			}
			
			System.out.println("my url link counts are"+linkcount);
		}
	}	
		
		

}
