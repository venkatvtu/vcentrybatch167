package parallelTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver wd;
	@BeforeTest
	public void setUp(String browser) {
		if(browser.equals("CHROME")) {
		wd=new ChromeDriver();	
		} else if(browser.equals("FIREFOX")) {
			wd= new FirefoxDriver();
		}else if(browser.equals("IE")) {
			//
		}
		
		
		
	}
	@Test
	public void googleTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://www.google.com");
		
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		
		
		
		
		
	}
	
	
	
	
	
}
