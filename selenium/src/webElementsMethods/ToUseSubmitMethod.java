package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("anjuboipai14@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("anju@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		

	}

}
