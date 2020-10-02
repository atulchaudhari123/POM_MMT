package com.MMT.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.FlightReview;
import com.MMT.pages.FlightSearch;
import com.MMT.pages.FlightSearchResult;
import com.MMT.testbase.TestBase;
import com.MMT.util.TestUtil;

public class FlightReviewPageTest extends TestBase {
	
	FlightSearch flightSearch;
	FlightSearchResult flightSearchResult;
	FlightReview flightReview;
	
public FlightReviewPageTest()
{
	super();
}
	
@BeforeTest

public void applicationSetup()
{
	initialization();
	flightSearch = new FlightSearch();
	flightSearchResult = new FlightSearchResult();
	flightReview = new FlightReview();
}

@Test (dataProvider = "getData")

public void validateFlightbooking(String FlightFromCity, String FlightToCity) throws InterruptedException
{
	flightSearch.searchfields(FlightFromCity , FlightToCity);
	flightSearchResult.bookFlight();
	flightReview.reviewFlightbooking();
	
}

@DataProvider

 public Object [][] getData()
 {   Object[][] TestData = TestUtil.getData("FlightReviewPageTest");
//	Object [][]TestData = new Object[1][2];
//	
//	TestData[0][0]  = "Hyderabad";
//	TestData[0][1]  = "Mumbai";
	return TestData;
 }




}
