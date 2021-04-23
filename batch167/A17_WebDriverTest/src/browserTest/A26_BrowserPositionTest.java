package browserTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A26_BrowserPositionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.bing.com/");
		
		Thread.sleep(3000);
		//resize test
		Dimension dimension = new Dimension(300, 800);
		wd.manage().window().setSize(dimension);
		
		Thread.sleep(3000);
		Point point = new Point(300, 300);
		wd.manage().window().setPosition(point);
		
	}

}
