package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {

	
    @Given("^user is on login pagee$")
    public void user_is_on_login_page() {
    	System.out.println("Inside Step - user is on login pagee");
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password()  {
    	System.out.println("Inside Step - user enters username and password");
    }

    @And("^clicks on the login button$")
    public void clicks_on_the_login_button() {
    	System.out.println("Inside Step - clicks on the login button");
    }
    
    @Then("^user is navigated to the homepage$")
    public void user_is_navigated_to_the_homepage()  {
    	System.out.println("Inside Step - user is navigated to the homepage");
    }
    
    
    
    
    
    @When("^user click on the welcome link$")
    public void user_click_on_the_welcome_link() {
    	System.out.println("Inside Step - user click on the welcome link");
    }
    
    @Then("^logout link is displayed$")
    public void logout_link_is_displayed()  {
    	System.out.println("Inside Step - logout link is displayed");
    }
    

    
    
    @When("^user clicks on the dashboard link$")
    public void user_clicks_on_the_dashboard_link() {
    	System.out.println("Inside Step - user clicks on the dashboard link");
    }
    
    @Then("^quick lauch toolbar is displayed$")
    public void quick_lauch_toolbar_is_displayed() {
    	System.out.println("Inside Step - quick lauch toolbar is displayed");
    }
	
}
