package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.preBulidPageObject;
import webdriver_Manager.driverManager;

public class preBuiltPackageStepDef {
	
	JavascriptExecutor js = (JavascriptExecutor) driverManager.getDriver();

	@When("user clicking on Ebike in mainmenu")
	public void user_clicking_on_ebike_in_mainmenu() throws InterruptedException {
		
		preBulidPageObject.getInstance().Ebikelinkclick();
		
		Thread.sleep(12000);
		preBulidPageObject.getInstance().closeIconClick();
		
		Thread.sleep(10000);
		preBulidPageObject.getInstance().Selectbike();
		
		
		js.executeScript("window.scrollBy(0,500)", "");
		   
	    
	}
	@And("Clicking On Shopnow and CustomizeMyown and select package")
	public void clicking_on_shopnow_and_customize_myown_and_select_package() throws InterruptedException {
	   
		Thread.sleep(10000);
		preBulidPageObject.getInstance().ShopNowButtonclick();
		
		Thread.sleep(13000);
		preBulidPageObject.getInstance().customizemyOwnclick();
		
		Thread.sleep(10000);
		preBulidPageObject.getInstance().selectbulidpackage();
		Thread.sleep(10000);
		
		js.executeScript("window.scrollBy(0,500)", "");
	}
	@Then("clicking on next and finish and selectDeliveryOption button")
	public void clicking_on_next_and_finish_and_select_delivery_option_button() throws InterruptedException {
		Thread.sleep(10000);
		
		preBulidPageObject.getInstance().Nextstepclick();
		
		Thread.sleep(5000);
		preBulidPageObject.getInstance().FinishButtonClick();
		
		Thread.sleep(5000);
		preBulidPageObject.getInstance().selectDeliveryClick();
	  
	}
	@And("Selecting on delivery options and showroom and clicks on saveselection")
	public void selecting_on_delivery_options_and_showroom_and_clicks_on_saveselection() throws InterruptedException {
		
		Thread.sleep(8000);
		preBulidPageObject.getInstance().postalcodevalue();
		
		Thread.sleep(8000);
		preBulidPageObject.getInstance().viewOptionclick();
		
		Thread.sleep(8000);
		preBulidPageObject.getInstance().deliveryMethodSelect();
		
		Thread.sleep(8000);
		preBulidPageObject.getInstance().Selectdeliveryoption();  
	}
	@And("clicking on AddtoCart and checkout button")
	public void clicking_on_addto_cart_and_checkout_button() throws InterruptedException {
		Thread.sleep(8000);
		
		preBulidPageObject.getInstance().selectShowRoom();
		Thread.sleep(8000);
		
		preBulidPageObject.getInstance().saveSelecionclick();
		Thread.sleep(8000);
		
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(8000);
		preBulidPageObject.getInstance().AddToCartClick();
		Thread.sleep(10000);
		
		preBulidPageObject.getInstance().checkoutclick();
	}
	@Then("Enter All information and click to Coutiune shopping button")
	public void enter_all_information_and_click_to_coutiune_shopping_button() throws InterruptedException {
		Thread.sleep(16000);
		
		preBulidPageObject.getInstance().EmailboxValue();
		Thread.sleep(3000);
		
		preBulidPageObject.getInstance().FirstNameValue();
		Thread.sleep(3000);
		
		preBulidPageObject.getInstance().LastNameValue();
		Thread.sleep(3000);
		
		preBulidPageObject.getInstance().Addressvalue();
		
		   Thread.sleep(3000);
		preBulidPageObject.getInstance().AddressSelected();
		
		  Thread.sleep(3000);
		preBulidPageObject.getInstance().phonenumberValue();
		
		  Thread.sleep(3000);
		preBulidPageObject.getInstance().contiuneToShippingClick();
		
	}




}
