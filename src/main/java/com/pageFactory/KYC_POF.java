package com.pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class KYC_POF {

	public KYC_POF(WebDriver driver) {
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
	 private WebElement aadhaarback;
	 
	 @FindBy(how = How.ID, using = "submitAadhaarProof") 
	 private WebElement submitAadhaarProof;
	 
	 @FindBys(@FindBy(className = "p-3 d-flex justify-content-center"))
	 private List<WebElement> aadhaarSubmited;
	 
	 @FindBys(@FindBy(className = "sprite_all sprite-close"))
	 private List<WebElement> closebutton;
	 
	 public void profileClick() {
		 Profile.click();
	 }
	 
	 public void kycClick() {
		 KYC.click();
	 }
	 
	 public void addAadhaarnumber(String aadhaarnumber) {
		 this.aadhaarnumber.sendKeys(aadhaarnumber); 
	 }
	 
	 public void uploadAadharFront(String aadhaarfront) {
		 this.aadhaarfront.sendKeys(aadhaarfront);
	 }
	 
	 public void uploadAadharBack(String aadhaarback) {
		 this.aadhaarback.sendKeys(aadhaarback);
	 }
	 
	 public void submitAadhaarProof () {
			
		submitAadhaarProof.click();
	 }
	 
	 public void submittedMessagePopUp() {
		 Assert.assertEquals(aadhaarSubmited.get(0).getText(), "Aadhaar Request Id Not Regenerated");
	 }
	 
	 public void wait(WebDriver driver) {
		 
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated((By) closebutton));
		 
	 }
	 
	 public void ClosePopup() {
		 
		 closebutton.get(1).click();
	 }
}
