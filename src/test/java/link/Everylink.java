package link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Everylink {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://http://kareclouds.com/site/login");
		Thread.sleep(5000);
		List<WebElement>links= driver.findElements(By.tagName("a"));
	       System.out.println("no of total links"+""+links.size());
	       
	       for(int i= 0;i<links.size();i++)
	    	 {
	    	   if(links.get(i).isDisplayed())
	    	   {
	    		   String lname = links.get(i).getText();
	     		  links.get(i).click();
	     		  String url = driver.getCurrentUrl();
	     		 Thread.sleep(5000);
	     		  System.out.println(lname+""+url);
	     		  driver.navigate().back();
	     		  links= driver.findElements(By.tagName("a"));
	    	   }
	    	 }
	      
	       driver.quit();
	  }
}

