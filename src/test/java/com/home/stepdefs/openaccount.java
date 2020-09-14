package com.home.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class openaccount {
	
	WebDriver driver;
	
	@Given("^user should visiting homepage$")
	public void user_should_visiting_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
	    
	}

	@Given("^click create a new bank account button$")
	public void click_create_a_new_bank_account_button() throws Throwable {
	    
	}

	@When("^user should enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_enter_and(String arg1, String arg2) throws Throwable {
	   
	}

	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
	   
	}

	@Then("^user should successfully login to the system$")
	public void user_should_successfully_login_to_the_system() throws Throwable {
	   
	}

	@Then("^click on Log off Button for logout$")
	public void click_on_Log_off_Button_for_logout() throws Throwable {
	   
	}


}
