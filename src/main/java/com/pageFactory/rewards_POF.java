package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class rewards_POF {
	
	public rewards_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how = How.LINK_TEXT, using = "Rewards") 
	 private WebElement Rewards;
	 
	 @FindBy(how = How.ID, using = "claim_rewards") 
	 private WebElement claim_rewards;
	 
	 //@FindBy(how = How.ID, using = "clsBtn") 
	 //private WebElement clsBtn;
	 
	 //@FindBy(how = How.ID, using = "claimBtn") 
	 //private WebElement claimBtn;
	 
	
	
	 
	 public void rewardsAction () {
		 Rewards.click();
		claim_rewards.click();
		
	 }
	


}
