package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageRedirection_POF {
	public pageRedirection_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how = How.LINK_TEXT, using = "Bonuses") 
	 private WebElement Bonuses;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Tourney Tickets") 
	 private WebElement tourneyTickets;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Refer a Friend") 
	 private WebElement referAfriend;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Change Password") 
	 private WebElement changePassword;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Deposit") 
	 private WebElement Deposit;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Withdrawal") 
	 private WebElement Withdrawal;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Rewards") 
	 private WebElement Rewards;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Transactions") 
	 private WebElement Transactions;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Purchase Summary") 
	 private WebElement purchaseSummary;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Withdraw Summary") 
	 private WebElement withdrawSummary;
	 
	 @FindBy(how = How.LINK_TEXT, using = "RAF Bonus Summary") 
	 private WebElement RAFBonusSummary;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Bonus") 
	 private WebElement Bonus;
	 
	 @FindBy(how = How.LINK_TEXT, using = "History") 
	 private WebElement History;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Tournament History") 
	 private WebElement tournamentHistory;
	 
	 @FindBy(how = How.LINK_TEXT, using = "lgout") 
	 private WebElement logout;
	 
	 
	 public void redirectionAction () {
		 Bonus.click();
		 tourneyTickets.click();
		 referAfriend.click();
		 changePassword.click();
		 Deposit.click();
		 Withdrawal.click();
		 Rewards.click();
		 Transactions.click();
		 purchaseSummary.click();
		 withdrawSummary.click();
		 RAFBonusSummary.click();
		 Bonus.click();
		 History.click();
		 tournamentHistory.click();
		 logout.click();
		 
	 }

	 
}
