package alertTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A43_SimpleAlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
		WebElement link = wd.findElement(By.linkText("Login"));
		link.click();
		WebElement username = wd.findElement(By.name("username"));
		username.sendKeys("venkat");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("Vcentry@2021");
		password.submit();
		wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
		
		// navigate to radio button
		WebElement elementset1 = wd.findElement(By.id("element1"));
		elementset1.click();
		
		WebElement alertlink = wd.findElement(By.id("element7"));
		alertlink.click();
		
	WebElement simplealert = 	wd.findElement(By.id("id1"));
		simplealert.click();
		
	Alert a= 	wd.switchTo().alert();
	String data =	a.getText();
		System.out.println(data);
		Thread.sleep(2000);
		a.accept();
	}

}
