package com.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.login_POF;
import com.pageFactory.profile_POF;
import com.resources.base;

public class profile_TestCases extends base {
	profile_POF profile_TC;
	public WebDriver driver;

	@BeforeTest
	public void Login() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Site URL Launced");

		login_POF Login_TC = new login_POF(driver);

		Login_TC.loginbutton();
		log.info("Clicked On Login button");

		Login_TC.loginAction(prop.getProperty("NewUser"), prop.getProperty("NewPassword"));
		log.info("Logged in to the site successfully");
	}

	@Test
	public void Profile() throws IOException {

		profile_TC = new profile_POF(driver);

		profile_TC.gotoProfile();
		log.info("Clicked on the Profile Link");

		profile_TC.emptyFieldAlert();

		profile_TC.firstnameValidation("q");

		profile_TC.secondnameValidation("q");

		profile_TC.address1Validation("q");

		profile_TC.address2Validation("q");

		profile_TC.pincodeValidation("1");

		profile_TC.clearAll();
		log.info("All filed data cleared");

		profile_TC.validFirstandLastName("Test", "Demo");
		log.info("Valid First name and Last name entered");

		profile_TC.selectGenderMale();
		log.info("Selected Gender Male");

		profile_TC.selectGenderFemale();
		log.info("Selected Gender Female");

		profile_TC.validAddress1("No: 203");
		log.info("Entered Address 1");

		profile_TC.validAddress2("Gandhi Street");
		log.info("Entered Address 2");

		profile_TC.validLandMark("Bus Stop Back side");
		log.info("Entered Landmark");

		profile_TC.country();
		log.info("Country India is displayed");

		profile_TC.selectState("Puducherry");
		log.info("Selected State from Dropdown");

		profile_TC.selectCity("Pondicherry");
		log.info("Selected City from Dropdown");

		profile_TC.validPincode("123456");
		log.info("Entered valid Pincode");

		// profile_TC.submitProfile();
		log.info("Submited the Profile");
	}

	@AfterTest
	public void after() {
		// driver.close();
	}
}
