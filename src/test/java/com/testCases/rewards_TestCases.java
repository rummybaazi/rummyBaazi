package com.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.login_POF;
import com.pageFactory.rewards_POF;
import com.resources.base;

public class rewards_TestCases extends base {
	rewards_POF rewards_TC;
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
		rewards_TC = PageFactory.initElements(driver, rewards_POF.class);
		rewards_TC.rewardsAction();
	}

	@AfterTest
	public void after() {
		driver.close();
	}
}
