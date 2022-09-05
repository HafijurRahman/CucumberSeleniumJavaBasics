package PF_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestProjectLoginPage_PF {

	WebDriver driver; //WebDriver object creation
	
	//Web element locator creation/identifiers
	//Private - accessed within this class only
	//Protected - accessed within this class, sub-class & package only
	@FindBy(id = "name")
	@CacheLookup //if the locators are not going to changed then we can use @CacheLookup for better optimization
	WebElement txt_username;
	
	@FindBy(how = How.ID, using = "password")
	WebElement txt_password;

	@FindBy(id = "login")
	WebElement btn_login;
	
	/*
	@FindBy(partialLinkText = "options")
	List<WebElement> myLinks;
	*/
	
	
	//To make sure, the same 'driver' object is used so that we can maintain the same session -> we'd need to create a constructor
	//Constructor: It is a functional with the same name as a class name
	//This Constructor will be called each time when a object/instance is created for this 'TestProjectLoginPage_PF' class
	//Force to pass the 'WebDriver Driver' instance inside the (xxx)
	public TestProjectLoginPage_PF(WebDriver driver) { 
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		/*
		// for AJAX web apps to avoid 'No Element Exception' error
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
		*/
		
		//to verify if we are on the TestProjectLoginPage_PF page
		if (!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not the TestProjectLogin page. The current page is "
			+driver.getCurrentUrl());
		}
	}
	
	
	
	
	//Method creation of all the objects of login page
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	// --- x ---
	
	
	
	/*
	// For real-life scenario > we'd need to create all the login methods into 1 class
	public void loginValidUserCredentials(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
	}
	// --- x ---
	*/
	
	
}
