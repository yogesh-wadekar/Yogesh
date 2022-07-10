package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pojo.Browser;

public class FacebookSignUp {
	    @FindBy (xpath= "//input[@name='email']")private WebElement email;
	    @FindBy (xpath= "//a[text()='Create New Account']") private WebElement createaccount;
	    @FindBy (xpath= "//input[@name='firstname']")private WebElement firstname;	    
	    @FindBy (xpath= "//input[@name='lastname']") private WebElement lastname;
	    @FindBy (xpath= "//input[@name='reg_email__']")private WebElement mob;
	    @FindBy (xpath= "//input[@id='password_step_input']")private WebElement pas;
	    @FindBy (xpath= "//select[@name='birthday_day']")private WebElement day;
	    @FindBy (xpath= "//select[@name='birthday_month']")private WebElement month;
	    @FindBy (xpath= "//select[@name='birthday_year']")private WebElement year;
	    @FindBy (xpath= "//label[text()='Male']") private WebElement gender;
	    @FindBy (xpath= "//button[@name='websubmit']") private WebElement submit;
	    
	    public FacebookSignUp(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void enterEmailId(String name)
	    {
	    	email.sendKeys(name);
	    }
	    public void clickOnCreateAcoount()
		{
			createaccount.click();
		}

	    public void enterFirstName(String name, WebDriver driver)
	    {    	
	    	Browser.fluentWait(driver, firstname, 10);
	    	firstname.sendKeys("Yogesh");
	    }
	    
	    public void enterLastName(String name, WebDriver driver)
	    {
	    	Browser.fluentWait(driver, lastname, 5);
	    	lastname.sendKeys("Wadekar");
	    }
	    
	    public void enterMobileNumber(String no)
	    {
	    	mob.sendKeys("7972647683");
	    }
	    
}
