package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A6_URLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\geckodriver.exe");
		WebDriver wd =  new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.bing.com/");
		String data =wd.getCurrentUrl();
		System.out.println(data);
		
		
		
		
	}

}
