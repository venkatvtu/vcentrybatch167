package windowHandlingTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://djangovinoth.pythonanywhere.com/multiwindow/");
		
		wd.findElement(By.xpath("//*[@id=\"id1\"]")).click();
		Set<String> windowssessionid = 	wd.getWindowHandles();
		Iterator<String> it = 	windowssessionid.iterator();	
		String parentid = it.next();
		String childid1 = it.next();
		String childid2= it.next();
		String childid3 = it.next();
	
		
		//wd.switchTo()  // - will be used in frames , alert , windows
		wd.switchTo().window(childid1);
	String url =	wd.getCurrentUrl();
	String title = 	wd.getTitle();
		System.out.println(title);
	System.out.println(url);
		wd.quit();
		
		
		
	}

}
