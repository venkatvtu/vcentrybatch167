package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTask {
	public WebDriver wd;
	@Parameters({"USERNAME","PASSWORD","URL"})
	@Test
	public void loginVinoth(String username,String password,String url) {
		System.setProperty("webdriver.chrome.driver","C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		wd.get(url);

		WebElement userName = wd.findElement(By.name("username"));
		userName.sendKeys(username);

		WebElement passWord = wd.findElement(By.name("password"));
		passWord.sendKeys(password);

		WebElement login = wd.findElement(By.cssSelector("button[type='submit']"));
		login.click();

	}

}
