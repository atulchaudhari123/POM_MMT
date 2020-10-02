package com.MMT.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.FlightReview;
import com.MMT.pages.FlightSearch;
import com.MMT.pages.FlightSearchResult;
import com.MMT.pages.FlightSummary;
import com.MMT.testbase.TestBase;
import com.MMT.util.TestUtil;

public class FightSummaryPageTest extends TestBase {
	
	FlightSearch flightSearch;
	FlightSearchResult flightSearchResult;
	FlightReview flightReview;
	FlightSummary flightSummary;
	
	public FightSummaryPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void applicationSetup()
	{
		initialization();
		flightSearch = new FlightSearch();
		flightSearchResult = new FlightSearchResult();
		flightReview = new FlightReview();
		flightSummary = new FlightSummary();
	}
	
	@Test (dataProvider = "getData")
	public void validateReviewFlightSummary(String FlightFromCity, String FlightToCity, String FlightMobile, String FlightEmail ) throws InterruptedException
	{
		flightSearch.searchfields(FlightFromCity, FlightToCity);
		flightSearchResult.bookFlight();
		flightReview.reviewFlightbooking();
		flightSummary.validateFightSummary(FlightMobile, FlightEmail);
	}
	
	@DataProvider
	
	public Object [][] getData()
	{   
		Object[][] TestData = TestUtil.getData("FightSummaryPageTest");
//		Object[][] TestData = new Object[1][4];
//		TestData [0][0] = "Hyderabad";
//		TestData [0][1] = "Mumbai";
//		TestData [0][2] = "9823065876";
//		TestData [0][3] = "test1234@gmail.com";
		return TestData;
	}

}
