package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSELECTOR 
{
	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("harishraina173@gmail.com");
    Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("hari2282");
	 Thread.sleep(1000);
	driver.findElement(By.cssSelector("button[name=login]")).click();

}
	
}
