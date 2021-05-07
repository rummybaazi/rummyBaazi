package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class withdrawal_POF {
	public withdrawal_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Withdrawal")
	private WebElement Withdrawal;

	@FindBy(how = How.ID, using = "withdrawAmount")
	private WebElement withdrawAmount;
	
	@FindBy(how = How.ID, using = "withdrawAmount-error")
	private WebElement withdrawAmounterror;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
	private WebElement continueButton;
	
	public void clickWithdrwal() {
		Withdrawal.click();
	}
	public void emptyAmount() {
		continueButton.click();
		Assert.assertEquals(withdrawAmounterror.getText(), "Enter your amount");
	}
	
	public void maxAmountValidation() {
		withdrawAmount.sendKeys("9999999");
		continueButton.click();
        Assert.assertEquals(withdrawAmounterror.getText(), "Enter the Amount less than 30000");	
	}
	
	public void insufficentbalanceAlert() {
		withdrawAmount.sendKeys("29999");
		continueButton.click();
        Assert.assertEquals(withdrawAmounterror.getText(), "You do not have sufficient Withdrawable balance.");	
	}
	
	
	public void clearAmount() {
		withdrawAmount.clear();
	}

	public void validAmountWithdraw(String withdrawAmount) {
		
		this.withdrawAmount.sendKeys(withdrawAmount);
		//continueButton.click();
	}

}
