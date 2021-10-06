package org.base1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alternateoption {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/campaign/landing.php?&campaign_id=973072070&extra_1=s%7Cc%7C256741383347%7Ce%7Cfacebook%20sign%20up%7C&placement&creative=256741383347&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D973072070%26adgroupid%3D54006292691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-295862466660%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIkrnO3Jfv8gIVEgByCh3aXQ_bEAAYASAAEgIVCfD_BwE");
		driver.manage().window().maximize();
		
		WebElement Ddnmonths = driver.findElement(By.id("month"));
		
		Select select = new Select(Ddnmonths);
		
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i=i+2) {
			
			WebElement element = options.get(i);
			
			String text = element.getText();
			
			System.out.println(text);
			
		}
		
		
	}

}
