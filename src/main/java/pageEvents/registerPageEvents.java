package pageEvents;

import java.util.Dictionary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;
import pageObjects.flightPageElements;

public class registerPageEvents extends BaseTest{
	
	loginPageEvents loginPage = new loginPageEvents();
	
	public void register(@SuppressWarnings("rawtypes") Dictionary registerDetails) {
		
		//Click Register tab
		loginPage.registerButton();
		
		//Contact Information
		logger.info("Fill up Contact Information");
		clear(flightPageElements.txtFirstName);
		sendKeys(flightPageElements.txtFirstName, registerDetails.get("firstName").toString());
		clear(flightPageElements.txtLastName);
		sendKeys(flightPageElements.txtLastName, registerDetails.get("lastName").toString());
		clear(flightPageElements.txtPhone);
		sendKeys(flightPageElements.txtPhone, registerDetails.get("phone").toString());
		clear(flightPageElements.txtEMail);
		sendKeys(flightPageElements.txtEMail, registerDetails.get("email").toString());
		
		logger.info("Fill up Mailing Information");
		//Mailing Information
		clear(flightPageElements.txtAddress);
		sendKeys(flightPageElements.txtAddress, registerDetails.get("address").toString());
		clear(flightPageElements.txtCity);
		sendKeys(flightPageElements.txtCity, registerDetails.get("city").toString());
		clear(flightPageElements.txtStateProvinces);
		sendKeys(flightPageElements.txtStateProvinces, registerDetails.get("state").toString());
		clear(flightPageElements.txtPostalCode);
		sendKeys(flightPageElements.txtPostalCode, registerDetails.get("postalCode").toString());
		
		//User Information
		logger.info("Fill up User Information");
		clear(flightPageElements.txtUsername);
		sendKeys(flightPageElements.txtUsername, registerDetails.get("userName").toString());
		clear(flightPageElements.txtPassword);
		sendKeys(flightPageElements.txtPassword, registerDetails.get("password").toString());
		clear(flightPageElements.txtConfirmPassword);
		sendKeys(flightPageElements.txtConfirmPassword, registerDetails.get("password").toString());
		
		//Click Submit
		logger.info("Click Submit button");
		click(flightPageElements.btnSubmit);
		
	}
	
	public void validateUserRegister(@SuppressWarnings("rawtypes") Dictionary registerDetails) {
		String userNameLocator = "//b[normalize-space()='Note: Your user name is "+registerDetails.get("userName")+".']";
		assertElementIsDisplayed(userNameLocator);
	}

}
