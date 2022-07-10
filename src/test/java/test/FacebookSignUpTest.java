package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.FacebookSignUp;

public class FacebookSignUpTest {
		WebDriver driver;
		@BeforeMethod
		public void openBrowser()
		{
			driver=Browser.chromeBrowser("https://www.facebook.com");
		}
		
		@Test
		public void facebookSignUpPageTest()
		{
			FacebookSignUp facebookSignUp=new FacebookSignUp(driver);
			facebookSignUp.enterEmailId("Yogesh");
			facebookSignUp.clickOnCreateAcoount();
			facebookSignUp.enterFirstName("Yogesh", driver);
			facebookSignUp.enterLastName("Wadekar", driver);
		}


}
