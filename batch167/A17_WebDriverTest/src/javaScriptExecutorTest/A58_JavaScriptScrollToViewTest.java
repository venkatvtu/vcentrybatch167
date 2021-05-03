package javaScriptExecutorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginApp;

public class A58_JavaScriptScrollToViewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd = LoginApp.loginVcentryApp();

		wd.get("http://djangovinoth.pythonanywhere.com/scroll/");
		WebElement pandas = wd.findElement(By.id("id6"));
		JavascriptExecutor js = (JavascriptExecutor) wd;
		
		js.executeScript("arguments[0].scrollIntoView()", pandas);
		
	}

}
