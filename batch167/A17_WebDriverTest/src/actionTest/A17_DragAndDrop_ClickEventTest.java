package actionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A17_DragAndDrop_ClickEventTest {

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
		
		// drag and drop
		WebElement actionlink = wd.findElement(By.id("element20"));
		actionlink.click();
		
	WebElement draganddroplink = wd.findElement(By.id("element25"));
	draganddroplink.click();
		Actions a = new Actions(wd);
		
		WebElement source = wd.findElement(By.id("draggable"));
		WebElement target = wd.findElement(By.id("droppable"));
		a.clickAndHold(source).build().perform();
		a.moveToElement(target).build().perform();
		a.release(source).build().perform();
		
		
		
		
	}

}
