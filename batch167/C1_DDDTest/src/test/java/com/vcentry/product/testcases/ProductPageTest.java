package com.vcentry.product.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vcentry.product.initializer.Initializer;
import com.vcentry.product.pages.LoginPage;
import com.vcentry.product.pages.ProductPage;

public class ProductPageTest extends Initializer{
	@Test(dataProvider="ProductPageTest")
	public void validateProductPage(String username,String password,String productname,String mobile,
			String email,String productcat,String Qty,String purchaser) throws IOException
	{
		initialize();
		wd.get(envprop.getProperty("URL"));
		//login
		//step1
		/*wd.findElement(By.name(locatorProp.getProperty("LOGINPAGE_TYPE_USERNAME_NAME"))).sendKeys("venkat");
		wd.findElement(By.name(locatorProp.getProperty("LOGINPAGE_TYPE_PASSWORD_NAME"))).sendKeys("Vcentry@2021");
		wd.findElement(By.name(locatorProp.getProperty("LOGINPAGE_TYPE_PASSWORD_NAME"))).submit();
		
		//product page
		wd.get(envprop.getProperty("SIMPLE_FORM_URL")); 
		wd.findElement(By.id(locatorProp.getProperty("PRODUCTPAGE_TYPE_PRODUCT_ID"))).sendKeys("producta");
		wd.findElement(By.id(locatorProp.getProperty("PRODUCTPAGE_TYPE_MOBILE_ID"))).sendKeys("11111111");
		wd.findElement(By.id(locatorProp.getProperty("PRODUCTPAGE_TYPE_EMAIL_ID"))).sendKeys("aaaaa@gmail.com");
		WebElement dropdown =wd.findElement(By.id(locatorProp.getProperty("PRODUCTPAGE_SELECT_PRODUCTCAT_ID")));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Electronics");
		wd.findElement(By.id(locatorProp.getProperty("PRODUCTPAGE_TYPE_QTY_ID"))).sendKeys("10");
		wd.findElement(By.id(locatorProp.getProperty("PRODUCTPAGE_TYPE_PURCHASER_ID"))).sendKeys("purchaser a");
		wd.findElement(By.id(locatorProp.getProperty("PRODUCTPAGE_CLICK_GST_ID"))).click();
		wd.findElement(By.id(locatorProp.getProperty("PRODUCTPAGE_CLICK_COD_ID"))).click();
		wd.findElement(By.id(locatorProp.getProperty("PRODUCTPAGE_CLICK_ORDER_ID"))).click();*/
	
		
		//step2
		//login
		
	/*getElementByName("LOGINPAGE_TYPE_USERNAME_NAME").sendKeys("venkat");
	getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").sendKeys("Vcentry@2021");
	getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").submit();
	
	//Product Page
	wd.get(envprop.getProperty("SIMPLE_FORM_URL")); 
	getElementById("PRODUCTPAGE_TYPE_PRODUCT_ID").sendKeys("producta");
	getElementById("PRODUCTPAGE_TYPE_MOBILE_ID").sendKeys("11111111");
	getElementById("PRODUCTPAGE_TYPE_EMAIL_ID").sendKeys("aaaaa@gmail.com");
	WebElement dropdown=getElementById("PRODUCTPAGE_SELECT_PRODUCTCAT_ID");
	Select s = new Select(dropdown);
	s.selectByVisibleText("Electronics");
	getElementById("PRODUCTPAGE_TYPE_QTY_ID").sendKeys("10");
	getElementById("PRODUCTPAGE_TYPE_PURCHASER_ID").sendKeys("purchaser a");
	getElementById("PRODUCTPAGE_CLICK_GST_ID").click();
	getElementById("PRODUCTPAGE_CLICK_COD_ID").click();
	getElementById("PRODUCTPAGE_CLICK_ORDER_ID").click();*/
	
	
	//step3
	//login page
	LoginPage.enterUserName(username);       //0
	LoginPage.enterPassword(password); //1
	LoginPage.clickLoginButton();
	//product page
	ProductPage.navigateToProductUrl();
	ProductPage.enterProductName(productname); //2
	ProductPage.enterMobileNumber(mobile); //3
	ProductPage.enterEmailId(email); //4
	ProductPage.selectProductCat(productcat); //5
	ProductPage.enterQty(Qty); //6
	ProductPage.enterPurchaser(purchaser); //7
	ProductPage.clickGst();
	ProductPage.clickCod();
	ProductPage.clickPlaceOrder();
	
	}
	@DataProvider(name="ProductPageTest")
	public static Object[][] getProductPage()
	{
		// run test in 3 times 
		// total data = 8
		Object[][] data = new Object[3][8];
		//first set
		
		data[0][0]="venkat";
		data[0][1]="Vcentry@2021";
		data[0][2]="product a";
		data[0][3]="111111111";
		data[0][4]="aaaaa@gmail.com";
		data[0][5]="Electronics";
		data[0][6]="10";
		data[0][7]="purchaser a";
		//second set
		
		data[1][0]="venkat";
		data[1][1]="Vcentry@2021";
		data[1][2]="product b";
		data[1][3]="222222222";
		data[1][4]="bbbbbb@gmail.com";
		data[1][5]="Electronics";
		data[1][6]="20";
		data[1][7]="purchaser b";
		//third set
		
		data[2][0]="venkat";
		data[2][1]="Vcentry@2021";
		data[2][2]="product c";
		data[2][3]="33333333";
		data[2][4]="cccccc@gmail.com";
		data[2][5]="Electronics";
		data[2][6]="30";
		data[2][7]="purchaser c";
		return data;
	}
}
