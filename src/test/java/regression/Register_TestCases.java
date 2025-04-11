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
import pageEvents.registerPageEvents;

public class Register_TestCases extends BaseTest{
	String browser;
	Dictionary<String, String> registerDetails;
	registerPageEvents registerPage = new registerPageEvents();
	
	
	@BeforeTest(alwaysRun = true)
	@Parameters({"browser"})
	public void prepareReport(@Optional("chrome") String browser) {
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
	  
	  registerPage.register(registerDetails);
	  	  
	  
  }

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult result) {
		afterMethod(result, browser);
		
	}
	
}
	
	
