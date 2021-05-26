package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class LoginPage {

	public static void verifyLoginText(WebDriver wd, String expected) {
		String actual=wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
//		String expected="";
		Assert.assertEquals(actual.trim(), expected.trim());	
		
		
	}

	public static void enterUserName(WebDriver wd, String username) {
		
		wd.findElement(By.name("username")).sendKeys(username);
	}
	public static void enterPassword(WebDriver wd, String password) {
		wd.findElement(By.name("password")).sendKeys(password);
		
	}

	public static void clickLoginButton(WebDriver wd) {

		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	public static void clickSignUpNowLink(WebDriver wd) {
		wd.findElement(By.linkText("Sign Up Now")).click();
	}
	
	
}
