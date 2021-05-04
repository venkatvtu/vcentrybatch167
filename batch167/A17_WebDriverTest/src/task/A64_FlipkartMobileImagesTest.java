package task;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A64_FlipkartMobileImagesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		wd.get("https://www.flipkart.com/");
		
		wd.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		WebElement searchBox=wd.findElement(By.name("q"));
		searchBox.sendKeys("Samsung");
		searchBox.submit();
 int i=2;
		while(true){
			try{
		String nameLink="/html/body/div[1]/div/div[3]/div[1]/div[2]/div["+i+"]/div/div/div/a/div[2]/div[1]/div[1]";
		String imageLink="/html/body/div[1]/div/div[3]/div[1]/div[2]/div["+i+"]/div/div/div/a/div[1]/div[1]/div/div/img";
		i++;
String name=wd.findElement(By.xpath(nameLink)).getText();
		WebElement mobile=wd.findElement(By.xpath(imageLink));
		File src=((TakesScreenshot)mobile).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\vcentry\\batch167\\A17_WebDriverTest\\ScreenShot\\"+name+".png"));
			}catch (Exception e) {
				break;
			}
		
	}
	}
}
