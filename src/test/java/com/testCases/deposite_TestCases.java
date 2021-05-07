package com.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.deposit_POF;
import com.pageFactory.login_POF;
import com.resources.base;

public class deposite_TestCases extends base {
	deposit_POF deposit_TC;
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
	public void Deposit() throws IOException {
		deposit_TC = new deposit_POF(driver);

		deposit_TC.addcashClick();
		log.info("Click on Add Cash");

		deposit_TC.emptyfiledClick();
		log.info("Empty Field Error Message");

		deposit_TC.clearAll();
		deposit_TC.maxamountValidation();
		log.info("Max amount validation error message");

		deposit_TC.clearAll();
		deposit_TC.invalidBonusCode();
		log.info("Invalid Bonus Code Error Message");

		deposit_TC.clearAll();

		deposit_TC.validDeposit("100");
		log.info("Valid Deposit Amount, redirected to payment Gateway");

	}
	
	@AfterTest
	public void after() {
		driver.close();
	}
}
