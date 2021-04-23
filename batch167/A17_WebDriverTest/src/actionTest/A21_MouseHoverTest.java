package actionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A21_MouseHoverTest {

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
		
		// navigate to mouse hover page
		WebElement actionlink = wd.findElement(By.id("element20"));
		actionlink.click();
		
		WebElement mousehoverlink = wd.findElement(By.id("element27"));
		mousehoverlink.click();
		
		// mouse hover event
		WebElement resume = wd.findElement(By.id("id11"));
		WebElement item = wd.findElement(By.id("id13"));
		WebElement havoc = wd.findElement(By.id("id17"));
		
		Actions a = new Actions(wd);
		a.moveToElement(resume).build().perform();
		Thread.sleep(2000);
		
		a.moveToElement(item).build().perform();
		Thread.sleep(2000);
		
		a.moveToElement(havoc).build().perform();
		
	}

}
