package keyWords;

import org.testng.annotations.Test;

public class A4_PriorityTest2 {
	@Test(priority =-1)
	public void checkNetwork()
	{
		System.out.println("---check network-----");
	}
	
	@Test(priority =0)
	public void openBrowser()
	{
		System.out.println("---open browser-----");
	}
	@Test(priority =1)
	public void add()
	{
		System.out.println("---add-----");
	}
	@Test(priority =2)
	public void a_sub()
	{
		System.out.println("---sub-----");
	}
	@Test(priority =2)
	public void b_getData()
	{
		System.out.println("---get data-----");
	}
	@Test(priority =3)
	public void mul()
	{
		System.out.println("---mul-----");
	}
	@Test(priority =4)
	public void div()
	{
		System.out.println("---div-----");
	}
}
