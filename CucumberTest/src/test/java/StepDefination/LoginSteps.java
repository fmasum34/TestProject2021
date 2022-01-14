package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
// ^ and $ is for start and ends for regexone.com
	@Given("user is navigation to the home page")
	public void user_is_navigation_to_the_home_page() {
		System.out.println("user is navigation to the home page");
	}

	@When("user enter the valid user ID and valid Password")
	public void user_enter_the_valid_user_id_and_valid_password() {
		System.out.println("user enter the valid user ID and valid Password");
	}

	@And("click on the login button of the home page")
	public void click_on_the_login_button_of_the_home_page() {
		System.out.println("click on the login button of the home page");
	}

	@Then("user should be able to successfull login to the Google account page")
	public void user_should_be_able_to_successfull_login_to_the_google_account_page() {
		System.out.println("user should be able to successfull login to the Google account page");
	}

}
