package keyWords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample {
	WebDriver wd;
	@Test(priority = 1)
	public void login()
	{
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
	}
	@Test(priority = 2)
	public void drag()
	{
		this.wd=wd;
		WebElement actionlink = wd.findElement(By.id("element20"));
		actionlink.click();
		
	WebElement draganddroplink = wd.findElement(By.id("element25"));
	draganddroplink.click();
		Actions a = new Actions(wd);
		
		WebElement source = wd.findElement(By.id("draggable"));
		WebElement target = wd.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
	}
	
}
