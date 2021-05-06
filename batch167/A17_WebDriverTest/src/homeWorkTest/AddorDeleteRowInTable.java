package homeWorkTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginApp;

public class AddorDeleteRowInTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = LoginApp.loginVcentryApp();

		wd.get("http://djangovinoth.pythonanywhere.com/dynamictable2/");
		
		WebElement namerow = wd.findElement(By.id("name"));
		namerow.sendKeys("venkat");
		WebElement emailrow =wd.findElement(By.id("email"));
		emailrow.sendKeys("abcd@gmail.com");
		WebElement addrow =wd.findElement(By.id("rowid"));
		addrow.click();
		Thread.sleep(2000);
		WebElement select = wd.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[1]/input"));
		select.click();
		WebElement deleterow = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div/form/div/div[4]/button"));
		deleterow.click();
		
	}

}
