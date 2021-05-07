package com.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.changePassword_POF;
import com.pageFactory.login_POF;
import com.resources.base;

public class changePassword_TestCases extends base{
	changePassword_POF changePassword_TC;
	public WebDriver driver;
	
	@BeforeTest
	public void Login() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Site URL Launced" +prop.getProperty("url"));
		
		login_POF Login_TC = new login_POF(driver);
		
		Login_TC.loginbutton();
		log.info("Clicked On Login button");
		
		Login_TC.loginAction(prop.getProperty("NewUser"), prop.getProperty("NewPassword"));
		log.info("Logged in to the site successfully");
	}

	@Test
	public void ChangePassword() {

		changePassword_TC = new changePassword_POF(driver);

		changePassword_TC.Profileclick();
		log.info("Clicked on Profile Link");

		changePassword_TC.changePasswordPage();
		log.info("Click on Change Password Sucess");

		changePassword_TC.emptyField();
		log.info("Empty Field Error Message displayed");

		changePassword_TC.clearAll();
		changePassword_TC.invalidCurrentPassword();
		log.info("Invalid Current Password Error Message Displayed");

		changePassword_TC.clearAll();
		changePassword_TC.lessThan8Char();
		log.info("Less than 8 character Error messgae displayed in New and Confirm Password ");

		changePassword_TC.clearAll();
		changePassword_TC.wrongPasswordFormat();
		log.info("Wrong Password Format Error message displayed in New and COnfirm Password");

		changePassword_TC.clearAll();
		changePassword_TC.sameOldandNewPassword();
		log.info("Same Old and New Password Error Message displayed in New Password Field");

		changePassword_TC.clearAll();
		changePassword_TC.validPasswordChange("Test@123", "Test@1234", "Test@1234");
		log.info("Password Change Submitted Sucessfully");
	}

	@AfterTest
	public void after() {
		driver.close();
	}

}
