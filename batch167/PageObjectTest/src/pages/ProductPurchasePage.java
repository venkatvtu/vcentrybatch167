package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProductPurchasePage {

	public static void verifyPurchaseCount(WebDriver wd, String expected)
	{
		String actual =wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[3]/p")).getText();
		Assert.assertEquals(actual.trim(), expected.trim());
	
	}
	
	public static void enterProductName(WebDriver wd , String productName)
	{
		wd.findElement(By.name("product")).sendKeys(productName);
	}
	
	public static void enterMobileNumber(WebDriver wd , String mobileNumber)
	{
		wd.findElement(By.name("mobile")).sendKeys(mobileNumber);
	}
	
	public static void enterEmail(WebDriver wd,String enterEmail)
	{
		wd.findElement(By.name("email")).sendKeys(enterEmail);
	}
	public static void selectProductCategory(WebDriver wd )
	{
		WebElement car =wd.findElement(By.name("cars"));
		
		Select s= new Select(car);
		s.selectByVisibleText("Electronics");
		
	}
	
	public static void enterProductQuantity(WebDriver wd,String enterQuantity)
	{
		wd.findElement(By.name("points")).sendKeys(enterQuantity);
	}
	public static void enterPurchaseName(WebDriver wd,String enterName)
	{
		wd.findElement(By.name("purchaser")).sendKeys(enterName);
	}
	
	public static void clickGSTCheckBoxYes(WebDriver wd)
	{
		wd.findElement(By.id("idyes")).click();
	}
	public static void clickNetBankingCheckBox(WebDriver wd)
	{
		wd.findElement(By.id("netbank")).click();
	}
	public static void clickPlaceOrderButton(WebDriver wd)
	{
		wd.findElement(By.id("order")).click();
	}
	
	
	
}
