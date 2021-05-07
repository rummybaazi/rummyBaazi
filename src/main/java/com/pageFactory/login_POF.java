package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class login_POF {

	public login_POF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CLASS_NAME, using = "loginbtn")
	private WebElement loginButton;

	@FindBy(how = How.ID, using = "getusername")
	private WebElement getusername;

	@FindBy(how = How.ID, using = "getpassword")
	private WebElement getpassword;

	@FindBy(how = How.ID, using = "loginSubmit")
	private WebElement loginSubmit;

	@FindBy(how = How.NAME, using = "username")
	private WebElement username;

	@FindBy(how = How.NAME, using = "password")
	private WebElement password;

	@FindBy(how = How.CSS, using = "#getusername-error")
	private WebElement emptyUsername;

	@FindBy(how = How.CSS, using = "#getpassword-error")
	private WebElement emptyPassword;

	public WebElement emptyLogin() {
		loginButton.click();
		loginSubmit.click();
		return emptyPassword;
	}

	public void loginbutton() {
		loginButton.click();
	}

	public void emptyfieldclick() {
		getusername.click();
		getpassword.click();
		loginSubmit.click();
	}
	
	public WebElement getUsernameErrorText() {
		return emptyUsername;
	}
	
	public WebElement getPasswordErrorText() {
		return emptyPassword;
	}

	public void loginAction(String username1, String password1) {
		username.sendKeys(username1);
		password.sendKeys(password1);
		loginSubmit.click();
	}
}
