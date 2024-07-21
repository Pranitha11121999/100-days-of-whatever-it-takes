package luma.pages;

import luma.base.BasePage;

public class createAccountPage extends BasePage {

	public void clickCreateAccountLink() {

		click("createAccount_XPATH");
	}

	public void fillFirstName() {

		type("firstName_XPATH", "Apple");
	}

	public void filllasttName() {

		type("lastName_XPATH", "Mango");
	}

	public void fillEmailID() {

		type("email_XPATH", "Apple@apple.com");
	}

	public void fillPassword() {

		type("password_XPATH", "1234567");
	}

	public void fillConfirmPassword() {

		type("confirmPassword_XPATH", "1234567");
	}

	public void clickCreateAccountButton() {

		click("createAccountButton_XPATH");
	}
}
