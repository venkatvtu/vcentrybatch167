package dropDownTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A39_JavaSelectByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
		
		WebElement month =	wd.findElement(By.id("month"));
		
		//without select class
		
	List<WebElement> options =	month.findElements(By.tagName("option"));
	
		for(int i=0;i<options.size();i++)
		{
		String data =	options.get(i).getAttribute("value");
		if(data.equals("05"))
		{
			options.get(i).click();
		}
		
		}
		
		
		
		
	}

}
