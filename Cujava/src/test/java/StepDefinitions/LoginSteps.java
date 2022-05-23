package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("^user in the portal login page$")
	public void user_in_the_portal_login_page() {
		
		System.out.println("Inside user in the login page");
		
	}

	@When("user enter the valid user name and password")
	public void user_enter_the_valid_user_name_and_password() {
		
		System.out.println("Inside user enter the user name and password");
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		
		System.out.println("Inside user click in the login button");
		
	}

	@Then("user successfully navigated to the user login page")
	public void user_successfully_navigated_to_the_user_login_page() {
		
		System.out.println("Inside user successfully navigated to the user login page");
		
	}	


}
