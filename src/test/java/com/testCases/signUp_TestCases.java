package com.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageFactory.signUp_POF;

public class signUp_TestCases {
	public WebDriver driver;
	signUp_POF signUp_TC;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshiv\\RB\\RummyBazzi\\files\\chromedriver.exe");

		driver = new ChromeDriver();
		Reporter.log("This browser is opened");

		driver.manage().deleteAllCookies();
		Reporter.log("Deleted All Cookies");

		driver.manage().window().maximize();
		Reporter.log("This browser window maximized");

		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		Reporter.log("Page Load Time 1 sec");

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.get("https://www.rummybaazi.com");
		Reporter.log("RummyBaazi Site Opens");
		
	}

	@Test
	public void f() {
		

		signUp_TC = PageFactory.initElements(driver, signUp_POF.class);
		signUp_TC.signupAction("Tester6055", "Test@123", "Tester6055@digient.in", "1111111111");
	}
	
	@AfterTest
	public void after() {
		driver.close();
	}
}
