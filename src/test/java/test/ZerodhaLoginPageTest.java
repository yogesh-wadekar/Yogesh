package test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Excel;

public class ZerodhaLoginPageTest {
	WebDriver driver;
	String b1,id,pass,pin;
	@BeforeMethod
	public void openBrowser()
	{
		driver=Browser.chromeBrowser("https://kite.zerodha.com/");		
	}
	 
//	@Test 
//	
//	public void loginPageTest() throws EncryptedDocumentException, IOException
//	{
//		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
//		id=Excel.getData("credential", 1, 1);
//        pass=Excel.getData("credential", 1, 2);
//        pin=Excel.getData("credential", 2, 2);
//        
//		zerodhaLoginPage.enterLoginId(id);
//		zerodhaLoginPage.enterLoginPassword(pass);
//		zerodhaLoginPage.clickOnLogin();
//		
//		zerodhaLoginPage.enterPin(pin);
//	}

	
	
	@Test (dataProvider="yogesh" ,dataProviderClass=DataProviderFile.class)
	
	public void loginPageTest(String a, String b) throws EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		zerodhaLoginPage.enterLoginId(a);
		zerodhaLoginPage.enterLoginPassword(b);
		zerodhaLoginPage.clickOnLogin();
		b1=Excel.getData("credential", 2, 2);
		System.out.println(b1);
		zerodhaLoginPage.enterPin(b1, driver);
		zerodhaLoginPage.clickOnContinue();
	}
	
}
