package com.MMT.pages;


import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.MMT.testbase.TestBase;

public class HotelSearch extends TestBase  {

	//Page Repository - OR Properties

	@FindBy(xpath="//*[@id='city']")
	WebElement hotel_city;


	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/input")
	WebElement hotelname;

	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/div/div/p[1]")
	WebElement Select_Hotelname;

	@FindBy(xpath="//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[2]/a/span[1]")
	WebElement  hotellogo;


	@FindBy(xpath="//*[@id='checkin']")
	WebElement Check_In;


	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[4]")
	WebElement Select_Check_In;


	@FindBy(xpath="//*[@id='checkout']")
	WebElement Check_Out;

	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[1]")
	WebElement Select_Check_Out;

	@FindBy(xpath="//*[@id='guest']")
	WebElement RoomGuest;

	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[4]")
	WebElement Adult;

	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[2]/li[3]")
	WebElement Child;

	@FindBy(xpath="//*[@id='0']")
	WebElement Child1agedropdown;

	@FindBy(xpath="//*[@id='0']/option[6]")
	WebElement SelectChild1age;

	@FindBy(xpath="//*[@id='1']")
	WebElement Child2agedropdown;

	@FindBy(xpath="//*[@id='1']/option[9]")
	WebElement SelectChild2age;

	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div/div/div[4]/div[1]/div[2]/button[2]")
	WebElement ApplyButton;

	@FindBy(xpath="//*[@id='hsw_search_button']")
	WebElement SearchButton;

	
	

	

	
	//initialize the page object

	public HotelSearch()
	{
		PageFactory.initElements(driver, this);
	}

	// Actions need to be performed

	public String ValidateHotelSearchPageTitle()
	{
		hotellogo.click();
		return driver.getTitle();
	}

	public boolean ValidateHotelIcon()
	{   hotellogo.click();
	return hotellogo.isDisplayed();
	}

	public void hotelsearchfields(String HotelName) throws InterruptedException
	{   hotellogo.click();
	hotel_city.click();
	hotelname.click();
	hotelname.sendKeys(HotelName);
	Select_Hotelname.click();
	Thread.sleep(3000);
	Check_In.click();
	Select_Check_In.click();		
	Thread.sleep(3000);
	Check_Out.click();
	Select_Check_Out.click();
	RoomGuest.click();
	Adult.click();
	Child.click();
	SelectChild1age.click();
	SelectChild2age.click();
	//			Select age1 = new Select(driver.findElement(By.xpath("Child1agedropdown")));
	//			age1.selectByVisibleText("5"); 
	ApplyButton.click();
	SearchButton.click();
	
	}

}

