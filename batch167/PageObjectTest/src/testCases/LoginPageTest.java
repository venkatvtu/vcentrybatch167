package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPurchasePage;

public class LoginPageTest {
	@Test
	public void validateLogin()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\vcentry\\batch167\\A17_WebDriverTest\\browser\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.get("http://djangovinoth.pythonanywhere.com/login/");
	LoginPage.verifyLoginText(wd,"Log In");
	LoginPage.enterUserName(wd,"venkat");
	LoginPage.enterPassword(wd,"Vcentry@2021");
	LoginPage.clickLoginButton(wd);

	//home page
	
	HomePage.navigateToHomePage(wd);
	HomePage.clickFrameForms(wd);
	HomePage.simpleForm(wd);
	
	
	// productPurchasePage
	ProductPurchasePage.verifyPurchaseCount(wd, "Your Total Purchase count:");
	ProductPurchasePage.enterProductName(wd, "samsung");
	ProductPurchasePage.enterMobileNumber(wd, "9789974750");
	ProductPurchasePage.enterEmail(wd, "abcd@gmail.com");
	ProductPurchasePage.selectProductCategory(wd);
	ProductPurchasePage.enterProductQuantity(wd, "10");
	ProductPurchasePage.enterPurchaseName(wd, "venkat");
	ProductPurchasePage.clickGSTCheckBoxYes(wd);
	ProductPurchasePage.clickNetBankingCheckBox(wd);
	ProductPurchasePage.clickPlaceOrderButton(wd);
	
	}
}