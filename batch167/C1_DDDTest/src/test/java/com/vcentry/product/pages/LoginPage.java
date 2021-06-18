package com.vcentry.product.pages;

import com.vcentry.product.initializer.Initializer;

public class LoginPage extends Initializer {
public static void enterUserName(String username)
{
	getElementByName("LOGINPAGE_TYPE_USERNAME_NAME").sendKeys(username);
}
public static void enterPassword(String password)
{
	getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").sendKeys(password);
}
public static void clickLoginButton()
{
	getElementByName("LOGINPAGE_TYPE_PASSWORD_NAME").submit();
}
}



