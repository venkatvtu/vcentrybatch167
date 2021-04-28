package dropDownTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A40_MultiSelectDropDownTest {

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
		
		// navigate to dropdown
		
		WebElement elementset2 = wd.findElement(By.id("element10"));
		elementset2.click();
		
		WebElement dropdownlink = wd.findElement(By.id("element11"));
		dropdownlink.click();
	
		WebElement element = wd.findElement(By.id("days"));
		Select s = new Select(element);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByIndex(3);

		//count how many options are selected
	List<WebElement> alloptions = 	s.getAllSelectedOptions();
		System.out.println("total selected options :"+alloptions.size());
		
		// get selected optons name
		
		for(int i=0;i<alloptions.size();i++)
		{
			String data  = alloptions.get(i).getText();
			System.out.println(data);
		}
		
		// deselect
		
		s.deselectByIndex(1);
		Thread.sleep(2000);
		s.deselectByIndex(2);
		Thread.sleep(2000);
		s.deselectByIndex(3);
	
	}

}
