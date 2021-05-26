package parallelTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelTest {
	WebDriver wd;
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browser) {
		if(browser.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		wd=new ChromeDriver();	
		} else if(browser.equals("FIREFOX"))
		{System.setProperty("webdriver.gecko.driver","C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\geckodriver.exe" );
			wd= new FirefoxDriver();
		}else if(browser.equals("IE")) {
			//
		}
		
		
		
	}
	@Test
	public void googleTest() throws InterruptedException
	{
		
		
		
		//wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://www.google.com");
		
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		
		
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		Thread.sleep(2000);
		wd.navigate().refresh();
		
		
	}
	
	
	
	
	
}
