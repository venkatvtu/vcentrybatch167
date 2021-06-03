package testCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// Step definitions
public class LoginTest {

	@Given ("^open browser$")
	public void openBrowser()
	{
		System.out.println("--------openBrowser--------");
	}
	@When ("^enter url$")
	public void enterUrl()
	{
		System.out.println("--------enterUrl--------");
	}
	@When ("^click login link$")
	public void clickLoginLink()
	{
		System.out.println("--------clickLoginLink--------");
	}
	@Then ("^verify login page loaded or not$")
	public void verifyLoginPageLoadedOrNot()
	{
		System.out.println("--------verifyLoginPageLoadedOrNot--------");
	}
			
	@When ("^enter username$")
	public void enterUserName()
	{
		System.out.println("--------enterUserName--------");
	}
	@And ("^enter password$")
	public void enterPassword()
	{
		System.out.println("--------enterPassword--------");
	}
	@When ("^click login button$")
	public void clickLoginButton()
	{
		System.out.println("--------clickLoginButton--------");
	}
	@Then ("^verify login success or not$")
	public void verifyLoginSuccessOrNot()
	{
		System.out.println("--------verifyLoginSuccessOrNot--------");
	}

	
	
	
}
