package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
// Step definitions
public class LoginTest {
	WebDriver wd;
	@Given ("open browser as {string}")
	public void openBrowser(String Browser)
	{
		if(Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
			 wd =  new ChromeDriver();
			wd.manage().window().maximize();
			
		}
	}
	@Before(order = 2)
	public void setUpA() {
		System.out.println("<<<<<<<<Establish dabase connection>>>>>>>2");
	}
	
	@Before(order = 1)
	public void setUpB() {
		System.out.println("======get token=====1");
	}
	
	@After (order = 2)
	public void tearDownA() {
		System.out.println("<<<<<<<<close db connection>>>>>>>>2");
	}
	
	@After(order = 1)
	public void tearDownB() {
		System.out.println("====Clear token===1");
	}
	@When ("enter url as {string}")
	public void enterUrl(String Url)
	{
		wd.get(Url);
	}
	@When ("click login link")
	public void clickLoginLink()
	{
		wd.findElement(By.linkText("Login")).click();
	}
	@Then ("verify login page loaded or not")
	public void verifyLoginPageLoadedOrNot()
	{
		String text = wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
		Assert.assertEquals(text,"Log In");
	}
			
	@When ("enter username as {string}")
	public void enterUserName(String userName)
	{
		WebElement username =wd.findElement(By.xpath("//*[@id=\"id_username\"]"));
		username.sendKeys(userName);
	}
	@And ("enter password as {string}")
	public void enterPassword(String password)
	{
		wd.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys(password);
	}
	@When ("click login button")
	public void clickLoginButton()
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	@Then ("verify login success or not")
	public void verifyLoginSuccessOrNot()
	{
		System.out.println(wd.getTitle());
	}

	
	
	
}
