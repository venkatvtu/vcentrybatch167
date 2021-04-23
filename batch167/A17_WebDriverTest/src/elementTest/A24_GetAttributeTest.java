package elementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A24_GetAttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.bing.com/");
		
		WebElement searchbox = wd.findElement(By.id("sb_form_q"));
		searchbox.sendKeys("chennai");
		//String data = searchbox.getText();
		String data = searchbox.getAttribute("value");// <input value ="chennai"></input>
		System.out.println("my text: "+data);
		
		
	}

}
