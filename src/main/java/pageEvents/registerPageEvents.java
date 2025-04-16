package pageEvents;

import java.util.Dictionary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;
import pageObjects.registerPageElements;

public class registerPageEvents extends BaseTest{
	
	loginPageEvents loginPage = new loginPageEvents();
	
	public void register(@SuppressWarnings("rawtypes") Dictionary registerDetails) {
		
		//Click Register tab
		loginPage.registerButton();
		
		//Contact Information
		clear(registerPageElements.txtFirstName);
		sendKeys(registerPageElements.txtFirstName, registerDetails.get("firstName").toString());
		clear(registerPageElements.txtLastName);
		sendKeys(registerPageElements.txtLastName, registerDetails.get("lastName").toString());
		clear(registerPageElements.txtPhone);
		sendKeys(registerPageElements.txtPhone, registerDetails.get("phone").toString());
		clear(registerPageElements.txtEMail);
		sendKeys(registerPageElements.txtEMail, registerDetails.get("email").toString());
		
		//Mailing Information
		clear(registerPageElements.txtAddress);
		sendKeys(registerPageElements.txtAddress, registerDetails.get("address").toString());
		clear(registerPageElements.txtCity);
		sendKeys(registerPageElements.txtCity, registerDetails.get("city").toString());
		clear(registerPageElements.txtStateProvinces);
		sendKeys(registerPageElements.txtStateProvinces, registerDetails.get("state").toString());
		clear(registerPageElements.txtPostalCode);
		sendKeys(registerPageElements.txtPostalCode, registerDetails.get("postalCode").toString());
		
		//User Information
		clear(registerPageElements.txtUsername);
		sendKeys(registerPageElements.txtUsername, registerDetails.get("userName").toString());
		clear(registerPageElements.txtPassword);
		sendKeys(registerPageElements.txtPassword, registerDetails.get("password").toString());
		clear(registerPageElements.txtConfirmPassword);
		sendKeys(registerPageElements.txtConfirmPassword, registerDetails.get("password").toString());
		
		//Click Submit
		click(registerPageElements.btnSubmit);
		
	}
	
	public void validateUserRegister(@SuppressWarnings("rawtypes") Dictionary registerDetails) {
		String userNameLocator = "//b[normalize-space()='Note: Your user name is "+registerDetails.get("userName")+".']";
		assertElementIsDisplayed(userNameLocator);
	}

}
