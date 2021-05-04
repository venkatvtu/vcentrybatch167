package homeWorkTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.LoginApp;

public class FlipkartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.flipkart.com/");
		
		WebElement searchbox =wd.findElement(By.name("q"));
		searchbox.sendKeys("samsung");
		
		searchbox.sendKeys(Keys.ENTER);
	
	
	}

}
