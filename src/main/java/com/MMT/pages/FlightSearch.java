package com.MMT.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class FlightSearch extends TestBase {
	
	
	//Page Repository - OR Properties
	
	@FindBy(xpath="//*[@id='fromCity']")
	WebElement sourcename;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	WebElement  cityname_From_values;
	
//	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]/p[1]")
//	WebElement FromCity_name;
	
	@FindBy(xpath="//ul[@role='listbox']//li")
	List<WebElement> FromCity_name;
	
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")
	WebElement  cityname_To_values;
	
//	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]/p[1]")
//	WebElement ToCity_Name;
	@FindBy(xpath="//ul[@role='listbox']//li")
	List<WebElement> ToCity_Name;
	
	@FindBy(xpath="//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[1]")
	WebElement  flightlogo;
	
//	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")
//	WebElement Departure;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[1]/div/p[1]")
	WebElement DepartureDate;
	
	@FindBy(xpath="//a[contains(text(), 'Search')]")
//	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/p/a")
	WebElement SearchButton;
	@FindBy(xpath="//div[@class='fli-intl-lhs pull-left']//div[@class='pull-left  make_relative price']//p")
//	@FindBy(xpath="//span[@class='actual-price']")
	List<WebElement> NoOfFlights ;
	

	
	
	//initialize the page object
	
	public FlightSearch()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Actions need to be performed
	
	public String ValidateSearchPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean ValidateFlightIcon()
	{
		return flightlogo.isDisplayed();
	}
	
	public void searchfields(String FlightFromCity, String FlightToCity ) throws InterruptedException
	{
		sourcename.click();
		cityname_From_values.click();
		cityname_From_values.sendKeys(FlightFromCity);
		Thread.sleep(4000);
//		FromCity_name.click();
		for(WebElement fromcity:FromCity_name )
		{
		String city = fromcity.getText();
		if(city.contains(FlightFromCity))
		{
			fromcity.click();
			break;
		}
		}
		Thread.sleep(3000);
		cityname_To_values.sendKeys(FlightToCity);
//		ToCity_Name.click();
		
		for(WebElement tocity:ToCity_Name)
		{
		String city =tocity.getText();
		if(city.contains(FlightToCity))
		{
			tocity.click();
			break;
		}
		}
		Thread.sleep(3000);
		DepartureDate.click();
		Thread.sleep(3000);
		SearchButton.click();
		Thread.sleep(3000);
		
		for(int second=0;second<=20;second++) 
		{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,200)", "");
	    }
		
		System.out.println(NoOfFlights.size());
		for(int i=0; i<NoOfFlights.size(); i++)
		{
		String AllFightCosts = NoOfFlights.get(i).getText();
		System.out.println(AllFightCosts);
		System.out.println(NoOfFlights.get(i).getText());
		}
		
		
	}
	
}