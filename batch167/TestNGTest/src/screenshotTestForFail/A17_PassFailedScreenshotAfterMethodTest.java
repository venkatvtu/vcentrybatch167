package screenshotTestForFail;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class A17_PassFailedScreenshotAfterMethodTest {
	public WebDriver wd;

	@Test
	public void validateLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		wd.get("https://www.google.com");
		WebElement input = wd.findElement(By.name("qadsda"));
		input.sendKeys("chennai");
		input.submit();
	}

	@AfterMethod
	public void tearDown() throws IOException {
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(src, new File("C:\\vcentry\\batch167\\TestNGTest\\ScreenShot\\fail.png"));
		
	}

}
