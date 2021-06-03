package homeWorkTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.flipkart.com/");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd2 =  new ChromeDriver();
		wd2.manage().window().maximize();
		wd2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd2.get("https://www.flipkart.com/");
		
		
	}

}
