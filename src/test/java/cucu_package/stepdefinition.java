package cucu_package;




import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
 
 
	  @Given("^user must be registered$")
	  public void user_must_be_registered() throws Throwable {
	     System.out.println("user must be registered");
	      
	  }

	  @When("^User enters credentials and performs login$")
	  public void user_enters_credentials_and_performs_login() throws Throwable {
	     System.out.println("User enters credentials and performs login");
	      
	  }

	  @Then("^User must be in the home page$")
	  public void user_must_be_in_the_home_page() throws Throwable {
		  System.out.println("User must be in the home page");
	      	     
	  }
	  @Given("^user must not be logged in$")
	  public void user_must_not_be_logged_in() throws Throwable {
		  System.out.println("user must not be logged in");
	      
	  }

	  @When("^user enters all the valid credentials$")
	  public void user_enters_all_the_valid_credentials() throws Throwable {
		  System.out.println("user enters all the valid credentials");
	     
	  }

	  @Then("^user has registered successfully$")
	  public void user_has_registered_successfully() throws Throwable {
		  System.out.println("user has registered successfully");
	  }

	  @Given("^user must be logged in$")
	  public void user_must_be_logged_in() throws Throwable {
		  System.out.println("user must be logged in");
	  }

	  @When("^user searches for a product$")
	  public void user_searches_for_a_product() throws Throwable {
		  System.out.println("user searches for a product");
	  }

	  @Then("^Product details are displayed$")
	  public void product_details_are_displayed() throws Throwable {
		  System.out.println("Product details are displayed");
	  }

	  @When("^user clicks on the signout button$")
	  public void user_clicks_on_the_signout_button() throws Throwable {
		  System.out.println("user clicks on the signout button");
	  }

	  @Then("^user has signed out$")
	  public void user_has_signed_out() throws Throwable {
		  System.out.println("user has signed out");
	  }




  }

