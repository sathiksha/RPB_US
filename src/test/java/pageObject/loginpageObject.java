package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpageObject {

	private static loginpageObject LoginInstance;

	private loginpageObject() {

	}

	public static loginpageObject getInstance() {

		if(LoginInstance==null) {

			LoginInstance = new loginpageObject();
		}

		return LoginInstance;
}

	@FindBy(xpath = "//a[@class='desktop-only']")
	private  WebElement loginlink;
	
	@FindBy(xpath = "//input[@id='login-customer[email]']")
	private WebElement USERNAME;
	
	@FindBy(xpath = "//input[@id='login-customer[password]']")
	private WebElement PASSWORD;
	
	@FindBy(xpath = "//button[@title='Secure Sign In']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[@id='recaptcha-anchor']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement sumbit;
	
	
	public void clickLoginLink() {
		
		loginlink.click();
	}
	
	public void enterUserName(String userName) {
		
		USERNAME.sendKeys(userName);
		
	}
	
	
    public void enterPassword(String userName) {
		
		PASSWORD.sendKeys(userName);
	}
    
     public void clickLoginButt() {
		
		loginButton.click();
	}    
     
    public void checkboxClick() {
    	
    	  checkbox.click();
     }
    
    public void sumbitButton() {
    	
    	sumbit.click();
    }
}