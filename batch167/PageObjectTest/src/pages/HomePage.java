package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public static void navigateToHomePage(WebDriver wd)
	{
		wd.navigate().to("http://djangovinoth.pythonanywhere.com/labhome/");
	}
	public static void clickFrameForms(WebDriver wd)
	{
		wd.findElement(By.id("element44")).click();
	}
	
	public static void simpleForm(WebDriver wd)
	{
		wd.findElement(By.id("element45")).click();
	}
	
	
	
	
}
