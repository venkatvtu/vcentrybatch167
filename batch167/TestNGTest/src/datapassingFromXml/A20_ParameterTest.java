package datapassingFromXml;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class A20_ParameterTest {
	@Parameters({"BROWSER","URL","USERNAME","PASSWORD"})
	@Test
	public void loginTest(String browser,String url,String username,String password)
	{
		System.out.println("------------------------------------------");
		System.out.println("Open browser    - "+browser);
		System.out.println("Enter URL       - "+url);
		System.out.println("Enter User Name - "+username);
		System.out.println("Enter Password  - "+password);
		System.out.println("Click Login Button");
		System.out.println("--------------------------------------------------");
	}
	
}
