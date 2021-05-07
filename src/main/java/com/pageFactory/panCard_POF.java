package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class panCard_POF {
	public panCard_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how = How.LINK_TEXT, using = "Profile") 
	 private WebElement Profile;
	 
	 @FindBy(how = How.LINK_TEXT, using = "KYC") 
	 private WebElement KYC;
	 
	 @FindBy(how = How.NAME, using = "aadhaarnumber") 
	 private WebElement aadhaarnumber;
	 
	 @FindBy(how = How.NAME, using = "aadhaarfront") 
	 private WebElement aadhaarfront;
	 
	 @FindBy(how = How.NAME, using = "aadhaarback") 
	 private WebElement username;
	 
	 @FindBy(how = How.NAME, using = "password") 
	 private WebElement aadhaarback;
	 
	 @FindBy(how = How.ID, using = "submitAadhaarProof") 
	 private WebElement submitAadhaarProof;
	 
	 public void panAction (String aadhaarnumber, String aadhaarfront, String aadhaarback) {
		Profile.click();
		KYC.click();
		this.aadhaarnumber.sendKeys(aadhaarnumber);
		this.aadhaarfront.sendKeys(aadhaarfront);
		submitAadhaarProof.click();
	 }
}
