package chromeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A62_MobileViewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName" ,"iPhone 6" );
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		WebDriver wd =  new ChromeDriver(options);
		//wd.manage().window().maximize();
		
		
		
		wd.get("https://www.google.com/");
		
		
	}

}
