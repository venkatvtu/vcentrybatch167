package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class LoginPage {

	public static void loadUrl(WebDriver wd,String url)
	{
		wd.get(url);
	}
	public static void verifyLoginText(WebDriver wd, String expected)
	{
		String actual = wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
		Assert.assertEquals(actual,expected);
	}
	
	public static void clickLoginLink(WebDriver wd)
	{
		wd.findElement(By.linkText("Login")).click();
	}
	
	public static void enterUserName(WebDriver wd,String userName)
	{
		WebElement username =wd.findElement(By.xpath("//*[@id=\"id_username\"]"));
		username.sendKeys("venkat");
	}
	public static void enterPassword(WebDriver wd,String password)
	{
		wd.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("venkat@2021");
	}
	
	public static void clickLoginButton(WebDriver wd)
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	
	
}
