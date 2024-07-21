package luma.pages;

import luma.base.BasePage;
import org.testng.Assert;

public class signInPage extends BasePage {

	public void clicksSignInLink() {

		click("signIn_XPATH");
	}

	public void validateSignInTitle() {

		Assert.assertEquals(getText("customerLogin_XPATH"), "Customer Login");
		String signInTitle = getText("customerLogin_XPATH");
		System.out.println("SignIn title is :" + signInTitle);
	}

	public void enterValidEmailID(String emailID) {

		type("emailID_CSS", emailID);
	}

	public void enterValidPassword(String passowrd) {

		type("password_CSS", passowrd);
	}

	public void enterInValidEmailID(String emailID) {

		type("emailID_CSS", emailID);
	}

	public void enterInValidPassword(String passowrd) {

		type("password_CSS", passowrd);
	}

	public void clickSignInButton() {

		click("signInButton_CSS");
	}

	public void validateRegisteredCustomerText(String registeredCustomer) {

		Assert.assertEquals(getText("registeredCustomer_XPATH"), registeredCustomer);
	}

	public void validateExistingAccountText(String existingAccountText) {

		Assert.assertEquals(getText("existingAccountText_XPATH"), existingAccountText);
	}

	public void validateLoginErrorText() {

		Assert.assertEquals(getText("loginErrorText_XPATH"),
				"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
	}

	public void validateNewCustomerText(String newCustomerText) {

		Assert.assertEquals(getText("newCustomer_XPATH"), newCustomerText);
	}

	public void validateCreateCustomerText(String newCustomerSubText) {

		Assert.assertEquals(getText("createAccountText_XPATH"), newCustomerSubText);
	}

	public void clickCreateAccountButton() {

		click("createAccountButton_CSS");
	}

	public void validateCreateAccountTitle(String createCustomerTitle) {

		Assert.assertEquals(getText("createAccountTitle_XPATH"), createCustomerTitle);
	}

	public void clickForgotPasswordLink() {

		click("forgotPasswordLink_XPATH");
	}

	public void validateForgotPasswordPageTitle(String forgotPasswordTitle) {

		Assert.assertEquals(getText("forgotPasswordTitle_XPATH"), forgotPasswordTitle);
	}
}
