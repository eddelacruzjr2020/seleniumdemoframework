package pageObjects;

public interface loginPageElements{
	
	//Sign-on Tab
	String txtUsername = "//input[@name='userName']";
	String txtPassword = "//input[@name='password']";
	String btnSubmit = "//input[@name='submit']";
	String hdrLoginSuccessfully = "//h3[normalize-space()='Login Successfully']";

	//Register tab
	String tabRegister = "//a[normalize-space()='REGISTER']";
	
	//Reservation/Flights tab
	String tabFlights = "//a[normalize-space()='Flights']";
}
