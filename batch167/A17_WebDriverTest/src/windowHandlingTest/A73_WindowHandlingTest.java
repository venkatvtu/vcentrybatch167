package windowHandlingTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A73_WindowHandlingTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://book.theautomatedtester.co.uk/chapter1");
		
		wd.findElement(By.xpath("//*[@id=\"multiplewindow\"]")).click();
		//wd.getWindowHandle()// currrent window session ID
		//wd.getWindowHandles()//all window seesion ID
		
	Set<String> windowssessionid = 	wd.getWindowHandles();// treeset (ascending order) , hashset(random order) , linkedhashset(inserted order)
	
	//here there used linkedhashset
													//parent									//child
	 //System.out.println(windowssessionid);	//[CDwindow-11D6F7E708C73C6765A32DCAEEBABB7F, CDwindow-BD7D703A5FD801D310C8BC3BB46B12B1]
		
	Iterator<String> it = 	windowssessionid.iterator();	
	String parentid = it.next();
	String childid = it.next();
	System.out.println(parentid);
	System.out.println(childid);
	
	//wd.switchTo()  // - will be used in frames , alert , windows
	wd.switchTo().window(childid);
	String info = wd.findElement(By.id("popuptext")).getText();
	System.out.println(info);
	Thread.sleep(2000);
	wd.findElement(By.id("closepopup")).click();
	
	wd.switchTo().window(parentid);
	wd.findElement(By.xpath("//*[@id=\"secondajaxbutton\"]")).click();
	}

}
