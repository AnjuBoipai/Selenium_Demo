package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkOnIdlocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("");
		Thread.sleep(1000);
		driver.findElement(By.id("Company")).sendKeys("");
	
		
		

	}

}
