package elementTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginApp;

public class A69_AutoCompleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd = LoginApp.loginVcentryApp();

		wd.get("http://djangovinoth.pythonanywhere.com/autocomplete/");
		
	WebElement tags = 	wd.findElement(By.id("tags1"));
		tags.sendKeys("a");
		
		
	List<WebElement> tags1=	wd.findElements(By.id("ui-id-3/li"));
	for(int i=0;i<tags1.size();i++)
	{
	String data =	tags1.get(i).getText();
	System.out.println(data);
	}
	}
}
