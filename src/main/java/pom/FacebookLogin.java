package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	@FindBy(xpath= "//input[@id='email']") private WebElement email;
	@FindBy(xpath=("//input[@id='pass']")) private WebElement password;
	@FindBy(xpath=("//button[@name='login']")) private WebElement login;
	@FindBy(xpath=("//a[text()='Forgotten password?']")) private WebElement forgot;
	@FindBy(xpath=("//a[text()='Create New Account']")) private WebElement createaccount;
	@FindBy(xpath=("//a[text()='Create a Page']")) private WebElement createpage;
	
	public FacebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterEmailId(String emailid)
	{
		email.sendKeys(emailid);
	}
	public void EnterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void ClickOnlogin()
	{
		login.click();
	}
	public void ClickOnForgot()
	{
		forgot.click();
	}
	public void ClickOnCreateAcoount()
	{
		createaccount.click();
	}
	public void ClickOnCreatePage()
	{
		createpage.click();
	}
	


}
