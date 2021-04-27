package dropDownTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A29_DropDownAllOptionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");

		WebElement month = wd.findElement(By.id("month"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		System.out.println("total count : " + options.size());

		for(int i=0;i<options.size();i++)
		{
		String data = 	options.get(i).getText();
		System.out.println(data);
		}
		
	}

}
