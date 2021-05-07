package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signUp_POF {
	public signUp_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(how = How.CLASS_NAME, using = "regbtn") 
	 private WebElement regiterButton;
	 
	 @FindBy(how = How.ID, using = "rusername") 
	 private WebElement rusername;
	 
	 @FindBy(how = How.ID, using = "rpassword") 
	 private WebElement rpassword;
	 
	 @FindBy(how = How.ID, using = "remailid") 
	 private WebElement remailid;
	 
	 @FindBy(how = How.ID, using = "rcontactno") 
	 private WebElement rcontactno;
	 
	 @FindBy(how = How.ID, using = "resent_text") 
	 private WebElement resent_text;
	 
	 @FindBy(how = How.ID, using = "otpverify") 
	 private WebElement otpverify;
	 
	 @FindBy(how = How.ID, using = "registartionSubmit") 
	 private WebElement registartionSubmit;
	 
	 public void signupAction (String rusername, String rpassword, String remailid, String rcontactno ) {
		
		 this.rusername.sendKeys(rusername);
		 this.rpassword.sendKeys(rpassword);
		 this.remailid.sendKeys(remailid);
		 this.rcontactno.sendKeys(rcontactno);
		 resent_text.click();
		 otpverify.click();
		 registartionSubmit.click();
	 }

}
