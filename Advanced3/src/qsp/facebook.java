package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook
{
	
	public static void main(String[] args) throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
	driver.findElement(By.id("email")).sendKeys("harishraina173@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hari2282");
		driver.findElement(By.name("login")).click();
		
}
}


