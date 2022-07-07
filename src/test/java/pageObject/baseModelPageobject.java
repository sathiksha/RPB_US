package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class baseModelPageobject {
	
private static baseModelPageobject basemodelInstance;
	
	private baseModelPageobject() {

	}

	public static baseModelPageobject getInstance() {

		if(basemodelInstance==null) {

			basemodelInstance = new baseModelPageobject();
		}

		return basemodelInstance;
	}

	@FindBy(linkText = "Ebikes")
	private WebElement EbikeLink;

	@FindBy(xpath = "//*[text()='Cargo & utility ']")
	private WebElement SelectEbike;

	@FindBy(linkText = "Shop Now")
	private WebElement ShopNow;
	
	@FindBy(xpath="/html/body/div[4]/section/header/nav[2]/div/div/a")
	private WebElement customizeMyOwn;
	
	@FindBy(linkText = "//span[text()='Start With Base Model']")
	private WebElement StartWithBase;
	
	@FindBy(linkText = "//span[text()='Next Step']")
	private WebElement NextStep;
	
	@FindBy(linkText= "//span[text()='Finish']")
	private WebElement finishbutton;
	
	@FindBy(linkText = "//span[text()='Select Delivery options']")
	private WebElement selectDeliveryOptions;
	
	@FindBy(linkText = "//span[text()='Add To Cart']")
	private WebElement AddToCart;
	
	@FindBy(linkText = "//button[text()='Checkout']")
	private WebElement checkout;
	
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

	@FindBy(xpath = "//input[@placeholder='ZIP code']")
	private WebElement Zipcode;
	
	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@placeholder='Phone']")
	private WebElement phonenumber;
	
	@FindBy(xpath = "//button[@id='continue_button']")
	private WebElement contiuneToShipping;
	
	@FindBy(xpath = "/html/body/header/p/button")
	private WebElement closeicon;
	
	public void Ebikelinkclick() {

		EbikeLink.click();
	}

	public void Selectbike() {

		SelectEbike.click();
	}

	public void ShopNowButtonclick() {

		ShopNow.click();
	}
	
	public void starBaseButtonClick() {
		
		StartWithBase.click();
		
	}
	
	public void Nextstepclick() {
		
		NextStep.click();
	}
	
	public void FinishButtonClick() {
		
		finishbutton.click();
	}
	
	public void customizemyOwnclick() {
		
		customizeMyOwn.click();
	}
	
	public void selectDeliveryClick() {
		
		selectDeliveryOptions.click();
	}
	
	public void AddToCartClick() {
		
		AddToCart.click();
	}
	
	public void checkoutclick() {
		
		checkout.click();
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

	 	public void ZipcodeValue() {

	 		Zipcode.sendKeys("20906");
	 	}
	 	
	 	public void cityValue() {
	 		
	 		city.sendKeys("Califronia");
	 	}
	 	
	 	public void phonenumberValue() {
	 		
	 		phonenumber.sendKeys("4949494040");
	 	}
	 	
	 	public void contiuneToShippingClick() {
	 		
	 		contiuneToShipping.click();
	 	}
	 	
	 	public void closeiconclick() {
	 		
	 	closeicon.click();
	 	}
	     
	
	
}
