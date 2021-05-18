package assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A15_SoftAssertTest {

	@Test(priority = 1)
	public void validateTitle()
	{
		
		System.out.println("validate your currrent page title");
		String expected="Google offered in:";
		// use webdriver get your page title
		String actual="Google offered at:";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected); // allow next line
		
		System.out.println("validation completed");
		s.assertAll(); // actually test is fail but will give pass but we have to report
		
		
	}
	
	@Test(priority = 2)
	public void logOut()
	{
		System.out.println("Logout your application");
	}
	
	
	
	
}
