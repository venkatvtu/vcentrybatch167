package annotationsTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A12_BeforeClassTest {
	@BeforeClass
	public void loginDB()
	{
		System.out.println("Login DB");
	}
	@AfterClass
	public void logoutDB()
	{
		System.out.println("Logout DB");
	}
	
	
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("Browser opened");
	}
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Browser Closed");
	}
	
	
	@Test(priority = 1)
	public void loginTest() {

		System.out.println("Login app");
	}

	@Test(priority = 2)
	public void searchTest() {
	
		System.out.println("Search tickets");
	}

	@Test(priority = 3)
	public void bookingTest() {
		System.out.println("Book tickets");
	}

	@Test(priority = 4)
	public void cancelTest() {
		System.out.println("cancel tickets");
	}

}
