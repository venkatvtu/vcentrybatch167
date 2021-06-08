package tastCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ProductPurchaseTest {
	WebDriver wd;
	@Given ("open browser as {string}")
	public void openBrowser(String string)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		 wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When ("enter url as {string}")
	public void enterUrl(String string)
	{
		wd.get(string);
	}
	@When ("Click login link")
	public void clickLoginLink()
	{
		wd.findElement(By.linkText("Login")).click();
	}
	@Then ("verify whether entered to login page or not")
	public void verifyWhetherEnteredTologinPageOrNot()
	{
	String expected =	wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
	Assert.assertEquals(expected, "Log In");
	}
	@When ("enter user name as {string}")
	public void enterUserName(String string)
	{
		wd.findElement(By.name("username")).sendKeys(string);
	}
	@When ("enter password as {string}")
	public void enterPassword(String string)
	{
		wd.findElement(By.name("password")).sendKeys(string);
	}
	@When ("click loginbutton")
	public void clickLoginButton()
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
		wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
	}
	@When ("click framework forms")
	public void clickFrameworkForms()
	{
		wd.findElement(By.id("element44")).click();
	}
	@When ("click product purchase flow")
	public void clickProductPurchaseFlow()
	{
		wd.findElement(By.name("element45")).click();
	}

	//And enter username as "<USER>" in product page
	//And enter password as "<PASS>" in product page
	//When click login button in product purchase
	@Then ("verify product input page")
	public void verifyProductInputPage()
	{
		
	}
	@When("add products list")
	public void add_products_list(DataTable dataTable) throws InterruptedException {
	 List<List<String>> table=	dataTable.asLists();
	 for (int i=0;i<table.size();i++) {
//		System.out.println( table.get(i).get(0));
//		System.out.println( table.get(i).get(1));
//		System.out.println(table.get(i).get(2));
//		System.out.println(table.get(i).get(3));
//		System.out.println( table.get(i).get(4));
//		System.out.println( table.get(i).get(5));
		 
		 try {
		 wd.findElement(By.id("id0")).clear();
		 wd.findElement(By.id("id1")).clear();
		 wd.findElement(By.id("id2")).clear();
		 wd.findElement(By.id("id3")).clear();
		 wd.findElement(By.id("id4")).clear();
		 wd.findElement(By.id("id5")).clear();
		 } catch(Exception e ) {
			 
		 }
		 
		 wd.findElement(By.id("id0")).sendKeys(table.get(i).get(0));
		 wd.findElement(By.id("id1")).sendKeys(table.get(i).get(1));
		 wd.findElement(By.id("id2")).sendKeys(table.get(i).get(2));
		 wd.findElement(By.id("id3")).sendKeys(table.get(i).get(3));
		 wd.findElement(By.id("id4")).sendKeys(table.get(i).get(4));
		 wd.findElement(By.id("id5")).sendKeys(table.get(i).get(5));
		 wd.findElement(By.id("idyes")).click();
		 wd.findElement(By.id("cod")).click();
		 wd.findElement(By.id("order")).click();
		 Thread.sleep(2000);

		 
	 }
		
	}

	@Then("verify product added or not")
	public void verify_product_added_or_not() {
	}

	
	
}
