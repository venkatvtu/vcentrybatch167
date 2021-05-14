package keyWords;

import org.testng.annotations.Test;

public class A9_InvocationTimeOutTest {
	// if page load takes more than 5 seconds means test case will be failed 
	@Test(priority = 1,invocationTimeOut = 5000)
	public void login() throws InterruptedException
	{
		Thread.sleep(6000);
		System.out.println("---login----");
	}
	@Test(priority = 2)
	public void search()
	{
		System.out.println("---search----");
	}
	@Test(priority = 3)
	public void booking()
	{
		System.out.println("---booking----");
	}
	@Test(priority = 4)
	public void cancel()
	{
		System.out.println("---cancel----");
	}
	
	
	
	
}
