package javaScriptExecutorTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import util.LoginApp;

public class A57_JavaScriptScrollByTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = LoginApp.loginVcentryApp();
		
		wd.get("http://djangovinoth.pythonanywhere.com/scroll/");
		
		JavascriptExecutor js = (JavascriptExecutor)wd;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1500)");
		
	}

}
