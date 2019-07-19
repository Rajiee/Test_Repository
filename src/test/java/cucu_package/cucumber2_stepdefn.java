package cucu_package;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumber2_stepdefn {
	@Given("^user must be registereed$")
	public void user_must_be_registereed() throws Throwable {
		System.out.println("user must be registereed");
	    
	}

	@When("^user must enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_must_enter_the_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		System.out.println("username is lalitha");
	}

	@Then("^user must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
		System.out.println("user must be in home page");
	}


  
}
