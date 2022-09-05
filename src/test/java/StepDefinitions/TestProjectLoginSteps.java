package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PF_Pages.TestProjectHomePage_PF;
import PF_Pages.TestProjectLoginPage_PF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProjectLoginSteps {

// ------------ With PageFactoryModel starts -----------------	

	// Creating object for stepDefination class
	WebDriver driver = null;

	// Creating object for PF page class
	TestProjectLoginPage_PF login;
	TestProjectHomePage_PF logout;

	// Hooks - before scenarios
	@Before("@browser")
	public void browserSetup() {
		
		
		// Normal Browser UI
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		/*
		//Headless browser without browser UI
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1366,768");
		driver = new ChromeDriver(options);
		*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters the (.*) & (.*)$")
	public void user_enters_the_username_password(String username, String password) {
		// Instance/Object of the 'TestProjectLoginPage' creation (PF)
		login = new TestProjectLoginPage_PF(driver);

		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() {
		login.clickLogin();
	}

	@Then("^user is redirected to landing page$")
	public void user_is_redirected_to_landing_page() {
		// Instance/Object of the 'TestProjectHomePage' creation (PF)
		logout = new TestProjectHomePage_PF(driver);
		
		logout.clickLogoutIsDisplayed();
	}

	// Hooks - after scenarios
	@After("@browser")
	public void teadDown() {
		driver.close();
		driver.quit();
	}

// ------------ With PageFactoryModel ends -----------------	

	/*
	 * // ------------ With PageObjectModel starts -----------------
	 * 
	 * //Creating object for stepDefination class WebDriver driver = null;
	 * 
	 * //Creating object for POM page class TestProjectLoginPage login;
	 * 
	 * 
	 * @Given("^browser is openn$") public void browser_is_openn() {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(10));
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 * 
	 * driver.manage().window().maximize(); }
	 * 
	 * @And("^user is on login page$") public void user_is_on_login_page() {
	 * 
	 * driver.navigate().to("https://example.testproject.io/web/"); }
	 * 
	 * @When("^user enters the (.*) & (.*)$") public void
	 * user_enters_the_username_password(String username, String password) {
	 * 
	 * //Instance/Object of the 'TestProjectLoginPage' creation (POM) login = new
	 * TestProjectLoginPage(driver);
	 * 
	 * login.enterUsername(username); login.enterPassword(password); }
	 * 
	 * @And("^user clicks on the login button$") public void
	 * user_clicks_on_the_login_button() {
	 * 
	 * login.clickLogin(); }
	 * 
	 * @Then("^user is redirected to landing page$") public void
	 * user_is_redirected_to_landing_page() {
	 * 
	 * login.clickLogout();
	 * 
	 * driver.close(); driver.quit(); }
	 * 
	 * // ------------ With PageObjectModel ends -----------------
	 */

	/*
	 * // ------------ WithOut PageObjectModel starts ----------------- WebDriver
	 * driver = null;
	 * 
	 * @Given("^browser is openn$") public void browser_is_openn() {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(10));
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	 * 
	 * driver.manage().window().maximize(); }
	 * 
	 * @And("^user is on login page$") public void user_is_on_login_page() {
	 * driver.navigate().to("https://example.testproject.io/web/"); }
	 * 
	 * @When("^user enters the (.*) & (.*)$") public void
	 * user_enters_the_username_password(String username, String password) {
	 * driver.findElement(By.id("name")).sendKeys(username);
	 * driver.findElement(By.id("password")).sendKeys(password); }
	 * 
	 * @And("^user clicks on the login button$") public void
	 * user_clicks_on_the_login_button() {
	 * driver.findElement(By.id("login")).click(); }
	 * 
	 * @Then("^user is redirected to landing page$") public void
	 * user_is_redirected_to_landing_page() {
	 * driver.findElement(By.id("logout")).isDisplayed(); driver.close();
	 * driver.quit(); } // -------------- WithOut PageObjectModel ends
	 * -----------------
	 */
}
