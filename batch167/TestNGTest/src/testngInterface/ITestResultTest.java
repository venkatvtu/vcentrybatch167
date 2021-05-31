package testngInterface;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultTest{
	
		@Test(priority = 1)
		public void loginTest()
		{
			System.out.println("login test");
		}
		@Test(priority = 2)
		public void searchTest()
		{
			
			System.out.println("search test");
		}
		@Test(priority = 3)
		public void bookingTest()
		{
			System.out.println("book test");
		}
		@Test(priority = 4)
		public void cancelTest()
		{
			System.out.println("cancel test");
		}
		
		@AfterMethod
		public void tearDown(ITestResult result) {
		
			System.out.println("getEndMillis  -"+result.getEndMillis());
			System.out.println("getHost  -"+result.getHost());
			System.out.println("getInstanceName  -"+result.getInstanceName());
			System.out.println("getName  -"+result.getName());
System.out.println("getStartMillis  -"+result.getStartMillis());
			System.out.println("getStatus  -"+result.getStatus());
			System.out.println("getTestName  -"+result.getTestName());
			System.out.println("CREATED  -"+result.CREATED);
			System.out.println("FAILURE  -"+result.FAILURE);
			System.out.println("SKIP  -"+result.SKIP);
System.out.println("STARTED  -"+result.STARTED);
			System.out.println("SUCCESS_PERCENTAGE_FAILURE  -"+result.SUCCESS_PERCENTAGE_FAILURE);
	
	System.out.println("--------------------------------------------------------------------------------");
	
		}

	
	
}
