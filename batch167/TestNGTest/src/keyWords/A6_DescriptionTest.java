package keyWords;

import org.testng.annotations.Test;

public class A6_DescriptionTest {

	@Test(priority =1,description="adding two numbers")
	public void add()
	{
		System.out.println("---add-----");
	}
	@Test(priority =2,description="sub two numbers")
	public void sub()
	{
		System.out.println("---sub-----");
	}
	@Test(priority =3,description="multiply two numbers")
	public void mul()
	{
		System.out.println("---mul-----");
	}
	@Test(priority =4,description="div two numbers")
	public void div()
	{
		System.out.println("---div-----");
	}
	
	
	
	
	
}
