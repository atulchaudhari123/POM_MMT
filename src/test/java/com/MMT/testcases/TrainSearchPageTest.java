package com.MMT.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.TrainSearch;
import com.MMT.testbase.TestBase;

public class TrainSearchPageTest extends TestBase {
	 
	TrainSearch trainSearch;
	
	public TrainSearchPageTest()
	{
		super();
	}

	@BeforeMethod
	public void applicationSetup()
	{
		initialization();
		trainSearch= new TrainSearch();
	}
	
//	@Test(priority=1)
//	public void validateTrainSearchPageTitle()
//	{
//		String title = trainSearch.ValidateTrainSearchPageTitle();
//		System.out.println("Page title is = "+title);
//		Assert.assertEquals(title, "IRCTC Train Tickets Reservation | Indian Railways Reservation | IRCTC Train Tickets Booking, Trains Enquiry Online : MakeMyTrip");
//	}
//	
//	@Test(priority=2)
//	
//	public void validateTrainImage()
//	{
//		boolean flag = trainSearch.ValidateTrainLogoIcon();
//		Assert.assertTrue(true);
//	}
	
	
	@Test(priority=3, dataProvider="getData")
	public void validateTrainSearch(String TrainFromCity, String TrainToCity ) throws InterruptedException
	{
		trainSearch.ValidateTrainSearch(TrainFromCity, TrainToCity);
	}
	
//	@AfterMethod
//	
//	public void applicationkill()
//	{
//		driver.quit();
//	}

	@DataProvider
	public Object[][] getData()
	{
	Object[][] TestData = new Object[1][2];	
	TestData [0][0]= "Pune";
	TestData [0][1]= "Delhi";
	return TestData;
	}

}
