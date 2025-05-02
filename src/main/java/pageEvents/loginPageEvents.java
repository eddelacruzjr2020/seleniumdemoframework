package pageEvents;

import java.util.Dictionary;

import base.BaseTest;
import pageObjects.loginPageElements;

public class loginPageEvents extends BaseTest {
	
	public void registerButton() {
		logger.info("Click Register tab");
		click(loginPageElements.tabRegister);
	}
	
	public void login(@SuppressWarnings("rawtypes") Dictionary loginDetails) {
		//Username and Password
		logger.info("Login using username and password");
		clear(loginPageElements.txtUsername);
		sendKeys(loginPageElements.txtUsername, loginDetails.get("userName").toString());
		clear(loginPageElements.txtPassword);
		sendKeys(loginPageElements.txtPassword, loginDetails.get("password").toString());
		
		//Click Submit
		click(loginPageElements.btnSubmit);
		
	}
	
	public void validateSuccessfullyLogin() {
		logger.info("validate user successfully login");
		assertElementIsDisplayed(loginPageElements.hdrLoginSuccessfully);
		
	}
	
	public void flightsButton() {
		logger.info("Click Fights tab");
		click(loginPageElements.tabFlights);
	}

}
