package com.MMT.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.BusSearch;
import com.MMT.testbase.TestBase;

public class BusSearchPageTest extends TestBase {
	
	BusSearch busSearch;
	
	public BusSearchPageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void applicationsetup()
	{
		initialization();
		busSearch = new BusSearch();
	}

//	@Test(priority=1)
//	public void BusSearchPageTitleTest()
//	{ 
//		String title = busSearch.ValidateBusSearchPageTitle();
//		System.out.println("Bus Search Page Title is = " +title);
//		Assert.assertEquals(title, "Online Bus Ticket Booking, Book Confirmed Reservation Tickets @ MakeMyTrip");
//		
//	}
//	
//	@Test(priority=2)
//	public void ValidateBusSearchPageLogo()
//	{
//		boolean flag = busSearch.ValidateBusLogo();
//		Assert.assertTrue(true);
//	}
	
	@Test(priority=3, dataProvider="getData")
	public void ValidateBusSearch(String BusFromCity, String BusToCity) throws InterruptedException
	{
		busSearch.ValidateBusSearch(BusFromCity, BusToCity);
	}
	
	
	@AfterMethod
	public void applicationkill()
	{
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getData()
	{
	Object[][] TestData = new Object[1][2];	
	TestData [0][0]= "Hyderabad";
	TestData [0][1]= "Mumbai";
	return TestData;
	}
	
}
