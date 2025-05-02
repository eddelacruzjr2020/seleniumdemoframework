package regression;

import java.lang.reflect.Method;
import java.util.Dictionary;
import java.util.Hashtable;

import org.openqa.selenium.TimeoutException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.flightPageEvents;
import pageEvents.loginPageEvents;
import pageEvents.registerPageEvents;

public class Register_TestCases extends BaseTest{
	String browser;
	Dictionary<String, String> registerDetails;
	registerPageEvents registerPage = new registerPageEvents();
	loginPageEvents loginPage = new loginPageEvents();
	flightPageEvents flightsPage = new flightPageEvents();
	
	
	@BeforeTest(alwaysRun = true)
	@Parameters({"browser"})
	public void prepareReport(@Optional("chrome-headless") String browser) {
		this.browser = browser;
		beforeTestMethod(browser);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void setup(Method testMethod) throws TimeoutException{
		initializeBrowser(browser, testMethod);
	}
	
  @Test
  public void tc01_Register() {
	  registerDetails = new Hashtable<>();
	  registerDetails.put("firstName", "Ed");
	  registerDetails.put("lastName", "Dela Cruz");
	  registerDetails.put("phone", "09121234567");
	  registerDetails.put("email", "test@test.com");
	  registerDetails.put("address", "123 Test Way");
	  registerDetails.put("city", "Makati");
	  registerDetails.put("state", "Metro Manila");
	  registerDetails.put("postalCode", "1600");
	  registerDetails.put("userName", "AutoTest"+generate4Digit());
	  registerDetails.put("password", "Password"+generate4Digit());
	  
	  registerPage.register(registerDetails);
	  registerPage.validateUserRegister(registerDetails);
	  
  }
  
  @Test
  public void tc02_Login() {
	  loginPage.login(registerDetails);
	  loginPage.validateSuccessfullyLogin();
	  
  }
  
  @Test
  public void tc03_Reservation() {
	  flightsPage.reserveFlight();
	  
  }

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult result) {
		afterMethod(result, browser);
		
	}
	
}
	
	
