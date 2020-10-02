package com.MMT.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.CabSearch;
import com.MMT.testbase.TestBase;

public class CabSearchPageTest extends TestBase{
	
	CabSearch cabSearch;
	
	public CabSearchPageTest()
	{
		super();
	}
	
	@BeforeMethod
	
	public void applicationsetup()
	{
		initialization();
		cabSearch = new CabSearch();
	}
	
//	@Test(priority=1)
//	
//	public void verifyCabSearchpagetitle()
//	{
//		String title = cabSearch.validatePageTitle();
//		System.out.println("Cab Search page title is =" +title);
//		Assert.assertEquals(title, "Online Cab Booking - Book Outstation Cabs at Lowest Fare @ MakeMyTrip");
//		
//	}
//	
//	@Test(priority=2)
//	public void verifycablogo()
//	
//	{
//		boolean flag = cabSearch.validateCabLogo();
//		Assert.assertTrue(true);
//		
//	}
	
	@Test(priority=3, dataProvider="getData")
	public void validateCabSearchTest(String CabFromCity, String CabToCity ) throws InterruptedException
	{
		cabSearch.validateCabSearch(CabFromCity, CabToCity);
	}
	
//	@AfterMethod
//	public void applicationkill() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		driver.quit();
//	}

	@DataProvider
	public Object[][] getData()
	{
	Object[][] TestData = new Object[1][2];	
	TestData [0][0]= "Banglore";
	TestData [0][1]= "Hyderabad";
	return TestData;
	}
}
