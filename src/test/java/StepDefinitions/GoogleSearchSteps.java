package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
		
	@Given("browser is open")
	public void browser_is_open() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(10));  
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://google.com/");
	}

	@When("user enters a search string in the search box")
	public void user_enters_a_search_string_in_the_search_box() {
		driver.findElement(By.name("q")).sendKeys("Automation");
	}
	
	@And("user hits enter from the physical keyboard")
	public void user_hits_enter_from_the_physical_keyboard() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user displays the search string results")
	public void user_displays_the_search_string_results() {
		driver.getPageSource().contains("What is automation? - IBM");
		driver.close();
		driver.quit();
	}
	
}
