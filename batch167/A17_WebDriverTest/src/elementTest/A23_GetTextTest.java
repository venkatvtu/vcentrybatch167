package elementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23_GetTextTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
	WebDriver wd =  new ChromeDriver();
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	wd.get("https://en.wikipedia.org/wiki/Chennai");
	
	WebElement para = wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p[2]"));
	String data = para.getText();//<p> mytext </p>
	
	System.out.println(data);
	
}
}
