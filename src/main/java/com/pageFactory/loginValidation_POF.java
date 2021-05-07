package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginValidation_POF {

	public loginValidation_POF(WebDriver driver) {
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
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Invalid Username and Password')]")
	private WebElement invalidLogin;

	public void loginbutton() {
		loginButton.click();
	}
	
	public void getUsernameandPassword(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		loginSubmit.click();
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

	public WebElement getInvalidLoginErrorText() {
		return invalidLogin;
	}
	
	public void clearAll() {
		getusername.clear();
		getpassword.clear();
	}
}
