package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {

	@Given("clicks on login link")
	public void clicks_on_login_link() {
	    
		System.out.println("user is click on loginlink");
	}

	@And("User Enter the crendtails")
	public void user_enter_the_crendtails() {

		System.out.println("user enter the valid crendtails");

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    
		System.out.println("click login button");
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		
		System.out.println("loggged in successfully");
		
	   	}

}
