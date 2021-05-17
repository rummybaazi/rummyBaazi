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
	 private WebElement bonuse;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Tourney Tickets") 
	 private WebElement tourneyTickets;
	 
	 ///@FindBy(how = How.LINK_TEXT, using = "Redeem Code") 
	 //private WebElement redeem;
	 
	 @FindBy(how = How.LINK_TEXT, using = " My account") 
	 private WebElement myaccounts;
	 
	
	 @FindBy(how = How.LINK_TEXT, using = "Transactions") 
	 private WebElement Transactions;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Purchase Summary") 
	 private WebElement purchaseSummary;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Withdraw Summary") 
	 private WebElement withdrawSummary;
	 
	 @FindBy(how = How.LINK_TEXT, using = "RAF Bonus Summary") 
	 private WebElement RAFBonusSummary;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Bonus") 
	 private WebElement bonuses;
	 
	 @FindBy(how = How.LINK_TEXT, using = "History") 
	 private WebElement History;
	 
	 @FindBy(how = How.LINK_TEXT, using = "Tournament History") 
	 private WebElement tournamentHistory;
	 
	 @FindBy(how = How.LINK_TEXT, using = " Mid stake Mania") 
	 private WebElement  Mania;
	 
	 
	 @FindBy(how = How.LINK_TEXT, using = "lgout") 
	 private WebElement logout;
	 
	 
	 public void redirectionAction () {
		 bonuse.click();
		 tourneyTickets.click();
		 //redeem.click();
		 //myaccounts.click();
		 Transactions.click();
		 purchaseSummary.click();
		 withdrawSummary.click();
		 RAFBonusSummary.click();
		 bonuses.click();
		 History.click();
		 tournamentHistory.click();
		 Mania.click();
		 logout.click();
		 
	 }

	 
}
