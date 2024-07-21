package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import luma.base.BasePage;
import luma.pages.createAccountPage;
import luma.utils.SeleniumDriver;

public class createAccountSteps {
	
	createAccountPage cap = new createAccountPage();
	
	@Given("user is on Luma Website page")
	public void user_is_on_luma_website_page() {
	    
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));
	}

	@When("user clicks on Create an account link")
	public void user_clicks_on_create_an_account_link() {
	   
		cap.clickCreateAccountLink();
		
	}

	@When("user fills all required fields")
	public void user_fills_all_required_fields(io.cucumber.datatable.DataTable dataTable) {
	    
		cap.fillFirstName();
		cap.filllasttName();
		cap.fillEmailID();
		cap.fillPassword();
		cap.fillConfirmPassword();
		
		
		System.out.println("All data's are filled");
	    
	}

	@When("clicks on create an account button")
	public void clicks_on_create_an_account_button() {
	    
		cap.clickCreateAccountButton();
	}

	@Then("user should see a successful message on screen {string}")
	public void user_should_see_a_successful_message_on_screen(String string) {
	    
		System.out.println("Account successfully created");
	}

	

}
