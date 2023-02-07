package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownispresent 

{
		public static void main(String[] args) throws InterruptedException
		
		{
			
		
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			Thread.sleep(1000);
			WebElement ele  =driver.findElement(By.name("birthday_month"));
			Select s = new Select(ele);
			List<WebElement> opt = s.getOptions();
			ArrayList<String>l=new ArrayList<String>();
			for (WebElement we : opt) 
			{
				String t = we.getText();
				l.add(t);
             }
			if (l.contains("Apr"));
			{
				System.out.println("object is present");
			}
			
			
			
			{
				System.out.println("object is not present");
				
			}
				
			
			
			
		}
		
}
