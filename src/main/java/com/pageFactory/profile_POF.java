package com.pageFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class profile_POF {
	public static Logger log = LogManager.getLogger(profile_POF.class.getName());
	public WebDriver driver;
	public profile_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how = How.LINK_TEXT, using = "Profile") 
	 private WebElement Profile;
	 
	 @FindBy(how = How.NAME, using = "fullname") 
	 private WebElement fullname;
	 
	 @FindBy(how = How.NAME, using = "lastname") 
	 private WebElement lastname;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='landmark']") 
	 private WebElement landmark;
	 
	 @FindBy(how = How.XPATH, using = "//input[@value='male']") 
	 private WebElement genderMale;
	 
	 @FindBy(how = How.XPATH, using = "//input[@value='female']") 
	 private WebElement genderFemale;
	 
	 @FindBy(how = How.NAME, using = "address1") 
	 private WebElement address1;
	 
	 @FindBy(how = How.NAME, using = "address2") 
	 private WebElement address2;
	 
	 @FindBy(how = How.XPATH, using = "//p [@class ='username-filled-details'][contains(text(), 'India')]") 
	 private WebElement country;
	 
	 @FindBy(how = How.NAME, using = "pincode") 
	 private WebElement pincode;
	 
	 @FindBy(how = How.NAME, using = "state") 
	 private WebElement state;
	 
	 @FindBy(how = How.NAME, using = "city") 
	 private WebElement city;
	 
	 @FindBy(how = How.ID, using = "userProfileSubmit") 
	 private WebElement userProfileSubmit;
	 
	 @FindBy(how = How.ID, using = "fullname-error") 
	 private WebElement fullnameerror;
	 
	 @FindBy(how = How.ID, using = "lastname-error") 
	 private WebElement lastnameerror;
	 
	 @FindBy(how = How.ID, using = "gender-error") 
	 private WebElement gendererror;
	 
	 @FindBy(how = How.ID, using = "address1-error") 
	 private WebElement address1error;
	 
	 @FindBy(how = How.ID, using = "address2-error") 
	 private WebElement address2error;
	 
	 @FindBy(how = How.ID, using = "state-error") 
	 private WebElement stateerror;
	 
	 @FindBy(how = How.ID, using = "city-error") 
	 private WebElement cityerror;
	 
	 @FindBy(how = How.ID, using = "pincode-error") 
	 private WebElement pincodeerror;
	 
	 
	 public void gotoProfile() {
		 Profile.click();
	 }
	 
	 public void emptyFieldAlert() {
		 userProfileSubmit.click();
		 Assert.assertEquals(fullnameerror.getText(), "Enter Your Full Name");
		 log.info("Enter Your Full Name Alert Displayed");
		 
		 Assert.assertEquals(lastnameerror.getText(), "Enter Your Last Name");
		 log.info("Enter Your Last Name Alert Displayed");
		 
		 Assert.assertEquals(gendererror.getText(), "Select Your Gender");
		 log.info("Select Your Gender Alert Displayed");
		 
		 Assert.assertEquals(address1error.getText(), "Enter Your Address Line 1");
		 log.info("Enter Your Address Line 1 Alert Displayed");
		
		 Assert.assertEquals(address2error.getText(), "Enter Your Address Line 2");
		 log.info("Enter Your Address Line 2 Alert Displayed");
		 
		 Assert.assertEquals(stateerror.getText(), "Enter Your State");
		 log.info("Enter Your State Alert Displayed");
		 
		 Assert.assertEquals(cityerror.getText(), "Enter Your City");
		 log.info("Enter Your City Alert Displayed");
		 
		 Assert.assertEquals(pincodeerror.getText(), "Enter Your Pincode");
		 log.info("Enter Your Pincode Alert Displayed");
	 }
	 
	 public void firstnameValidation(String fullname) {
		 this.fullname.sendKeys(fullname);
		 userProfileSubmit.click();
		 Assert.assertEquals(fullnameerror.getText(), "Please enter at least 4 characters.");
		 log.info("Please enter at least 4 characters. Alert Displayed");
	 }
	 
	 public void secondnameValidation(String lastname) {
		 this.lastname.sendKeys(lastname);
		 userProfileSubmit.click();
		 Assert.assertEquals(lastnameerror.getText(), "Please enter at least 2 characters.");	 
		 log.info("Please enter at least 2 characters. Alert Displayed");
	 }
	 
	 public void address1Validation(String address1) {
		 this.address1.sendKeys(address1);
		 userProfileSubmit.click();
		 Assert.assertEquals(address1error.getText(), "Please enter at least 4 characters.");	
		 log.info("Please enter at least 4 characters. Alert Displayed");
	 }
	 
	 public void address2Validation(String address2) {
		 this.address2.sendKeys(address2);
		 userProfileSubmit.click();
		 Assert.assertEquals(address2error.getText(), "Please enter at least 4 characters.");	 
		 log.info("Please enter at least 4 characters. Alert Displayed");
	 }
	 
	 public void pincodeValidation(String pincode) {
		 this.pincode.sendKeys(pincode);
		 userProfileSubmit.click();
		 Assert.assertEquals(pincodeerror.getText(), "Minimum 6 digit pincode");
		 log.info("Minimum 6 digit pincode Alert Displayed");
	 }
	 
	 public void clearAll() {
		 fullname.clear();
		 lastname.clear();
		 address1.clear();
		 address2.clear();
		 pincode.clear();
	 }
	 
	 public void validFirstandLastName(String fullname, String lastname) {
		 this.fullname.sendKeys(fullname);
		 this.lastname.sendKeys(lastname);
	 }
	 
	 public void selectGenderFemale() {
		 genderFemale.click();	 
	 }
	 
	 public void selectGenderMale() {
		 genderMale.click();
	 }
	 
	 public void validAddress1(String address1) {
		 this.address1.sendKeys(address1);	 
	 }
	 
	 public void validAddress2(String address2) {
		 this.address2.sendKeys(address2);	 
	 }
	 
	 public void validLandMark(String landmark) {
		 this.landmark.sendKeys(landmark);	 
	 }
	 
	 public void country() {
		 country.isDisplayed();
	 }
	 
	 public void selectState(String state1) {
		 Select state = new Select(this.state);
		 state.selectByVisibleText(state1);
	 }
	 
	 public void selectCity(String city1) {
		 Select city = new Select(this.city);
		 city.selectByVisibleText(city1);
	 }
	 
	 public void validPincode(String pincode) {
		 this.pincode.sendKeys(pincode);
	 }
	 
	 public void submitProfile() {
		 userProfileSubmit.click();
	 }

}
