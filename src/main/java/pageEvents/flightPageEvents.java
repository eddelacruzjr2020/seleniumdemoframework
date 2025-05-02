package pageEvents;

import java.util.Random;
import base.BaseTest;
import pageObjects.flightsPageElements;

public class flightPageEvents extends BaseTest{
	
	loginPageEvents loginPage = new loginPageEvents();
	Random rnd = new Random();
	
	public void reserveFlight() {
		loginPage.flightsButton();
		
		//Selection of Flight Type
		logger.info("Select a random Flight Type");
		int rndFlightType = rnd.nextInt(2);
		switch(rndFlightType) {
		
		case 0: 
			click(flightsPageElements.rdnOneWay);
			break;
			
		case 1:
			click(flightsPageElements.rdnRoundTrip);
			break;
		}
		
		//Selection of Passenger
		logger.info("Select numbers of Passenger");
		selectElementByVisibleText(flightsPageElements.slcPassenger, "4");
		
		logger.info("CLick Continue button");
		click(flightsPageElements.btnContinue);
		
		logger.info("Validate Back To Home button is displayed");
		assertElementIsDisplayed(flightsPageElements.btnBackToHome);
		
	}

}
