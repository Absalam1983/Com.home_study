package com.home.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactus {
	WebDriver driver;
	
	public Contactus(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//*[@id=\"columnLeft\"]/div[5]/div[2]/a[4]")
	 WebElement click_contactus;
	
	public WebElement contactus() {
		return click_contactus;}
	
	@FindBy(name="name")
	WebElement type_fullname;
	
	public WebElement fullname() {
		return type_fullname;}
	
	@FindBy(name="email")
	WebElement type_EmailAddress;
	
	public WebElement EmailAddress() {
		return type_EmailAddress;}
	
	@FindBy(name="enquiry")
	WebElement type_Enquiry;
	
	public WebElement Enquiry() {
		return type_Enquiry;}
	
	@FindBy(xpath="//*[@id=\"tdb4\"]/span[2]")
	WebElement click_continue;
	
	public WebElement click_continue() {
		return click_continue;}
	
	
}
