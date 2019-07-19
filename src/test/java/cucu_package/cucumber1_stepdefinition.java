package cucu_package;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumber1_stepdefinition {
	@Given("^Browser must be installed by user$")
	public void browser_must_be_installed_by_user() throws Throwable {
		System.out.println("Browser must be installed by user");
	  
	}

	@When("^User enters AUT URL in browser$")
	public void user_enters_AUT_URL_in_browser() throws Throwable {
		System.out.println("User enters AUT URL in browser");
		  
	}

	@Then("^Application must open in the browser$")
	public void application_must_open_in_the_browser() throws Throwable {
		System.out.println("Application must open in the browser");
		  
	}

	@Given("^user must be in AUT login page$")
	public void user_must_be_in_AUT_login_page() throws Throwable {
		System.out.println("user must be in AUT login page");
		  
	}

	@When("^user enters the valid credentials$")
	public void user_enters_the_valid_credentials() throws Throwable {
		System.out.println("user enters the valid credentials");
		  
	}

	@Then("^User must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
		System.out.println("User must be in home page");
		  
	}

	@Given("^Home page must open$")
	public void home_page_must_open() throws Throwable {
		System.out.println("Home page must open");
		  
	}

	@When("^User enters the product to search$")
	public void user_enters_the_product_to_search() throws Throwable {
		System.out.println("User enters the product to search");
		  
	}

	@Then("^Product details must be displayed$")
	public void product_details_must_be_displayed() throws Throwable {
		System.out.println("Product details must be displayed");
		  
	}


}
