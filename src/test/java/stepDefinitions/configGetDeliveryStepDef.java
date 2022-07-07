package stepDefinitions;



import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ConfigFreeBuitPageObject;
import pageObject.GetItDeliverPageObject;
import webdriver_Manager.driverManager;

public class configGetDeliveryStepDef {
	
	@When("user clicking on Buynow butt")
	public void user_clicking_on_buynow_butt() throws InterruptedException {
		
		Thread.sleep(10000);
		GetItDeliverPageObject.getInstance().Ebikelinkclick();
		Thread.sleep(15000);
		
		GetItDeliverPageObject.getInstance().clickCloseIcon();
		
		Thread.sleep(5000);
		GetItDeliverPageObject.getInstance().Selectbike();
		Thread.sleep(13000);
		
		JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();
		js.executeScript("window.scrollBy(0,450)", "");
		
		Thread.sleep(10000);
		GetItDeliverPageObject.getInstance().ShopNowButtonclick();
		Thread.sleep(15000);
		
		GetItDeliverPageObject.getInstance().buyNowButtonClick();
		Thread.sleep(6000);
		
	}
	@And("clicking on skipStep butt")
	public void clicking_on_skip_step_butt() throws InterruptedException {
	  
		Thread.sleep(6000);
		GetItDeliverPageObject.getInstance().skipstepClick();
	}
	@Then("User selecting on coloroption")
	public void user_selecting_on_coloroption() throws InterruptedException {
		
		Thread.sleep(5000);
		GetItDeliverPageObject.getInstance().BikeColorselect();
		
		Thread.sleep(5000);
		GetItDeliverPageObject.getInstance().NextButtonClick();
	   
	}
	@When("User enter the postal code and clicks on ViewOptionsbutton")
	public void user_enter_the_postal_code_and_clicks_on_view_optionsbutton() throws InterruptedException {
		
		Thread.sleep(6000);
		GetItDeliverPageObject.getInstance().postalcodevalue();
		
		Thread.sleep(6000);
		GetItDeliverPageObject.getInstance().viewOptionclick();
	  
	}
	@Then("selecting deliveryoptions")
	public void selecting_deliveryoptions() throws InterruptedException {
	  
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();
		js.executeScript("window.scrollBy(0,750)", "");
		
		Thread.sleep(6000);
		GetItDeliverPageObject.getInstance().deliveryOptionselect();
		
		Thread.sleep(6000);
		
		GetItDeliverPageObject.getInstance().AddtocartOption();
		
	}
	@And("Clicking on BuyNow and Beigncheckout and checkout CTAbutton")
	public void clicking_on_buy_now_and_beigncheckout_and_checkout_ct_abutton() throws InterruptedException {
		Thread.sleep(10000);
	 
		GetItDeliverPageObject.getInstance().beigncheckoutClick();

		Thread.sleep(8000);

		String Deliveryname =  GetItDeliverPageObject.getInstance().DeliveryOptionVerify();

		System.out.println(Deliveryname);
		Thread.sleep(6000);

		GetItDeliverPageObject.getInstance().checkoutclick();

		Thread.sleep(20000);
		
		GetItDeliverPageObject.getInstance().EmailboxValue();
		Thread.sleep(2000);
		
		GetItDeliverPageObject.getInstance().FirstNameValue();
		
		GetItDeliverPageObject.getInstance().LastNameValue();
		Thread.sleep(2000);
		
		GetItDeliverPageObject.getInstance().Addressvalue();
		Thread.sleep(3000);
		GetItDeliverPageObject.getInstance().AddressSelected();
		
		//GetItDeliverPageObject.getInstance().ZipcodeValue();
		
		//GetItDeliverPageObject.getInstance().cityValue();
		
		GetItDeliverPageObject.getInstance().phonenumberValue();
		
		Thread.sleep(2000);
		GetItDeliverPageObject.getInstance().contiuneToShippingClick();
		

	}


}
