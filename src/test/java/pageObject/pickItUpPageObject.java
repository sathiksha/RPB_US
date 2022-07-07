package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pickItUpPageObject {

	private static pickItUpPageObject PickItUpDeliveyInstance;

	private pickItUpPageObject() {

	}

	public static pickItUpPageObject getInstance() {

		if(PickItUpDeliveyInstance==null) {

			PickItUpDeliveyInstance = new pickItUpPageObject();
		}

		return PickItUpDeliveyInstance;
	}

	@FindBy(linkText = "Ebikes")
	private WebElement EbikeLink;

	@FindBy(xpath = "//*[text()='Cargo & utility ']")
	private WebElement SelectEbike;
	
	@FindBy(xpath = "//button[contains(text(),'×')]")
	private WebElement closeicon;

	@FindBy(linkText = "Shop Now")
	private WebElement ShopNow;

	@FindBy(xpath = "//button[text()='Buy Now - ']")
	private WebElement Buynow;

	@FindBy(xpath = "//button[text()='Skip Step']")
	private WebElement Skipstep;

	@FindBy(xpath = "//div[@class='color-swatch color-swatch--white']/*[@class='color-swatch__item lazyloaded']")
	private WebElement Bikecolor;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement Nextbutton;

	@FindBy(xpath = "//input[@id='postalCode']")
	private WebElement postalcode;

	@FindBy(xpath = "//button[contains(text(),'View Options')]")
	private WebElement viewoptions;

	@FindBy(xpath = "(//button[text()='Pick it up '])[1]")
	private WebElement PickItUpOpiton;

	@FindBy(xpath = "//span[contains(text(),'Built by a Rad Local Bike Shop Partner')]")
	private WebElement selectDelivery;

	@FindBy(xpath = "//span[contains(text(),'Greenpath Electric bikes')]")
	private WebElement selectShop;

	@FindBy(xpath = "//button[contains(text(),'Save Selection')]")
	private WebElement saveselection;

	@FindBy(xpath = "//button[@id='add']")
	private WebElement AddToCart;

	@FindBy(xpath = "//a[text()='Begin Checkout']")
	private WebElement beigncheckoutbutton;

	@FindBy(xpath = "//button[contains(text(),'Checkout')]")
	private WebElement checkoutbutton;

	@FindBy(xpath = "//span[contains(text(),'Built by a Rad Local Bike Shop Partner')]")
	private WebElement verifyDeliveryoption;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement EmailBox;

	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@placeholder='Last name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement Address;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div[2]/div[2]/form/div[1]/div[2]/div[2]/div/div/div[5]/div/div/ul/li[1]/div")//li[@id='1']
	private WebElement AddressSelect;

	@FindBy(xpath = "//input[@placeholder='ZIP code']")
	private WebElement Zipcode;
	
	@FindBy(xpath = "//input[@placeholder='City']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@placeholder='Phone']")
	private WebElement phonenumber;
	
	@FindBy(xpath = "//button[@id='continue_button']")
	private WebElement contiuneToShipping;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/a[1]")
	private WebElement remove;


	public void Ebikelinkclick() {

		EbikeLink.click();
	}

	public void Selectbike() {

		SelectEbike.click();
	}

   public void clickCloseIcon() {
		
		closeicon.click();
	}
	
	public void ShopNowButtonclick() {

		ShopNow.click();
	}

	public void buyNowButtonClick() {

		Buynow.click();
	}

	public void skipstepClick() {

		Skipstep.click();
	}

	public void BikeColorselect() {

		Bikecolor.click();
	}

	public void NextButtonClick() {

		Nextbutton.click();
	}

	public void postalcodevalue( ) {

		postalcode.sendKeys("10038");
	}

	public void viewOptionclick() {

		viewoptions.click();
	}

	public void PickItoptionselect() {

		PickItUpOpiton.click();

	}

	public void selectDeliveryOptions() {

		selectDelivery.click();
	}

	public void selectShopOption() {

		selectShop.click();
	}     

	public void SaveSelectionOPtion() {

		saveselection.click();
	}

	public void AddtocartOption() {

		AddToCart.click();
	}

	public void beigncheckoutClick() {

		beigncheckoutbutton.click();
	}

	public String DeliveryOptionVerify() {

		return verifyDeliveryoption.getText();
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

	public void removeClick() {

		remove.click();
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
	
}
