package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import luma.pages.signInPage;

public class signInSteps {

	signInPage sip = new signInPage();
	
	@When("user clicks on Sign In Link on Luma Page")
	public void user_clicks_on_Sign_In_Link_on_Luma_Page() {
		
		sip.clicksSignInLink();
	}
	
	@Then("user validates title of Sign In page")
	public void user_validates_title_of_sign_in_page() {
	    
		sip.validateSignInTitle();
	}
	
	@When("user enters valid {string} emailID")
	public void user_enters_valid_email_id(String emailID) {
	   
		sip.enterValidEmailID(emailID);
	}

	@When("user enters valid {string} password")
	public void user_enters_valid_password(String password) {
	    
		sip.enterValidPassword(password);
	}

	@Then("user clicks on SignIn button")
	public void user_clicks_on_sign_in_button() {
	 
		sip.clickSignInButton();
	}
	
	@When("user validates text {string}")
	public void user_validates_text(String string) {
	    
		sip.validateRegisteredCustomerText(string);
	}

	@When("user validates sub text {string}")
	public void user_validates_sub_text(String string) {
	    
		sip.validateExistingAccountText(string);
	}
	
	@When("user enters invalid {string} emailID")
	public void user_enters_invalid_emailID(String emailId) {
		
		sip.enterInValidEmailID(emailId);
	}
	
	@And("user enters invalid {string} password")
	public void user_enters_invalid_password(String password) {
		
		sip.enterInValidPassword(password);
	}
	
	@Then("user receives error text as {string}")
	public void user_receives_error_text(String text) {
		
		sip.validateLoginErrorText();
		
	}
	
	@And("user validates New Customer text {string}")
	public void user_validates_New_Customer_text(String customerText) {
		
		sip.validateNewCustomerText(customerText);
	}
	
	@And("user validates Create Customer sub text {string}")
	public void user_validates_Create_Customer_sub_text(String newCustomerSubText) {
		
		sip.validateCreateCustomerText(newCustomerSubText);
	}

	@When("user clicks on createAccount button")
	public void user_clicks_on_create_account_button() {
	    
		sip.clickCreateAccountButton();
	}

	@Then("user lands on create Account Page {string}")
	public void user_lands_on_create_account_page(String createCustomerTitle) {
	 
		sip.validateCreateAccountTitle(createCustomerTitle);
	}
	
	@When("user clicks on forgot Password link")
	public void user_clicks_on_forgot_Password_link() {
		
		sip.clickForgotPasswordLink();
	}
	
	@Then("user lands on forgot Password Page {string}")
	public void user_lands_on_forgot_Password_Page(String forgotPasswordTitle) {
		
		sip.validateForgotPasswordPageTitle(forgotPasswordTitle);
	}
}
