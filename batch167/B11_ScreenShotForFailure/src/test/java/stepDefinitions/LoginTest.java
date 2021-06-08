package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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
	@After
	public void tearDown(Scenario s) throws IOException
	{
		System.out.println("getId - "+s.getId());
		System.out.println("getName - "+s.getName());
		System.out.println("getLine - "+s.getLine());
		System.out.println("get status - "+s.getStatus());
		System.out.println("get url - "+s.getUri());
		System.out.println("is failed - "+s.isFailed());
		if(s.isFailed()) {
		File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\vcentry\\batch167\\B11_ScreenShotForFailure\\screenshot\\failed.png"));
		
		}
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
		int i=1/0;
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
