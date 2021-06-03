package browserStackTest;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SampleTest {
	public static final String AUTOMATE_USERNAME = "venkatesh_6o1Txf";
	  public static final String AUTOMATE_ACCESS_KEY = "uyuxpTm55Ktzv7QVkAd7";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

public static void main(String[] args) throws IOException {
	
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("os_version", "10");
    caps.setCapability("resolution", "1920x1080");
    caps.setCapability("browser", "IE");
    caps.setCapability("browser_version", "11.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
    caps.setCapability("build", "BStack Build Number 4"); // CI/CD job or build name    caps.setCapability("browserstack.debug", "true");
    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),caps);
	driver.get("https://www.google.co.in/");
	WebElement input = driver.findElement(By.name("q"));
	input.sendKeys("chennai");
	input.submit();
	System.out.println(driver.getTitle());
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:\\vcentry\\batch167\\BrowserStack\\screenshot\\widnows.png"));
	driver.quit();
}

}
