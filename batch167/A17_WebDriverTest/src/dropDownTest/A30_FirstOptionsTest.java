package dropDownTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A30_FirstOptionsTest {

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
	WebElement firstoptions = 	s.getFirstSelectedOption();
		
		String data =firstoptions.getText();
		System.out.println(data);
	}

}
