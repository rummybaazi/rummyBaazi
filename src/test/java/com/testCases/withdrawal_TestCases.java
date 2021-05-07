package com.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.login_POF;
import com.pageFactory.withdrawal_POF;
import com.resources.base;

public class withdrawal_TestCases extends base {
	withdrawal_POF withdrawal_TC;
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
	public void Withdrawal() {
		withdrawal_TC = new withdrawal_POF(driver);
		
		withdrawal_TC.clickWithdrwal();
		log.info("Click on Withdrawal link");
		
		withdrawal_TC.emptyAmount();
		log.info("Enter You Amount Alert displayed");
		
		withdrawal_TC.maxAmountValidation();
		log.info("Enter the amount less than 30000 alert displayed");
		
		withdrawal_TC.clearAmount();
		withdrawal_TC.insufficentbalanceAlert();
		log.info("Insufficient balance Alert displayed");
		
		withdrawal_TC.clearAmount();
		withdrawal_TC.validAmountWithdraw("100");
		log.info("Amount Withdraw Successfully");
	}
	
	@AfterTest
	public void after() {
		driver.close();
	}
}
