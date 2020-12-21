package com.MMT.testcases;

import org.apache.log4j.Logger;
import org.junit.rules.ErrorCollector;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.FlightSearch;
import com.MMT.testbase.TestBase;
import com.MMT.util.TestUtil;



public class FlightSearchPageTest extends TestBase {
	 public ErrorCollector errCollector = new ErrorCollector();
	FlightSearch flightSearch;
//	public static Logger APP_LOGS;
	public Logger APP_LOGS;

	public FlightSearchPageTest ()
	{
		super();	

	}
	
	@BeforeMethod
	
	public void applicationSetup()
	{
		initialization();
		
		flightSearch = new FlightSearch();
		APP_LOGS = Logger.getLogger("devpinoyLogger");
		APP_LOGS.debug("Testing the Amazon Application");
	}

	
	@Test (priority=1)
	public void FlightSearchPageTitleTest()
	{
		String title = flightSearch.ValidateSearchPageTitle();
		APP_LOGS.debug("Page Title is = "+title);
		Assert.assertEquals(title, "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
	}
	
	@Test (priority=2)
	public void ValidateFlightImageTest()
	{
	try
	{
		boolean flag = flightSearch.ValidateFlightIcon();
		APP_LOGS.debug("Flight image icon is = "+flag);
		Assert.assertTrue(false);
	}
	catch(Throwable t)
	{
		System.err.println("Logo issue");
		TestUtil.takeScreenShot("snap");
		errCollector.addError(t);
	}}
	

	@Test (dataProvider = "getData")
	public void searchFieldTest(String FlightFromCity, String FlightToCity) throws InterruptedException
	{
		flightSearch.searchfields(FlightFromCity,FlightToCity);
		
	}
	
	@AfterMethod
	
	public void applicationkill()
	{
		driver.quit();
	}
	
	
	@DataProvider
	
	public Object [][] getData()

	{   Object [][] TestData = TestUtil.getData("FlightSearchPageTest");
//		Object [][] TestData = new Object[1][2];
//	    
//	    TestData[0][0] = "Hyderabad";
//	    TestData[0][1] = "Mumbai";
	    
	    return TestData;
}
}