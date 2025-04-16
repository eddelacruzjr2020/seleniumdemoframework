package pageEvents;

import java.util.Dictionary;

import base.BaseTest;
import pageObjects.loginPageElements;

public class loginPageEvents extends BaseTest {
	
	public void registerButton() {
		click(loginPageElements.tabRegister);
	}
	
	public void login(@SuppressWarnings("rawtypes") Dictionary loginDetails) {
		//Username and Password
		clear(loginPageElements.txtUsername);
		sendKeys(loginPageElements.txtUsername, loginDetails.get("userName").toString());
		clear(loginPageElements.txtPassword);
		sendKeys(loginPageElements.txtPassword, loginDetails.get("password").toString());
		
		//Click Submit
		click(loginPageElements.btnSubmit);
		
	}
	
	public void validateSuccessfullyLogin() {
		assertElementIsDisplayed(loginPageElements.hdrLoginSuccessfully);
		
	}

}
