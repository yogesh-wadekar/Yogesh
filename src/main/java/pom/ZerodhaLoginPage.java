package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ZerodhaLoginPage {
		@FindBy (xpath= "//input[@id='userid']") private WebElement id;
		@FindBy (xpath= "//input[@id='password']") private WebElement password;
		@FindBy (xpath= "//button[text()='Login ']") private WebElement login;
		@FindBy (xpath= "//a[text()='Forgot user ID or password?']") private WebElement forgot;
		@FindBy (xpath= "//input[@id='pin']") private WebElement pin;
		@FindBy (xpath= "//button[text()='Continue ']")private WebElement continueWithPin;
		
		public ZerodhaLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		public void enterLoginId(String id)
		{
			this.id.sendKeys(id);
		}
		
		public void enterLoginPassword(String pass)
		{
			password.sendKeys(pass);
		}
		
		public void clickOnLogin()
		{
			login.click();
		}
		
		public void clickOnForgot()
		{
			forgot.click();
		}

		public void enterPin(String pinno, WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='pin']")));
			pin.sendKeys(pinno);
		}
		
		public void clickOnContinue()
		{
			continueWithPin.click();
		}
		
}
