package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGeterrorMessage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("anjugjs@gmail.com");
		Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@value='Log in']")).click();
 
	}

}
