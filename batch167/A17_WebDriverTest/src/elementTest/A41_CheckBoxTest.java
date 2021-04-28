package elementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A41_CheckBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
		WebElement link = wd.findElement(By.linkText("Login"));
		link.click();
		WebElement username = wd.findElement(By.name("username"));
		username.sendKeys("venkat");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("Vcentry@2021");
		password.submit();
		wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
		
		// drag and drop
		WebElement elementset1 = wd.findElement(By.id("element1"));
		elementset1.click();
		
		WebElement checkboxlink = wd.findElement(By.id("element3"));
		checkboxlink.click();
		
		
	WebElement django = 	wd.findElement(By.id("Django"));
		//django.click(); // like this we should not do
		if(django.isDisplayed()) {
			System.out.println("checkbox is visible");
		}
		if(django.isEnabled())
		{
			System.out.println("checkbox is enabled");
		}
		if(!django.isSelected()) {
			System.out.println("checkbox is not deault selected");
			django.click();
		}
		else
		{
			System.out.println("checkbox is already selected");
		}
	}

}
