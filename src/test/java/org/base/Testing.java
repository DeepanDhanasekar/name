package org.base;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	
	
	static WebDriver driver;
	
	@BeforeClass
	public static void BrowserLanch() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\JunitProgram\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		

	}

}
