package com.vcentry.product.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.product.initializer.Initializer;

public class ProductPage extends Initializer {
public static void navigateToProductUrl()
{
	wd.get(envprop.getProperty("SIMPLE_FORM_URL")); 
}
public static void enterProductName(String product)
{
	getElementById("PRODUCTPAGE_TYPE_PRODUCT_ID").sendKeys(product);
}
public static void enterMobileNumber(String mobile)
{
	getElementById("PRODUCTPAGE_TYPE_MOBILE_ID").sendKeys(mobile);
}
public static void enterEmailId(String mail)
{
	getElementById("PRODUCTPAGE_TYPE_EMAIL_ID").sendKeys(mail);
}
public static void selectProductCat(String productcat)
{
	WebElement dropdown=getElementById("PRODUCTPAGE_SELECT_PRODUCTCAT_ID");
	Select s = new Select(dropdown);
	s.selectByVisibleText(productcat);
}
public static void enterQty(String Qty)
{
	getElementById("PRODUCTPAGE_TYPE_QTY_ID").sendKeys(Qty);
}
public static void enterPurchaser(String purchaser)
{
	getElementById("PRODUCTPAGE_TYPE_PURCHASER_ID").sendKeys(purchaser);
}
public static void clickGst()
{
	getElementById("PRODUCTPAGE_CLICK_GST_ID").click();
}
public static void clickCod()
{
	getElementById("PRODUCTPAGE_CLICK_COD_ID").click();
}
public static void clickPlaceOrder()
{
	getElementById("PRODUCTPAGE_CLICK_ORDER_ID").click();
}
}












