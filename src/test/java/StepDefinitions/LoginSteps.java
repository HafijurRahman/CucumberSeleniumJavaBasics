package StepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	@Given("^User is on login page$") //regular expressions start-^, end-$
	public void user_is_on_login_page() {
		System.out.println("Inside Step - User is on login page");
	}

	@When("User enters the username & password")	
	public void user_enters_the_username_password() {
		System.out.println("Inside Step - User enters the username & password");
	}

	@And("Click on the login button")
	public void click_on_the_login_button() {
		System.out.println("Inside Step - Click on the login button");
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - User is navigated to the home page");
	}
	
	
	
    @Given("^User is on langing page$")
    public void user_is_on_langing_page() {
    	System.out.println("Inside Step - User is on langing page");
    }
    
    @And("^User clicks on sign up button$")
    public void user_clicks_on_sign_up_button() {
    	System.out.println("Inside Step - User clicks on sign up button");
    }
    
    @When("^User enters the following details$")
    public void user_enters_the_following_details(DataTable data) {
    	System.out.println("Inside Step - User enters the following details");
    	
    	/* 
    	// Method 1
    	List<List<String>> dataObjects = data.asLists();
    	System.out.println("First Name: " +dataObjects.get(0).get(0));
    	System.out.println("Last Name: " +dataObjects.get(0).get(1));
    	System.out.println("Postal Code: " +dataObjects.get(0).get(2));
    	System.out.println("City: " +dataObjects.get(0).get(3));
    	*/
    	
    	//Method 2
    	List<List<String>> dataObjects = data.asLists(String.class);
    	
    		for (List<String> e : dataObjects) {
    			System.out.println(e);
    		}
    }

    @And("^Clicks on the submit button$")
    public void clicks_on_the_submit_button(){
    	System.out.println("Inside Step - Clicks on the submit button");
    }
	
    @Then("^User gets a registration successful message$")
    public void user_gets_a_registration_successful_message() {
    	System.out.println("Inside Step - User gets a registration successful message");
    }	
	
	
}
