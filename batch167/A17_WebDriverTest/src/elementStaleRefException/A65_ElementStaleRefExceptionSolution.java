package elementStaleRefException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A65_ElementStaleRefExceptionSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.google.com/");
		
		//Solution 1 
		
		/*WebElement searchbox =wd.findElement(By.name("q"));
		searchbox.sendKeys("chennai");
		searchbox.submit();
		
		wd.navigate().back();
		WebElement searchbox1 =wd.findElement(By.name("q"));
		searchbox1.sendKeys("guindy");
		searchbox1.submit();*/
		
		// solution 2 
		
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		wd.navigate().back();
		wd.findElement(By.name("q")).sendKeys("guindy");
		wd.findElement(By.name("q")).submit();
		
		
	}

}
