package actionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A18_ResizeTest {

	public static void main(String[] args) {
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
		
		
		WebElement actionlink = wd.findElement(By.id("element20"));
		actionlink.click();
		
		WebElement resizelink = wd.findElement(By.id("element21"));
		resizelink.click();
		
		Actions a = new Actions(wd);
		
		WebElement resize = wd.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	
		a.clickAndHold(resize).build().perform();
		a.moveToElement(resize, 120, 120).build().perform();
		a.release(resize).build().perform();
		
	}

}
