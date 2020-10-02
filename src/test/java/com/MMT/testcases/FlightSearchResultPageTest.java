package com.MMT.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.FlightSearch;
import com.MMT.pages.FlightSearchResult;
import com.MMT.testbase.TestBase;
import com.MMT.util.TestUtil;

public class FlightSearchResultPageTest extends TestBase{
	
	FlightSearch flightSearch;
	FlightSearchResult flightSearchResult;

	
	public FlightSearchResultPageTest()
	{
		super();
	}

	
	@BeforeTest
	public void applicationSetup()
	{
	   initialization();
	   flightSearch = new FlightSearch();
	   flightSearchResult = new FlightSearchResult();
	}
	
	@Test (dataProvider = "getData")
	public void bookFlightverify(String FlightFromCity, String FlightToCity) throws InterruptedException
	{
		flightSearch.searchfields(FlightFromCity, FlightToCity);
		Thread.sleep(5000);
		flightSearchResult.bookFlight();
	}
	
	@AfterMethod
	
	public void applicationkill()
	{
		driver.quit();
	}
	
@DataProvider
	
	public Object [][] getData()

	{   Object[][] TestData = TestUtil.getData("FlightSearchResultPageTest");
//		Object [][] TestData = new Object[1][2];
//	    
//	    TestData[0][0] = "Hyderabad";
//	    TestData[0][1] = "Mumbai";
	    
	    return TestData;
}
}