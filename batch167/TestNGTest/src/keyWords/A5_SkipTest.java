package keyWords;

import org.testng.annotations.Test;

public class A5_SkipTest {
	@Test(priority =1)
	public void add()
	{
		System.out.println("---add-----");
	}
	@Test(priority =2)
	public void sub()
	{
		System.out.println("---sub-----");
	}
	@Test(priority =3,enabled = false)
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
