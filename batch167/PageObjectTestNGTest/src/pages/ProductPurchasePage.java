package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProductPurchasePage {

	public static By countXpath=By.xpath("/html/body/main/div/div[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[3]/p");
	public static By productName=By.name("product");
	public static By mobile=By.name("mobile");
	public static By email=By.name("email");
	public static By category=By.name("cars");
	public static By qty =By.name("points");
	public static By purchaser =By.name("purchaser");
	public static By gstCheckBox=By.id("idyes");
	public static By bankCheckBox=By.id("netbank");
	public static By submit=By.id("order");
	public static void verifyPurchaseCount(WebDriver wd, String expected)
	{
		String actual =wd.findElement(countXpath).getText();
		Assert.assertEquals(actual.trim(), expected.trim());
	
	}
	
	public static void enterProductName(WebDriver wd , String productName)
	{
		wd.findElement(ProductPurchasePage.productName).sendKeys(productName);
	}
	
	public static void enterMobileNumber(WebDriver wd , String mobileNumber)
	{
		wd.findElement(mobile).sendKeys(mobileNumber);
	}
	
	public static void enterEmail(WebDriver wd,String enterEmail)
	{
		wd.findElement(email).sendKeys(enterEmail);
	}
	public static void selectProductCategory(WebDriver wd,String selectElectronics )
	{
		WebElement car =wd.findElement(category);
		
		Select s= new Select(car);
		s.selectByVisibleText(selectElectronics);
		
	}
	
	public static void enterProductQuantity(WebDriver wd,String enterQuantity)
	{
		wd.findElement(qty).sendKeys(enterQuantity);
	}
	public static void enterPurchaseName(WebDriver wd,String enterName)
	{
		wd.findElement(purchaser).sendKeys(enterName);
	}
	
	public static void clickGSTCheckBoxYes(WebDriver wd)
	{
		wd.findElement(gstCheckBox).click();
	}
	public static void clickNetBankingCheckBox(WebDriver wd)
	{
		wd.findElement(bankCheckBox).click();
	}
	public static void clickPlaceOrderButton(WebDriver wd)
	{
		wd.findElement(submit).click();
	}
	
	
	
}
