package screenShotTest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A72_CropImageTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.google.com/");
		WebElement logo =	wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		Point point = logo.getLocation();	
		int x= 	point.x;
		int y =point.y;
		
		Dimension dimension = logo.getSize();
		int h= dimension.height;
		int w = dimension.width;
		
		
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		BufferedImage copyimage=ImageIO.read(src);
		BufferedImage cropimage = copyimage.getSubimage(x, y, w, h);
		ImageIO.write(cropimage, "png", src);
		
		FileHandler.copy(src, new File("C:\\vcentry\\batch167\\A17_WebDriverTest\\ScreenShot\\crop1.png"));
		
		
	}

}
