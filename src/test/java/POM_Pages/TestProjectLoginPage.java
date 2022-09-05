package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestProjectLoginPage {

	WebDriver driver; //WebDriver object creation
	
	//Web element locator creation/identifiers
	//Private - accessed within this class only
	//Protected - accessed within this class, sub-class & package only
	//Static - shared across all instances of the class
	By txt_username = By.id("name");
	By txt_password = By.id("password");
	By btn_login = By.id("login");
	By btn_logout = By.id("logout");
	// --- x ---
	
	
	//To make sure, the same 'driver' object is used so that we can maintain the same session -> we'd need to create a constructor
	//Constructor: It is a functional with the same name as a class name
	//This Constructor will be called each time when a object/instance is created for this 'TestProjectLoginPage' class
	//Force to pass the 'WebDriver Driver' instance inside the (xxx)
	public TestProjectLoginPage(WebDriver driver) { 
		
		this.driver = driver;
		
		//to verify if we are on the TestProjectLogin page
		if (!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not the TestProjectLogin page. The current page is "
			+driver.getCurrentUrl());
		}
	}
	
	
	//Method creation of all the objects of login page
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void clickLogout() {
		driver.findElement(btn_logout).isDisplayed();
	}
	// --- x ---
	
	
	/*
	// For real-life scenario > we'd need to create all the login methods into 1 class
	public void loginValidUserCredentials(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	// --- x ---
	*/
}
