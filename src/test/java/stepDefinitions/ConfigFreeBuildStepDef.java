package stepDefinitions;



import org.openqa.selenium.JavascriptExecutor;

import commonutilities.commonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.ConfigFreeBuitPageObject;
import webdriver_Manager.driverManager;

public class ConfigFreeBuildStepDef  {
	

	@When("user clicking on Ebike option in mainmenu")
	public void user_clicking_on_ebike_option_in_mainmenu() throws InterruptedException {
		ConfigFreeBuitPageObject.getInstance().Ebikelinkclick();
		
         Thread.sleep(10000);
		ConfigFreeBuitPageObject.getInstance().closeIconClick();
	}
	
	@And("Selecting on any ebike and scroll down the page")
	public void selecting_on_any_ebike_and_scroll_down_the_page() throws InterruptedException {
		
		Thread.sleep(8000);
		ConfigFreeBuitPageObject.getInstance().Selectbike();
		
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();
		js.executeScript("window.scrollBy(0,500)", "");

	}
	
	@Then("clicking on Shopnow and Buynow button then click on SkipStep Button")
	public void clicking_on_shopnow_and_buynow_button_then_skip_step_button() throws InterruptedException {
		Thread.sleep(15000);
		
		ConfigFreeBuitPageObject.getInstance().ShopNowButtonclick();
		Thread.sleep(15000);
		
		ConfigFreeBuitPageObject.getInstance().buyNowButtonClick();
		Thread.sleep(8000);
		
		ConfigFreeBuitPageObject.getInstance().skipstepClick();
		Thread.sleep(8000);

	}
	@Then("select on ebike color and click on Nextbutton")
	public void select_on_ebike_color_and_click_on_nextbutton() throws InterruptedException {

		Thread.sleep(8000);
		ConfigFreeBuitPageObject.getInstance().BikeColorselect();
		
		Thread.sleep(8000);
		ConfigFreeBuitPageObject.getInstance().NextButtonClick();
	}
	
	@When("user Select Free delivery optoin and clicking on Buy now button")
	public void user_select_free_delivery_optoin_and_clicking_on_buy_now_button() throws InterruptedException {
		
		Thread.sleep(8000);
		ConfigFreeBuitPageObject.getInstance().buybuttonclick();
	}
	
	@And("increasing product quanity Then verify the quanity {string}")
	public void increasing_product_quanity_then_verify_the_quanity(String string) throws InterruptedException {

		Thread.sleep(8000);
		ConfigFreeBuitPageObject.getInstance().increasequatity();
		Thread.sleep(8000);
		
		String actualValue = ConfigFreeBuitPageObject.getInstance().verifyquatity();
		Assert.assertEquals(string, actualValue);
		System.out.println(actualValue);
	}
	@And("clicks on being checkout and check out")
	public void clicks_on_being_checkout_and_check_out() throws InterruptedException {
		
		Thread.sleep(7000);
		ConfigFreeBuitPageObject.getInstance().beigncheckoutClick();
		Thread.sleep(10000);
		
		
		ConfigFreeBuitPageObject.getInstance().checkoutclick();
		
		Thread.sleep(15000);
	   
		ConfigFreeBuitPageObject.getInstance().EmailboxValue();
		Thread.sleep(2000);
		
		ConfigFreeBuitPageObject.getInstance().FirstNameValue();
		
		ConfigFreeBuitPageObject.getInstance().LastNameValue();
		Thread.sleep(2000);
		
		ConfigFreeBuitPageObject.getInstance().Addressvalue();
		Thread.sleep(3000);
		ConfigFreeBuitPageObject.getInstance().AddressSelected();
		
	//	ConfigFreeBuitPageObject.getInstance().ZipcodeValue();
		
	//	ConfigFreeBuitPageObject.getInstance().cityValue();
		
		Thread.sleep(4000);
		ConfigFreeBuitPageObject.getInstance().phonenumberValue();
	
		ConfigFreeBuitPageObject.getInstance().contiuneToShippingClick();
		
		

	}



}
