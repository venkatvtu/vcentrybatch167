package chromeTest;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A61_HeadLessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver wd =  new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		wd.get("https://www.google.com/");
		System.out.println(wd.getTitle());
		
		
	}

}
