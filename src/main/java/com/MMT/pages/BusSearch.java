package com.MMT.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class BusSearch extends TestBase{
	
	//Page Repository - OR Properties
	
	@FindBy(xpath="//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[6]/a/span[1]")
	WebElement BusLogo;
	
	@FindBy(xpath="//*[@id='fromCity']")
	WebElement From_City;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	WebElement FromCity_Value;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/p/span")
	WebElement Select_FromCity;
	
//	@FindBy(xpath="//*[@id='toCity']")
//	WebElement To_City;
//	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")
	WebElement ToCity_Value;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/p/span")
	WebElement Select_ToCity;
	
//	@FindBy(xpath="//*[@id='travelDate']")
//	WebElement TravelDate;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[4]")
	WebElement Select_TravelDate;
	
	@FindBy(xpath="//*[@id='search_button']")
	WebElement SearchButton;
	
	//initialize the page object
	
	public BusSearch()
	{
	PageFactory.initElements(driver, this);
	}
	
	// Actions need to be performed
	
	public String ValidateBusSearchPageTitle()
	{   BusLogo.click();
		return driver.getTitle();
	}
	
	public boolean ValidateBusLogo()
	{   BusLogo.click();
		return BusLogo.isDisplayed();
	}

	public void ValidateBusSearch(String BusFromCity, String BusToCity) throws InterruptedException
	{
		BusLogo.click();
		From_City.click();
		FromCity_Value.click();
		FromCity_Value.sendKeys(BusFromCity);
		Thread.sleep(3000);
		Select_FromCity.click();
		ToCity_Value.sendKeys(BusToCity);
		Thread.sleep(3000);
		Select_ToCity.click();
		Select_TravelDate.click();
		Thread.sleep(2000);
		SearchButton.click();
	
	}}