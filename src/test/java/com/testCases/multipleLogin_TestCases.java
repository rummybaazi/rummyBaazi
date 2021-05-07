package com.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pageFactory.login_POF;
import com.resources.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class multipleLogin_TestCases extends base {
	login_POF Login_TC;
	//ExtentReports extent;
	public WebDriver driver;
//private static Logger log = LogManager.getLogger(Login_TestCases.class.getName());
	
	
	@BeforeTest
	public void config() {
		// ExtentReports , ExtentSparkReporter
		
		/*
		 * String path =System.getProperty("user.dir")+"\\reports\\index.html";
		 * ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		 * reporter.config().setReportName("Web Automation Results");
		 * reporter.config().setDocumentTitle("Test Results"); extent =new
		 * ExtentReports(); extent.attachReporter(reporter);
		 * extent.setSystemInfo("Tester", "Siva Chandran R");
		 */
	}

	@Test (dataProvider = "getData")
	public void MultiLoginAction(String username, String password, String text) throws IOException {
	//	ExtentTest test= extent.createTest("Initial Demo");
		
		driver = intializeDriver();

		driver.get(prop.getProperty("url"));
		log.info("Site URL Launced");
		log.debug("Debug");
		log.error("Error");
		log.fatal("Fatal error");
		
		Login_TC = new login_POF(driver);
		

		Login_TC.loginbutton();
		log.info("Clicked on login");
		Login_TC.emptyfieldclick();
		
	//	Assert.assertEquals(Login_TC.getUsernameErrorText().getText(), "Enter Username");
	//	Assert.assertEquals(Login_TC.getPasswordErrorText(), "Enter Password");
		
		Login_TC.loginAction(username, password);
		log.info("Logged in to the site");
		
		log.info(text);
		driver.quit();
		//System.out.println(text);
		
		//test.fail("Result do not match");
		//extent.flush();
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\rshiv\\RB\\RummyBazzi\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		log.info(browserName);
		
		Object[][] data = new Object[2][3];
		
		data[0][0] =prop.getProperty("ExistingUser");
		data[0][1] =prop.getProperty("ExistingPassword");
		data[0][2] = "New User";
		
		data[1][0] = prop.getProperty("NewUser");
		data[1][1] = prop.getProperty("NewPassword");
		data[1][2] = "Existing User";
		return data;
	}
	
	@AfterTest()
	public void teardown() {
	
	}

}
