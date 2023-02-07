package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowntreeset 
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
			TreeSet<String>t=new TreeSet<String>(); //(Collections.reverseOrder());
			for (WebElement we : opt) 
			{
				String t1 = we.getText();
				t.add(t1);
            }
		
			for (String t2 : t)
			{
				System.out.println(t2);
				}
			}
			
		}
	
