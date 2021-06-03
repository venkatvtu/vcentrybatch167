package testCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// Step definitions
public class LoginTest {

	@Given ("open browser as {String}")
	public void openBrowser(String browser)
	{
		System.out.println("--------openBrowser--------"+browser);
	}
	@When ("enter url as {String}")
	public void enterUrl(String url)
	{
		System.out.println("--------enterUrl--------"+url);
	}
	@When ("click login link")
	public void clickLoginLink()
	{
		System.out.println("--------clickLoginLink--------");
	}
	@Then ("verify login page loaded or not")
	public void verifyLoginPageLoadedOrNot()
	{
		System.out.println("--------verifyLoginPageLoadedOrNot--------");
	}
			
	@When ("enter username as {String}")
	public void enterUserName(String username)
	{
		System.out.println("--------enterUserName--------"+username);
	}
	@And ("enter password as {String}")
	public void enterPassword(String password)
	{
		System.out.println("--------enterPassword--------"+password);
	}
	@When ("click login button")
	public void clickLoginButton()
	{
		System.out.println("--------clickLoginButton--------");
	}
	@Then ("verify login success or not")
	public void verifyLoginSuccessOrNot()
	{
		System.out.println("--------verifyLoginSuccessOrNot--------");
	}

	
	
	
}
