package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class RegisterPage {

	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div/form/fieldset/legend")
	public static WebElement joinToday;
	public void verifyJoinToday(String joinToday) {
		String actual=this.joinToday.getText();
		Assert.assertEquals(actual, joinToday);
	}
	
	@FindBy(how=How.NAME,using="username")
	public static WebElement username;
	public void enterUserName(String username) {
		this.username.sendKeys(username);
	}
	@FindBy(how=How.NAME,using="password1")
	public static WebElement password;
	public void enterpassword(String password) {
		this.password.sendKeys(password);
	}
	@FindBy(how=How.NAME,using="password2")
	public static WebElement confirmpassword;
	public void enterConfirmPassword(String confirmPassword) {
		this.confirmpassword.sendKeys(confirmPassword);
	}
	
	@FindBy(how=How.NAME,using="email")
	public static WebElement enterEmail;
	public void enterEmailId(String enterEmailId) {
		this.enterEmail.sendKeys(enterEmailId);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div/form/div/button")
	public static WebElement clicksignin;
	public void clickSignIn() {
		this.clicksignin.click();
	}
}
