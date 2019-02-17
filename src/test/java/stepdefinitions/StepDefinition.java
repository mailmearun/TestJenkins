package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^Launch HR Application$")
	public void launch_HR_Application() throws Throwable {
		System.out.println("Step 1");
	}

	@When("^Enter user and pass on login page$")
	public void enter_user_and_pass_on_login_page() throws Throwable {
		System.out.println("Step 2");
	}

	@When("^User is navigated to home page$")
	public void user_is_navigated_to_home_page() throws Throwable {
		System.out.println("Step 3");
	}

	@Then("^User is able to successfully logged in$")
	public void user_is_able_to_logged_in() throws Throwable {
	    System.out.println("Step 4");
	}

}
