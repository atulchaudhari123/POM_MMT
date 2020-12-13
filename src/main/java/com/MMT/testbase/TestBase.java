package com.MMT.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.MMT.excelReader.ExcelDataReader;
import com.MMT.util.TestUtil;


public class TestBase {

	
	public static Properties prop = null;
	public static WebDriver driver = null;
	public static ExcelDataReader datatable = null;
public TestBase(){
try
		{
	// Configure properties file

 prop = new Properties ();
 FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\MMT\\config\\config.properties");
 prop.load(fn);
 
		}
catch(FileNotFoundException e)

{
	e.printStackTrace();
}
catch(IOException e)
{
	e.printStackTrace();
}}

public static void initialization()
{
	String BrowserName = prop.getProperty("browserType");
	
 if (BrowserName.equals("Firefox"))
 {
	 System.setProperty("webdriver.gecko.driver","D:\\Silenium\\Selenium Webdriver Download\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	 System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"D:\\Silenium\\Selenium Web Driver\\Borland Application\\firefox.log");
	 System.out.println("Firefoxdriver file has been saved in local driver");
	 driver = new FirefoxDriver();
	  
 }
 
 else if (BrowserName.equals("chrome"))
 {
	    System.setProperty("webdriver.chrome.driver","C:\\Atul\\Silenium\\Selenium Webdriver Download\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Chrome browser successfully launched along with application"); 
 }
 
 else if (BrowserName.equals("IE"))
 {
	    System.setProperty("webdriver.ie.driver","D:\\Silenium\\Selenium Webdriver Download\\IEDriverServer_x64_2.40.0\\IEDriverServer.exe");
		driver= new InternetExplorerDriver();
		System.out.println("IE browser successfully launched along with application");
 }
 
 
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout,TimeUnit.SECONDS);
 driver.manage().timeouts().implicitlyWait(TestUtil.implicitWait,TimeUnit.SECONDS);
 driver.get(prop.getProperty("ApplicationURL"));
 
}}
