package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("Anju");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Boipai");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("anjuboipai9@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("anju@123");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("anju@123");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
