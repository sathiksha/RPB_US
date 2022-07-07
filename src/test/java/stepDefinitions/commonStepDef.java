package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import commonutilities.commonUtils;
import constants.constant;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObject.loginpageObject;
import webdriver_Manager.driverManager;

public class commonStepDef {

	@Before
	public void beforeScenario() {
		
		
		try {
			
			
			commonUtils commonUtils = new commonUtils();
			
			commonUtils.loadproperties();
			
			
			if(driverManager.getDriver()==null)
			driverManager.launchBrowser();
			driverManager.getDriver().manage().window().maximize();
			
			commonUtils.initWebElemets();
			loginStep();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	private void loginStep() throws InterruptedException {
	
		driverManager.getDriver().get(constant.URL);
		
    	/*loginpageObject.getInstance().clickLoginLink();
		
		loginpageObject.getInstance().enterUserName(constant.USERNAME);
		
		loginpageObject.getInstance().enterPassword(constant.PASSWORD);
		
		loginpageObject.getInstance().clickLoginButt();
		
		Thread.sleep(6000);
		loginpageObject.getInstance().checkboxClick();
		
		loginpageObject.getInstance().sumbitButton();*/
		
		
	}
	

	@AfterStep
	public void attachScreenshot(Scenario scenario) {
		
		if (scenario.isFailed()) {
			
	    byte []  screenshotTaken  = 		((TakesScreenshot) driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	    
	    scenario.attach(screenshotTaken, "image/png", "error screen");
		}
	}
}
