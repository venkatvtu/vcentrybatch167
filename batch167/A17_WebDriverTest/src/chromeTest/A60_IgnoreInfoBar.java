package chromeTest;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import util.LoginApp;

public class A60_IgnoreInfoBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// settings
		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		
		
		
		
		//options.addArguments("--disable-infobars"); this was worked in older version. current its not working
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver wd =  new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		wd.get("https://www.bing.com/");
		
		
		
		
		
	}

}
