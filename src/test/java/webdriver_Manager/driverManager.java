package webdriver_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.constant;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverManager {

	private static WebDriver driver = null;
	
	public static void launchBrowser() {
		
		try {
			
			switch (constant.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
				break;

			default:
				
				driver = new ChromeDriver();	
				break;
			}
			
		} catch (Exception e) {
			
		}
		
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
