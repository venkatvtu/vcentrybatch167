package assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A14_HardAssertTest {
	@Test(priority = 1)
	public void validateTitle()
	{
		
		System.out.println("validate your currrent page title");
		String expected="Google";
		// use webdriver get your page title
		String actual="yahoo";
		//Assert - static functions
		Assert.assertEquals(actual, expected); 
		
		// if not equal stopped after this and execute another test case
		System.out.println("validation completed");
	}
	
	@Test(priority = 2)
	public void logOut()
	{
		System.out.println("Logout your application");
	}
	
	
	
	
}
