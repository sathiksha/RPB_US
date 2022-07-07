package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class preBulidPageObject {
	

		private static preBulidPageObject PreBuildInstance;

		private preBulidPageObject() {

		}

		public static preBulidPageObject getInstance() {

			if(PreBuildInstance==null) {

				PreBuildInstance = new preBulidPageObject();
			}

			return PreBuildInstance;
		}
		
		@FindBy(linkText = "Ebikes")
		private WebElement EbikeLink;

		@FindBy(xpath = "/html/body/header/p/button")
		private WebElement closeicon;

		@FindBy(xpath = "//*[text()='Off-road ']")
		private WebElement SelectEbike;

		@FindBy(linkText = "Shop Now")
		private WebElement ShopNow;

		@FindBy(xpath="//a[@id='bike-customizer']")
		private WebElement customizeMyOwn;
		
		@FindBy(xpath = "//div[@class='PrebuiltPackages_prebuiltPackageCards__wIw+c']//div[2]")
		private WebElement buildpackage;
		
		@FindBy(xpath = "//span[text()='Next Step']")
		private WebElement NextStep;

		@FindBy(xpath = "//span[text()='Select Delivery options']")
		private WebElement selectDeliveryOptions;

		@FindBy(xpath= "//span[text()='Finish']")
		private WebElement finishbutton;

		@FindBy(xpath = "//input[@id='postal-code-input']")
		private WebElement postalcode;

		@FindBy(xpath = "//*[text()='View Options']")
		private WebElement viewoptions;
		
		@FindBy(xpath = "//*[text()='Pick it up (2)']")
		private WebElement deliveryMethod;
		
		@FindBy(xpath = "//*[text()='Pro Built + Ready for Pickup in Store']")
		private WebElement selectdelivery;
		
		@FindBy(xpath = "//*[@class='AssemblyPanel_locationOptionList__POqga']//li[1]")
		private WebElement showroom;
		
		@FindBy(xpath = "//*[text()='Save Selection']")
		private WebElement saveSelection;

		@FindBy(xpath = "//*[text()='Add To Cart']")
		private WebElement AddToCart;

		@FindBy(xpath = "//button[contains(text(),'Checkout')]")
		private WebElement checkoutbutton;

		@FindBy(xpath = "//span[contains(text(),'Pro Built + Delivered by Velofix')]")
		private WebElement verifyDeliveryoption;
		
		@FindBy(xpath = "//input[@placeholder='Email']")
		private WebElement EmailBox;

		@FindBy(xpath = "//input[@placeholder='First name']")
		private WebElement FirstName;

		@FindBy(xpath = "//input[@placeholder='Last name']")
		private WebElement lastName;

		@FindBy(xpath = "//input[@placeholder='Address']")
		private WebElement Address;

		@FindBy(xpath = "//li[@id='1']")
		private WebElement AddressSelect;
		
		@FindBy(xpath = "//input[@placeholder='Phone']")
		private WebElement phonenumber;

		@FindBy(xpath = "//button[@id='continue_button']")
		private WebElement contiuneToShipping;



		
		
		public void Ebikelinkclick() {

			EbikeLink.click();
		}

		public void closeIconClick() {

			closeicon.click();
		}

		public void Selectbike() {

			SelectEbike.click();
		}

		public void ShopNowButtonclick() {

			ShopNow.click();
		}

		public void customizemyOwnclick() {

			customizeMyOwn.click();
		}
		
		public void selectbulidpackage() {
			
			buildpackage.click();
		}
		
		public void Nextstepclick() {

			NextStep.click();
		}

		public void FinishButtonClick() {

			finishbutton.click();
		}

		public void selectDeliveryClick() {

			selectDeliveryOptions.click();
		}

		public void postalcodevalue( ) {

			postalcode.sendKeys("92591");  
		}

		public void viewOptionclick() {

			viewoptions.click();
		}
		
		public void deliveryMethodSelect() {
			
			deliveryMethod.click();
		}
		
		public void Selectdeliveryoption() {
			
		  selectdelivery.click();
		  
		}
		
		
		public void selectShowRoom() {
			
			showroom.click();
		}
		
		public void saveSelecionclick() {
			
			saveSelection.click();
		}
		
		public void AddToCartClick() {
			
			AddToCart.click();
		}
		
		public void checkoutclick() {
			
			checkoutbutton.click();
		}
		
		public void EmailboxValue() {

			EmailBox.sendKeys("demologin@yopmail.com");
		}

		public void FirstNameValue() {

			FirstName.sendKeys("test");
		}

		public void LastNameValue() {

			lastName.sendKeys("Test53");
		}


		public void Addressvalue() {

			Address.sendKeys("123");

		}

		public void AddressSelected() {

			AddressSelect.click();
		}
		
		public void phonenumberValue() {

			phonenumber.sendKeys("4949494040");
		}

		public void contiuneToShippingClick() {

			contiuneToShipping.click();
		}
		

	




}
