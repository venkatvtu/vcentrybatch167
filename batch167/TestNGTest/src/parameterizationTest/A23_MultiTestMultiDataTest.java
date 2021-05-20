package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A23_MultiTestMultiDataTest {

	@Test(dataProvider = "login",priority = 1)
	public void loginTest(String username,String password)
	{
		System.out.println("enter user name   ---  "+username);
		System.out.println("enter password  ---  "+password);
		System.out.println("click login");
	}
	
	@Test(dataProvider = "book",priority = 2)
	public void bookingTest(String ticket1,String ticket2)
	{
		System.out.println("booking ticket 1 ---"+ticket1);
		System.out.println("booking ticket 2 ---"+ticket2);
		System.out.println("click book");
	}
	@DataProvider(name ="login")
	public static Object[][] getLoginData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="usernamea";
		data[0][1]="password111";
		
		data[1][0]="usernameb";
		data[1][1]="password222";
		
		data[2][0]="usernamec";
		data[2][1]="password333";
		
		return data;
		
		
		
	}
	
	@DataProvider(name ="book")
	public static Object[][] getBookingData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="train ticket 1";
		data[0][1]="bus ticket 1";
		
		data[1][0]="train ticket 2";
		data[1][1]="bus ticket 2";
		
		data[2][0]="train ticket 3";
		data[2][1]="bus ticket 3";
		
		return data;
		
		
		
	}
	
	
	
	
	
}
