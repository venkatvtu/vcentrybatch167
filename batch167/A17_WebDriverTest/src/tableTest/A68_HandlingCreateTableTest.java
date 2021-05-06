package tableTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginApp;

public class A68_HandlingCreateTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd = LoginApp.loginVcentryApp();

		wd.get("http://djangovinoth.pythonanywhere.com/dynamictable1/");

		wd.findElement(By.id("rows")).sendKeys("3");
		wd.findElement(By.id("cols")).sendKeys("3");
		wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div[5]/button")).click();
		
		
		WebElement table = wd.findElement(By.name("newtable"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("total row count " + rows.size());

		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < column.size(); j++) {
				String data = column.get(j).getText();
				System.out.print(data + "  ");

			}
			System.out.println();

		}

	}
		
		
		
		
		
		
	}


