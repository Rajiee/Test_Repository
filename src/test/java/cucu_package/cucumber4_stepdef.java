package cucu_package;


import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumber4_stepdef {
	@Given("^users must be registered$")
	public void users_must_be_registered() throws Throwable {
	  System.out.println("users must be registered");  
	}

	@When("^user enters the below credentials$")
	public void user_enters_the_below_credentials(DataTable dt) throws Throwable {
	    List<Map<String,String>> credential=dt.asMaps(String.class, String.class);
	    for(int i=0;i<credential.size();i++)
	    	System.out.println(credential.get(i).get("username")+"\t"+credential.get(i).get("password"));
	    
	}

	@Then("^users must be in the home page$")
	public void users_must_be_in_the_home_page() throws Throwable {
	   System.out.println("logged in");
	}


}
