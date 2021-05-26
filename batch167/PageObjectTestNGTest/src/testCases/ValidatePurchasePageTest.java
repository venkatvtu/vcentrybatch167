package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPurchasePage;

public class ValidatePurchasePageTest {
	@Test(dataProvider = "productdata")
	public void validatePurchasePage(String countText,String product,String mobile,String email,String cat,String qty,String purchaser ) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		LoginPage.verifyLoginText(wd, "Log In");
		LoginPage.enterUserName(wd, "venkat");
		LoginPage.enterPassword(wd, "Vcentry@2021");
		LoginPage.clickLoginButton(wd);

		// home page

		HomePage.navigateToHomePage(wd);
		HomePage.clickFrameForms(wd);
		HomePage.simpleForm(wd);

		// productPurchasePage
		ProductPurchasePage.verifyPurchaseCount(wd, countText);
		ProductPurchasePage.enterProductName(wd, product);
		ProductPurchasePage.enterMobileNumber(wd, mobile);
		ProductPurchasePage.enterEmail(wd, email);
		ProductPurchasePage.selectProductCategory(wd, cat);
		ProductPurchasePage.enterProductQuantity(wd, qty);
		ProductPurchasePage.enterPurchaseName(wd,purchaser );
		ProductPurchasePage.clickGSTCheckBoxYes(wd);
		ProductPurchasePage.clickNetBankingCheckBox(wd);
		ProductPurchasePage.clickPlaceOrderButton(wd);

	}

	@DataProvider(name = "productdata")
	public static Object[][] getProductData() {
		// data set 3, data=7
		Object[][] data = new Object[3][7];

		// first dataset
		data[0][0] = "Your Total Purchase count:";
		data[0][1] = "product A";
		data[0][2] = "111111";
		data[0][3] = "maila@mail.com";
		data[0][4] = "Electronics";
		data[0][5] = "10";
		data[0][6] = "purchaser name A";
		// second dataset
		data[1][0] = "Your Total Purchase count:";
		data[1][1] = "product B";
		data[1][2] = "222222";
		data[1][3] = "mailb@mail.com";
		data[1][4] = "Electronics";
		data[1][5] = "20";
		data[1][6] = "purchaser name B";
		// third dataset
		data[2][0] = "Your Total Purchase count:";
		data[2][1] = "product C";
		data[2][2] = "333333";
		data[2][3] = "mailc@mail.com";
		data[2][4] = "Electronics";
		data[2][5] = "30";
		data[2][6] = "purchaser name C";
		return data;
	}
}
