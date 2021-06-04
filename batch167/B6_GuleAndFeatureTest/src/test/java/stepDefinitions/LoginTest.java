package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// Step definitions
public class LoginTest {

	@Given ("open browser as {string}")
	public void openBrowser(String Browser)
	{
		System.out.println("--------openBrowser--------"+Browser);
	}
	@When ("enter url as {string}")
	public void enterUrl(String Url)
	{
		System.out.println("--------enterUrl--------"+Url);
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
			
	@When ("enter username as {string}")
	public void enterUserName(String userName)
	{
		System.out.println("--------enterUserName--------"+userName);
	}
	@And ("enter password as {string}")
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
