package PF_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestProjectHomePage_PF {

	WebDriver driver; //WebDriver object creation
	
	//Web element locator creation/identifiers
	//Private - accessed within this class only
	//Protected - accessed within this class, sub-class & package only
	@FindBy(id = "logout")
	WebElement btn_logout;
	
	//To make sure, the same 'driver' object is used so that we can maintain the same session -> we'd need to create a constructor
	//Constructor: It is a functional with the same name as a class name
	//This Constructor will be called each time when a object/instance is created for this 'TestProjectHomePage_PF' class
	//Force to pass the 'WebDriver Driver' instance inside the (xxx)
	public TestProjectHomePage_PF(WebDriver driver) { 
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		/*
		// for AJAX web applications to avoid 'No Element Exception' error
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
		*/
		
		//to verify if we are on the TestProjectHomePage_PF page
		if (!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not the TestProjectLogin page. The current page is "
			+driver.getCurrentUrl());
		}
	}
	
	
	//Method creation of all the objects of logout page
	public void clickLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}
	// --- x ---
	
}
