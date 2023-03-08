package Seleniumtesting.Seleniumtesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{WebDriver driver;
	@BeforeTest
	
	public void verify()
	{
 
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	}
@Test

public void check() 
{
	
	String title =driver.getTitle();
	System.out.println("title name is"+title);
 Assert.assertEquals(title,"Google");
 
}
@AfterTest
void close()
{
	driver.close();
}
}