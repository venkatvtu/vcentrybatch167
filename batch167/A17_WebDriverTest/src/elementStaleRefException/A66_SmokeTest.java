package elementStaleRefException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A66_SmokeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.google.com/");
	//List<WebElement> links= 	wd.findElements(By.tagName("a"));
	
		List<WebElement> links= 	wd.findElements(By.tagName("a"));
	
		for(int i = 0; i<links.size();i++)
			
		{
			links= 	wd.findElements(By.tagName("a"));
		String data =	links.get(i).getText();
		if(!data.isEmpty()) {
		links.get(i).click();
		Thread.sleep(1000);
		System.out.println(wd.getTitle());
		
		wd.navigate().back();
		
		}
		
	}
}
}