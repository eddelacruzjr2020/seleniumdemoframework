package pageObjects;

public interface loginPageElements{
	
	//Sign-on Tab
	String txtUsername = "//input[@name='userName']";
	String txtPassword = "//input[@name='password']";
	String btnSubmit = "//input[@name='submit']";

	//Register tab
	String tabRegister = "//a[normalize-space()='REGISTER']";
}
