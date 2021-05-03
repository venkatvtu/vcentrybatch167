package javaScriptExecutorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginApp;

public class A56_JavaScriptDisableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd = LoginApp.loginVcentryApp();
		WebElement javascriptlink = wd.findElement(By.id("element30"));
		javascriptlink.click();

		WebElement enablelink = wd.findElement(By.id("element35"));
		enablelink.click();
		
		WebElement disable = wd.findElement(By.id("lastname"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].setAttribute('disabled','true')", disable);
		
		
	}

}
