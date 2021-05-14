package keyWords;

import org.testng.annotations.Test;

public class A8_InvocationCountTest {
	//invocation to run same test cases many times
	@Test(priority = 1,invocationCount = 10)
	public void login()
	{
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
