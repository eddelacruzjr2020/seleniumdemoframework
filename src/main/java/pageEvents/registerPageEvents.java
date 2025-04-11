package pageEvents;

import java.util.Dictionary;

import base.BaseTest;
import pageObjects.registerPageElements;

public class registerPageEvents extends BaseTest{
	
	loginPageEvents loginPage = new loginPageEvents();
	
	public void register(@SuppressWarnings("rawtypes") Dictionary registerDetails) {
		
		//Click Register tab
		loginPage.registerButton();
		
		//Fill up Register
		clear(registerPageElements.txtFirstName);
		sendKeys(registerPageElements.txtFirstName, registerDetails.get("firstName").toString());
		
		clear(registerPageElements.txtLastName);
		sendKeys(registerPageElements.txtLastName, registerDetails.get("lastName").toString());
		
		
		
	}

}
