package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A22_SingleTestSingleDataProviderTest {
	@Test(dataProvider = "testdata")
	public void loginTest(String browser,String url,String username,String password)
	{
	
		//execute
		System.out.println("Open browser    - "+browser);
		System.out.println("Enter URL       - "+url);
		System.out.println("Enter User Name - "+username);
		System.out.println("Enter Password  - "+password);
		System.out.println("Click Login Button");
		
	}
	@DataProvider(name="testdata")
	// in testng in data provider only static will be mention
	public static Object[][] provideData()
	{
		//passdata
		//single dimention object array,two dimentional object array, Iterator<object>
		
		//Object[][] data = new Object[row][column]
		//or
		//Object[][] data = new Object[iterator count][data]
		// or
		// Object[][]data = new Object[dataset][data]
		//first iteration
		Object[][] data= new Object[3][4]; // two dimentional array
		data[0][0]="chrome";
		data[0][1]="test url1";
		data[0][2]="username_a";
		data[0][3]="password123";
		
		//second iteration
		
		data[1][0]="firfox";
		data[1][1]="test url2";
		data[1][2]="username_b";
		data[1][3]="password222";
		
		//third iteration
		
		data[2][0]="IE";
		data[2][1]="test url3";
		data[2][2]="username_c";
		data[2][3]="password333";
		return data;
		
		
		
		
		
	}
	
	
	
}
