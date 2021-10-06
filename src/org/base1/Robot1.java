package org.base1;

import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_M);
robot.keyPress(KeyEvent.VK_A);

robot.keyRelease(KeyEvent.VK_M);
robot.keyRelease(KeyEvent.VK_A);

robot.keyPress(KeyEvent.VK_TAB);

robot.keyRelease(KeyEvent.VK_TAB);

robot.keyPress(KeyEvent.VK_M)	;

robot.keyPress(KeyEvent.VK_K)	;
	
robot.keyRelease(KeyEvent.VK_P);				
robot.keyRelease(KeyEvent.VK_K);

robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);




				
	}

	
	
}



