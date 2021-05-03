package javaScriptExecutorTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetandRemoveAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://djangovinoth.pythonanywhere.com/enabledOrDisabled/");

		WebElement disable = wd.findElement(By.name("lname"));

		WebElement enable = wd.findElement(By.id("lastname"));

		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].removeAttribute('disabled')", disable);
		js.executeScript("arguments[0].setAttribute('disabled','')", enable);
	}

}
