package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 
{
	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/harish%20kumar%20h/Desktop/dropdown.html");
			Thread.sleep(1000);
			WebElement ele  =driver.findElement(By.id("empire"));
			Select s = new Select(ele);
	        if (s.isMultiple()) 
	        {
				System.out.println("abc");
				
				driver.close();
			}
	        else  
	        {
	        	System.out.println("xyz");
	        	
	        	driver.close();
	        }
	      List<WebElement> opt = s.getOptions();
	           int count = opt.size();
	        System.out.println(count);
	        
}
	
}
