package com.home.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.home.pageobjectmodel.Contactus;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactus {
	WebDriver driver;
	
	@Given("^user visit homepage$")
	public void user_visit_homepage() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://demo.oscommerce.com");
		  
	}

	@Given("^click the contact us button$")
	public void click_the_contact_us_button() throws Throwable {
		Contactus obj2=new Contactus(driver);
		obj2.contactus().click();
	   
	}

	@When("^user enter \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2, String arg3) throws Throwable {
	
		Contactus obj2=new Contactus(driver);
		obj2.EmailAddress().sendKeys(arg1);
		obj2.fullname().sendKeys(arg2);
		obj2.Enquiry().sendKeys(arg3);
	   
	}

	@When("^user click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		Contactus obj2=new Contactus(driver);
		obj2.click_continue().click();
	   
	}

	@Then("^user should successfully send the contact information$")
	public void user_should_successfully_send_the_contact_information() throws Throwable {
	   
	}



}
