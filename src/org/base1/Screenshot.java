package org.base1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//typecase		
TakesScreenshot screenshot = (TakesScreenshot)driver;


File s = screenshot.getScreenshotAs(OutputType.FILE);

File d = new File("C:\\Users\\Mary\\Downloads\\out.png");

     FileUtils.copyFile(s, d);


	}

}
