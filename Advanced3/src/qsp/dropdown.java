package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/harish%20kumar%20h/Desktop/dropdown.html");
			Thread.sleep(1000);
			WebElement ele  =driver.findElement(By.id("empire"));
			Select s = new Select(ele);
			s.selectByIndex(1);
			Thread.sleep(1000);
			s.selectByValue("l");
			Thread.sleep(1000);
			s.deselectAll();
			
						
}
}