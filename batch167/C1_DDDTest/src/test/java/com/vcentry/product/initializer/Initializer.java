package com.vcentry.product.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vcentry.product.utils.ReportArchiver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {
	/**
	 * @author venkat
	 * @date - 20 june 2021
	 * extent report variables
	 */
	public static ExtentReports reports;
	public static ExtentTest log;
	public static boolean isReportExist=false;
	
	/**
	 * @author venkat
	 * @date-15th june 2021
	 * envprop variable initialize env.properties
	 * 
	 */
	public static Properties envprop=null;
	/**
	 * @author venkat
	 * @date-15th june 2021
	 * locatorprop variable initialize locator.properties
	 * 
	 */
	public static Properties locatorProp=null;
	/**
	 * @author venkat
	 * @date-15th june 2021
	 * wd variable initialize webdrivers
	 * 
	 */
	public static WebDriver wd=null;
	/***
	 * @author venkat
	 *  @date-15th june 2021
	 * @throws IOException
	 * to initialize env,locator,webdrivers
	 */
	public static void initialize() throws IOException
	{
		if(!isReportExist)
		{
		reports=new ExtentReports("C:\\vcentry\\batch167\\C1_DDDTest\\reports\\sample.html");
		ReportArchiver.archiveScreenshot();
		isReportExist=true;
		}
		envprop= new Properties();
		envprop.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"product"+File.separator+"config"+File.separator+"env.properties")));
	
		locatorProp= new Properties();
		locatorProp.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"product"+File.separator+"config"+File.separator+"locator.properties")));
		if(envprop.get("BROWSER").equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		}else if(envprop.get("BROWSER").equals("FIREFOX")) {
		WebDriverManager.firefoxdriver().setup();
		wd= new FirefoxDriver();
		}else if(envprop.get("BROWSER").equals("IE")) {
			WebDriverManager.iedriver().setup();
			wd= new InternetExplorerDriver();
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public static WebElement getElementByName(String locatorprop)
	{
		return wd.findElement(By.name(locatorProp.getProperty(locatorprop)));
	}
	
	public static WebElement getElementById(String locatorprop)
	{
		return wd.findElement(By.id(locatorProp.getProperty(locatorprop)));
	}
}
