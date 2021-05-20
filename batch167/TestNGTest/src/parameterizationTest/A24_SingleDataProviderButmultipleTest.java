package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class A24_SingleDataProviderButmultipleTest {
	String username;
	String password;
	String ticket1;
	String ticket2;
	
	@Factory(dataProvider = "data")
	public A24_SingleDataProviderButmultipleTest(String username,String password,String ticket1,String ticket2){
		
	this.username=username;	
	this.password=password;
	this.ticket1=ticket1;
	this.ticket2=ticket2;
			
	}
	@Test(priority = 1)
	public void loginTest()
	{
		System.out.println("enter user name   ---  "+username);//0
		System.out.println("enter password  ---  "+password);//1
		System.out.println("click login");
	}
	
	@Test(priority = 2)
	public void bookingTest()
	{
		System.out.println("booking ticket 1 ---"+ticket1);//2
		System.out.println("booking ticket 2 ---"+ticket2);//3
		System.out.println("click book");
	}
	@DataProvider(name="data")
	public static Object[][] getData()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0]="user name a";
		data[0][1]="password 111";
		data[0][2]="train ticket 1";
		data[0][3]="bus ticket 1";
		
		data[1][0]="user name a";
		data[1][1]="password 222";
		data[1][2]="train ticket 2";
		data[1][3]="bus ticket 2";
		
		data[2][0]="user name c";
		data[2][1]="password 333";
		data[2][2]="train ticket 3";
		data[2][3]="bus ticket 3";
		return data;
		
		
		
	}
	
	
	
	
}
