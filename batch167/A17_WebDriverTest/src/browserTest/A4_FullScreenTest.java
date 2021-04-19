package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A4_FullScreenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\geckodriver.exe");
		WebDriver wd =  new FirefoxDriver();
		//FirefoxDriver fd = new FirefoxDriver();
		//ChromeDriver cd = new ChromeDriver();
		wd.manage().window().fullscreen();
		wd.get("http://www.bing.com/");
		
		
	}

}
