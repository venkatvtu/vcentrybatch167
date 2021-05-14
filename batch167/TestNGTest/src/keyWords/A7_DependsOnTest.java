package keyWords;

import org.testng.annotations.Test;

public class A7_DependsOnTest {
	@Test
	public void loginTest()
	{
		System.out.println("login app");
	}
	@Test(dependsOnMethods = "loginTest")
	public void search()
	{
		int i =1/0;
		System.out.println("search tickets");
	}
	@Test(dependsOnMethods = "search")
	public void booking()
	{
		System.out.println("book tickets");
	}
	@Test(dependsOnMethods = "booking")
	public void cancel()
	{
		System.out.println("cancel tickets");
	}
	
	
	
}
