package screenShotTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A27_ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.bing.com/");
		
		// webdriver - interface
		//webelement - interface
		//TakesScreenShot - interface
		
		//webdriver - interface combine takescreenshot -interface
		// interface we cant create object so we are doing type casting
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		// FileUtils = apche - 2.0 version
		// filehandler = selenium - 3.0 version
		
		FileHandler.copy(src, new File("C:\\vcentry\\batch167\\A17_WebDriverTest\\ScreenShot\\ping.png"));
	}

}
