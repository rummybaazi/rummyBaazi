package com.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.login_POF;
import com.pageFactory.panCard_POF;
import com.resources.base;

public class panCard_TestCases extends base {
	panCard_POF panCard_TC;
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
	public void f() {
		panCard_TC = PageFactory.initElements(driver, panCard_POF.class);
		panCard_TC.panAction("511498108178", "C:\\Users\\rshiv\\Pictures\\Screenshots\\Image 3",
				"C:\\Users\\rshiv\\Pictures\\Screenshots\\Image 3");
	}

	@AfterTest
	public void after() {
		driver.close();
	}
}
