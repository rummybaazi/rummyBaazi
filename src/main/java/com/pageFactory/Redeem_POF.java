package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Redeem_POF {
	
	public Redeem_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		 @FindBy(how = How.LINK_TEXT, using = "Redeem Code") 
		 private WebElement Redeemcode;
		 
		

		 public void RedeemAction () {
			 Redeemcode.click();
		 }


}