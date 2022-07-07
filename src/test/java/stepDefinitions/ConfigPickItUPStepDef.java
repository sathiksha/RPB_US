package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.GetItDeliverPageObject;
import pageObject.pickItUpPageObject;
import webdriver_Manager.driverManager;

public class ConfigPickItUPStepDef {
	
	@When("User clicking on Buynow and SkipStep CTA button")
	public void user_clicking_on_buynow_and_skip_step_cta_button() throws InterruptedException {
		
		Thread.sleep(8000);
		pickItUpPageObject.getInstance().Ebikelinkclick();
		Thread.sleep(15000);
		
		pickItUpPageObject.getInstance().clickCloseIcon();
		
		Thread.sleep(5000);	
		pickItUpPageObject.getInstance().Selectbike();
	
		Thread.sleep(13000);		
		JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();
		js.executeScript("window.scrollBy(0,450)", "");
		
		Thread.sleep(10000);
		pickItUpPageObject.getInstance().ShopNowButtonclick();
		Thread.sleep(10000);
		
		pickItUpPageObject.getInstance().buyNowButtonClick();
		Thread.sleep(7000);
		
		pickItUpPageObject.getInstance().skipstepClick();   
		
	   
	}
	
	@And("select color option")
	public void select_color_option() throws InterruptedException {
		
		Thread.sleep(8000);
	//	pickItUpPageObject.getInstance().BikeColorselect();
	//	Thread.sleep(8000);
		
		pickItUpPageObject.getInstance().NextButtonClick();
			 
	}
	
	@Then("user enter the postal code and clicks on viewoption")
	public void user_enter_the_postal_code_and_clicks_on_viewoption() throws InterruptedException {
		Thread.sleep(8000);
		
		pickItUpPageObject.getInstance().postalcodevalue();
		
		Thread.sleep(8000);
		pickItUpPageObject.getInstance().viewOptionclick();
		Thread.sleep(7000);
	   
	}
	
	@And("Navigate to pickup section and select any delivery option")
	public void navigate_to_pickup_section_and_select_any_delivery_option() throws InterruptedException {
		
		pickItUpPageObject.getInstance().PickItoptionselect();
		
		Thread.sleep(7000);
		pickItUpPageObject.getInstance().selectDeliveryOptions();
	    
	}
	
	@Then("Selecting on any showroom and click on AddToCart CTA button")
	public void selecting_on_any_showroom_and_click_on_add_to_cart_cta_button() throws InterruptedException  {
		
		Thread.sleep(7000);
		pickItUpPageObject.getInstance().selectShopOption();
		
		Thread.sleep(7000);
		pickItUpPageObject.getInstance().SaveSelectionOPtion();
		
		Thread.sleep(7000);
		pickItUpPageObject.getInstance().AddtocartOption();
	    
	}
	
	@And("clicking on BuyNow,BeignCheckout and checkout")
	public void clicking_on_buy_now_beign_checkout_and_checkout() throws InterruptedException {

		//pickItUpPageObject.getInstance().buyNowButtonClick();
		
		Thread.sleep(7000);
		pickItUpPageObject.getInstance().beigncheckoutClick();
		
		Thread.sleep(7000);
		pickItUpPageObject.getInstance().checkoutclick();
	}
	@Then("Enter the information in Paymetpage and clicking on contiuneShipping")
	public void enter_the_information_in_paymetpage_and_clicking_on_contiune_shipping() throws InterruptedException {
		Thread.sleep(20000);
	    
		pickItUpPageObject.getInstance().EmailboxValue();
		
		pickItUpPageObject.getInstance().FirstNameValue();
		
		pickItUpPageObject.getInstance().LastNameValue();
		
		pickItUpPageObject.getInstance().Addressvalue();
		
		Thread.sleep(3000);
		pickItUpPageObject.getInstance().AddressSelected();
		Thread.sleep(6000);
		
		//pickItUpPageObject.getInstance().cityValue();
		
	//	pickItUpPageObject.getInstance().ZipcodeValue();
		
		pickItUpPageObject.getInstance().phonenumberValue();
		
		Thread.sleep(3000);
		pickItUpPageObject.getInstance().contiuneToShippingClick();
		
	}


	
	

}
