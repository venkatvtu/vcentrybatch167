package elementTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A42_RadioButtonTest {

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
		
		// navigate to radio button
		WebElement elementset1 = wd.findElement(By.id("element1"));
		elementset1.click();
		
		WebElement radiobuttonlink = wd.findElement(By.id("element4"));
		radiobuttonlink.click();
		
		List<WebElement> radio = 	wd.findElements(By.name("technology2"));
		
		for(int i=0;i<radio.size();i++)
		{
		String data =	radio.get(i).getAttribute("value");
		System.out.println(data);
		if(data.equals("Django"))
		{
			radio.get(i).click();
		}
		}
		
		
	}

}
