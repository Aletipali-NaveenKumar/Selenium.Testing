package link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement>links= driver.findElements(By.tagName("a"));
	       System.out.println("no of total links"+""+links.size());
	       
		int count = 0;
	       for (int i = 0;i<links.size();i++)
	       {
	    	   if(links.get(i).isDisplayed())
	    	   {
	    		  count++;
	    	   }
	       }
	       System.out.println("no of total links"+""+links.size());
	       System.out.println("no of visible links"+""+count);
	       System.out.println("no of invisible links"+""+(links.size()-count));
	       driver.close();
	}

}



