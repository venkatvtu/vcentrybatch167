package groupTest;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(priority =1,groups= {"Login","Book","Cancel"})
	public void loginTest()
	{
		System.out.println("Login test completed");
		
	}
	@Test(priority =2, groups= {"Book"})
	public void searchTest()
	{
		System.out.println("search test completed");
		
	}
	@Test(priority = 3,groups= {"Book","Cancel"})
	public void bookingTest()
	{
		System.out.println("booking test completed");
		
	}
	@Test(priority = 4,groups= {"Cancel"})
	public void cancelTest()
	{
		
		System.out.println("cancel test completed");
	}
	
	
	
}
