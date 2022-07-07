package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ConfigFreeBuitPageObject;
import pageObject.baseModelPageobject;
import webdriver_Manager.driverManager;

public class StarBaseModelStepDef {
	
	JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();
	
	@When("user clicking on Ebike link and selecting on bike")
	public void user_clicking_on_ebike_link_and_selecting_on_bike() throws InterruptedException {
		
		baseModelPageobject.getInstance().Ebikelinkclick();
		
		Thread.sleep(13000);
		baseModelPageobject.getInstance().closeiconclick();
		
		Thread.sleep(6000);
		
		baseModelPageobject.getInstance().Selectbike();
		
		Thread.sleep(10000);
		
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(10000);
		
	}
	@And("Clicking on shopnow and customizer my own CTA button")
	public void clicking_on_shopnow_and_customizer_my_own_cta_button() throws InterruptedException {
	   
		baseModelPageobject.getInstance().ShopNowButtonclick();
		Thread.sleep(16000);
		
		baseModelPageobject.getInstance().customizemyOwnclick();
		Thread.sleep(10000);
	}
	@Then("Clicking on StartWithBase model and NextStep and Finish CTA button")
	public void clicking_on_start_with_base_model_and_next_step_and_finish_cta_button() throws InterruptedException {
		
		js.executeScript("window.scrollBy(0,500)", "");
	   
		Thread.sleep(10000);
		baseModelPageobject.getInstance().starBaseButtonClick();
		 
		Thread.sleep(8000);
		baseModelPageobject.getInstance().Nextstepclick();
		
		Thread.sleep(8000);
		baseModelPageobject.getInstance().FinishButtonClick();
	}
	@And("Clicks on SelectDeliveryoptions and AddToCart and Checkout  CTA button")
	public void clicks_on_select_deliveryoptions_and_add_to_cart_and_checkout_cta_button() throws InterruptedException {
		
		Thread.sleep(8000);
		baseModelPageobject.getInstance().selectDeliveryClick();
		
		Thread.sleep(8000);
		baseModelPageobject.getInstance().AddToCartClick();
		
		Thread.sleep(8000);
		baseModelPageobject.getInstance().checkoutclick();
	  
		
	}
	@Then("Entering information and clicking on contiune shopping CTA button")
	public void entering_information_and_clicking_on_contiune_shopping_cta_button() throws InterruptedException {
		Thread.sleep(8000);
	    
		baseModelPageobject.getInstance().EmailboxValue();
		Thread.sleep(2000);
		
		baseModelPageobject.getInstance().FirstNameValue();
		
		baseModelPageobject.getInstance().LastNameValue();
		Thread.sleep(2000);
		
		baseModelPageobject.getInstance().Addressvalue();
		Thread.sleep(3000);
		baseModelPageobject.getInstance().AddressSelected();
		
		//baseModelPageobject.getInstance().ZipcodeValue();
		
		//baseModelPageobject.getInstance().cityValue();
		
		Thread.sleep(3000);
		baseModelPageobject.getInstance().phonenumberValue();
		
		baseModelPageobject.getInstance().contiuneToShippingClick();
		
		
	}




}
