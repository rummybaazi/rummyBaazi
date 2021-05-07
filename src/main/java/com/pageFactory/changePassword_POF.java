package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class changePassword_POF {

	public changePassword_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Profile")
	private WebElement Profile;

	@FindBy(how = How.LINK_TEXT, using = "KYC")
	private WebElement KYC;

	@FindBy(how = How.LINK_TEXT, using = "Change Password")
	private WebElement changPassword;

	@FindBy(how = How.ID, using = "currentPassword")
	private WebElement currentPassword;

	@FindBy(how = How.ID, using = "newPassword")
	private WebElement newPassword;

	@FindBy(how = How.ID, using = "confirmPassword")
	private WebElement confirmPassword;

	@FindBy(how = How.ID, using = "currentPassword-error")
	private WebElement currentPassworderror;

	@FindBy(how = How.ID, using = "newPassword-error")
	private WebElement newPassworderror;

	@FindBy(how = How.ID, using = "confirmPassword-error")
	private WebElement confirmPassworderror;

	@FindBy(how = How.ID, using = "submitChangePassword")
	private WebElement submitChangePassword;

	public void Profileclick() {

		Profile.click();
	}

	public void changePasswordPage() {

		changPassword.click();
	}

	public void emptyField() {
		submitChangePassword.click();
		Assert.assertEquals(currentPassworderror.getText(), "Enter Your Current Password");
		Assert.assertEquals(newPassworderror.getText(), "Enter Your New Password");
		Assert.assertEquals(confirmPassworderror.getText(), "Enter Your Confirm Password");
	}

	public void invalidCurrentPassword() {
		currentPassword.sendKeys("Test");
		submitChangePassword.click();
		Assert.assertEquals(currentPassworderror.getText(), "Invalid Current Password!");
	}

	public void lessThan8Char() {
		newPassword.sendKeys("Test");
		confirmPassword.sendKeys("Test");
		submitChangePassword.click();
		Assert.assertEquals(newPassworderror.getText(), "Password must contain 8-16 characters");
		Assert.assertEquals(confirmPassworderror.getText(), "Password must contain 8-16 characters");
	}

	public void wrongPasswordFormat() {
		newPassword.sendKeys("Test1234");
		confirmPassword.sendKeys("Test1234");
		submitChangePassword.click();
		Assert.assertEquals(newPassworderror.getText(), "Enter password in correct format(Ex: Google@123)");
		Assert.assertEquals(confirmPassworderror.getText(), "Enter password in correct format(Ex: Google@123)");
	}

	public void sameOldandNewPassword() {
		currentPassword.sendKeys("Test@123");
		newPassword.sendKeys("Test@1234");
		confirmPassword.sendKeys("Test@12345");
		submitChangePassword.click();
		Assert.assertEquals(confirmPassworderror.getText(), "New & Confirm Password should does not match!");
	}

	public void clearAll() {
		currentPassword.clear();
		newPassword.clear();
		confirmPassword.clear();
	}

	public void validPasswordChange(String currentPassword, String newPassword, String confirmPassword) {
		
		this.currentPassword.sendKeys(currentPassword);
		this.newPassword.sendKeys(newPassword);
		this.confirmPassword.sendKeys(confirmPassword);
		submitChangePassword.click();
	}

}
