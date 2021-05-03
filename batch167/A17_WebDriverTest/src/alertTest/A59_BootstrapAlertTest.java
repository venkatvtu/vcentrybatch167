package alertTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginApp;

public class A59_BootstrapAlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd = LoginApp.loginVcentryApp();

		wd.get("http://djangovinoth.pythonanywhere.com/bootstrapalert/no/");
		
	WebElement bootstrap = 	wd.findElement(By.linkText("bootstrap info alert"));
		
		bootstrap.click();
		
	WebElement alertText = 	wd.findElement(By.xpath("/html/body/main/div/div[2]/div"));
	String data =	alertText.getText();
	System.out.println(data);
	
	
	}

}
