package homeWorkTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWorkTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 * File writer for current url
		 */
		/*System.setProperty("webdriver.gecko.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\geckodriver.exe");
		WebDriver wd =  new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.bing.com/");
		String data =wd.getCurrentUrl();
		File f = new File("C:\\Users\\DELL\\Desktop\\homework.txt");
		FileWriter fw = new FileWriter(f);
		fw.write(data);
		fw.close();
		System.out.println(data);*/
		/**
		 * File reader redirect to url link
		 */
		/*File f = new File("C:\\Users\\DELL\\Desktop\\homework.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String url =br.readLine();
		
		System.setProperty("webdriver.gecko.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\geckodriver.exe");
		WebDriver wd =  new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get(url);*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\geckodriver.exe");
		WebDriver wd =  new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username = wd.findElement(By.name("username"));
		username.sendKeys("venkat");
		
		
		
	}

}
