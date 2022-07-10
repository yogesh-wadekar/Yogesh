package pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver chromeBrowser(String url)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.get("https://kite.zerodha.com/");
		driver.get(url);
		driver.manage().window().maximize();
		return driver;		
	}
	public static void fluentWait(WebDriver driver, WebElement element, int timeout)
	{
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
    	wait.withTimeout(Duration.ofSeconds(20));
    	wait.pollingEvery(Duration.ofSeconds(timeout));
    	wait.ignoring(Exception.class);
    	wait.until(ExpectedConditions.visibilityOf(element));  	
	}
	
	public static void explicitWait(WebDriver driver, WebElement element, int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
    	wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static WebDriver firefoxBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://kite.zerodha.com/");
		return driver;
	}
	
	public static WebDriver edgeBrowser()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://kite.zerodha.com/");
		return driver;
	}

}
