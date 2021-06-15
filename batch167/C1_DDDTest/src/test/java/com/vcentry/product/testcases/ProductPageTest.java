package com.vcentry.product.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vcentry.product.initializer.Initializer;

public class ProductPageTest extends Initializer{
	@Test
	public void validateProductPage() throws IOException
	{
		initialize();
		wd.get(envprop.getProperty("URL"));
		//login
		wd.findElement(By.name(locatorprop.getProperty("LOGINPAGE_TYPE_USERNAME_NAME"))).sendKeys("venkat");
		wd.findElement(By.name(locatorprop.getProperty("LOGINPAGE_TYPE_PASSWORD_NAME"))).sendKeys("Vcentry@2021");
		wd.findElement(By.name(locatorprop.getProperty("LOGINPAGE_TYPE_PASSWORD_NAME"))).submit();
		wd.get(envprop.getProperty("SIMPLE_FORM_URL"));
	
	}
	
	
	
	
}
