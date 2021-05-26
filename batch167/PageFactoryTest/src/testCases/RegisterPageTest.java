package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.RegisterPage;

public class RegisterPageTest {
@Test
	public void valiadateRegisterPage()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://djangovinoth.pythonanywhere.com/register/");
		
	RegisterPage registerPage=	PageFactory.initElements(wd, RegisterPage.class);
		registerPage.verifyJoinToday("Join Today");
		registerPage.enterUserName("Rameshji");
		registerPage.enterEmailId("Rajesh@gmail.com");
		registerPage.enterpassword("venkat@23");
		registerPage.enterConfirmPassword("venkat@23");
		registerPage.clickSignIn();
		
	
	}
	
	
	
	
	
}
