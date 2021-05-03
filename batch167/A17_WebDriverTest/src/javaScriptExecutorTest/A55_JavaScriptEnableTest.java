package javaScriptExecutorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginApp;

public class A55_JavaScriptEnableTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = LoginApp.loginVcentryApp();
		WebElement javascriptlink = wd.findElement(By.id("element30"));
		javascriptlink.click();

		WebElement enablelink = wd.findElement(By.id("element35"));
		enablelink.click();
		WebElement disable = wd.findElement(By.id("dis"));
		JavascriptExecutor js = (JavascriptExecutor) wd;
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('disabled')", disable);

	}

}
