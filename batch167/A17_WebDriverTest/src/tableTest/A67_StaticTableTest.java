package tableTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginApp;

public class A67_StaticTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd = LoginApp.loginVcentryApp();

		wd.get("http://djangovinoth.pythonanywhere.com/statictable/");

		WebElement table = wd.findElement(By.id("table1"));
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
