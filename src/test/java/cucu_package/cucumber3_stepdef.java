package cucu_package;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumber3_stepdef {
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
	    System.out.println("User must be registered");
	}

	@When("^user enters the raji and raji$")
	public void user_enters_the_raji_and_raji() throws Throwable {
		 System.out.println("username and password entered");
	}

	@Then("^user must be in the home page$")
	public void user_must_be_in_the_home_page() throws Throwable {
		 System.out.println("logged in");
	}
	@When("^user enters the abc(\\d+) and abc(\\d+)$")
	public void user_enters_the_abc_and_abc(int arg1, int arg2) throws Throwable {
		 System.out.println("username and password entered");

	}
}
