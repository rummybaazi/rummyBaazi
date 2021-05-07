package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class deposit_POF {
	public deposit_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Deposit")
	private WebElement Deposit;

	@FindBy(how = How.NAME, using = "userAmount")
	private WebElement userAmount;

	@FindBy(how = How.ID, using = "payment_type")
	private WebElement paymentType;

	@FindBy(how = How.ID, using = "agree")
	private WebElement agree;

	@FindBy(how = How.ID, using = "paymentsubmit")
	private WebElement addCash;
	
	@FindBy(how = How.ID, using = "userAmount-error")
	private WebElement userAmounterror;
	
	@FindBy(how = How.ID, using = "agree-error")
	private WebElement agreeerror;
	
	@FindBy(how = How.ID, using = "user_bonus_code-error")
	private WebElement user_bonus_codeerror;
	
	@FindBy(how = How.ID, using = "user_bonus_code")
	private WebElement user_bonus_code;
	
	public void addcashClick() {
		Deposit.click();
	}
	public void emptyfiledClick( ) {
		
		addCash.click();
		Assert.assertEquals(userAmounterror.getText(), "Enter the Amount");
		Assert.assertEquals(agreeerror.getText(), "Please agree terms & condition");
	}
	
	public void maxamountValidation ( ) {
		userAmount.sendKeys("100000");
		addCash.click();
		Assert.assertEquals(userAmounterror.getText(), "Enter the Amount less than 50000.00");
	}
	
	public void invalidBonusCode() {
		user_bonus_code.sendKeys("DemoDemo");
		addCash.click();
		Assert.assertEquals(user_bonus_codeerror.getText(), "Bonus code is not valid");
		
	}
	
	public void clearAll() {
		userAmount.clear();
		user_bonus_code.clear();
	}
	public void validDeposit(String userAmount) {
		this.userAmount.sendKeys(userAmount);
		paymentType.click();
		agree.click();
		addCash.click();
	}

}
