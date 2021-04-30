package javaScriptExecutorTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A52_HighlightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.google.com/");
		
		WebElement logo =  wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
	JavascriptExecutor js  =	(JavascriptExecutor)wd;
		js.executeScript("arguments[0].style.border='3px solid green'", logo);
		
		
	}

}
