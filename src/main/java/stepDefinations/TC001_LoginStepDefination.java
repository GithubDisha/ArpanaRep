package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
	@Given("user is on home page")
	public void user_is_on_home_page() {
	   System.out.println("Launch rediff.. ");
	}
	@When("user clicks on Signin link")
	public void user_clicks_on_signin_link() {
	   System.out.println("Click on Signin link");
	}
	@Then("check title")
	public void check_title() {
	   System.out.println("Verify title");
	}
	@When("user enters username and password clicks on Submit")
	public void user_enters_username_and_password_clicks_on_submit() {
	    System.out.println("Enter user name and password click on submit button");
	}
	@Then("Check Login Successful")
	public void check_login_successful() {
	    System.out.println("Check user and display Login Successful...");
	}
	@When("user enters valid username and invalid password clicks on Submit")
	public void user_enters_valid_username_and_invalid_password_clicks_on_submit() {
	   System.out.println("enter valid user name and invalid password");
	}
	@Then("check error message")
	public void check_error_message() {
	    System.out.println("Invalid user name or password entered");
	}
	@When("user enters invalid username and valid password clicks on Submit")
	public void user_enters_invalid_username_and_valid_password_clicks_on_submit() {
	    System.out.println("Enter invalid user name and valid password");
	}






}
