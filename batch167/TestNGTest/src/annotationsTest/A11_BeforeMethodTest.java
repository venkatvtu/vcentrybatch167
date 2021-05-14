package annotationsTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A11_BeforeMethodTest {
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
