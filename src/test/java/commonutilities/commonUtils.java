package commonutilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import constants.constant;
import pageObject.ConfigFreeBuitPageObject;
import pageObject.GetItDeliverPageObject;
import pageObject.baseModelPageobject;
import pageObject.baseWithAccessoryPageObject;
import pageObject.loginpageObject;
import pageObject.pickItUpPageObject;
import pageObject.preBulidPageObject;
import webdriver_Manager.driverManager;

public class commonUtils {

public  void loadproperties() throws IOException {
		
		
	Properties properties  = new Properties();
		
	properties.load(getClass().getResourceAsStream("/confiq.properties"));
			
	constant.URL =	properties.getProperty("URL");
		
	constant.BROWSER =	properties.getProperty("BROWSER");
		
	constant.USERNAME =	properties.getProperty("username");
		
	constant.PASSWORD =	properties.getProperty("password");
	
	}

public void initWebElemets() {
	
	PageFactory.initElements(driverManager.getDriver(),loginpageObject.getInstance());  
	PageFactory.initElements(driverManager.getDriver(),ConfigFreeBuitPageObject.getInstance());
	PageFactory.initElements(driverManager.getDriver(),GetItDeliverPageObject.getInstance());
	PageFactory.initElements(driverManager.getDriver(),pickItUpPageObject.getInstance());
	PageFactory.initElements(driverManager.getDriver(),baseModelPageobject.getInstance());
	PageFactory.initElements(driverManager.getDriver(),baseWithAccessoryPageObject.getInstance());
	PageFactory.initElements(driverManager.getDriver(),preBulidPageObject.getInstance());
	
}

public void takeScreenshot() throws IOException {
	
	File screenshot = ((TakesScreenshot) driverManager.getDriver()).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenshot, new File ("screenshot.png"));
}
}
