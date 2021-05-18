package screenshotTestForFail;

import org.testng.annotations.Test;
// if u have to run only failed test case again means go test-output and there will be a testng failed xml separetly 
public class A19_FailedTestCaseOnlyRunTest {
	@Test
	public void add()
	{
		System.out.println("add test case");
	}
	@Test
	public void sub()
	{
		int i=1/0;
		System.out.println("sub test case");
	}
	@Test
	public void mul()
	{
		System.out.println("mul test case");
	}
	@Test
	public void div()
	{
		System.out.println("div test case");
	}
	
}
