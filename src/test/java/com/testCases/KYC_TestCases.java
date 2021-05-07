package com.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageFactory.KYC_POF;
import com.pageFactory.login_POF;
import com.resources.base;

public class KYC_TestCases extends base  {
	KYC_POF KYC_TC;
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
  public void f() throws InterruptedException {
	  KYC_TC = new KYC_POF(driver);
	  
	  KYC_TC.profileClick();
	  log.info("Clicked on Profile");
	 
	  KYC_TC.kycClick();
	  log.info("Clicked on KYC");
	  
	  KYC_TC.addAadhaarnumber("511498108178");
	  log.info("Added Aadhaar Number");
	  
	  KYC_TC.uploadAadharFront("C:\\Users\\rshiv\\Pictures\\Sample Aadhar\\Back.png");
	  log.info("Uploaded Aadharfront Image");
	  
	  KYC_TC.uploadAadharBack("C:\\Users\\rshiv\\Pictures\\Sample Aadhar\\Front.jpg");
	  log.info("Uploaded Aadharback Image");
	  
	  KYC_TC.submitAadhaarProof();
	  log.info("Aadhar submited");
	  
  }
  
  @AfterTest
	public void after() {
		driver.close();
	}
}
