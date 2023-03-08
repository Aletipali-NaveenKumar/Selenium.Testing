package link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlink {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
	WebElement link=driver.findElement(By.id("gb")); 
	 List<WebElement>headerlinks= link.findElements(By.tagName("a"));
	System.out.println("the header links are"+headerlinks.size());
	for(int i=0;i<headerlinks.size();i++)
	{
		System.out.println(headerlinks.get(i).getText());
	}
driver.close();
	}
	
}
