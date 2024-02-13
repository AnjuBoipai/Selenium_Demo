package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSearchProductInAmazon {

	public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("");
	 Thread.sleep(3000);
	 driver.findElement(By.name("q")).sendKeys("mobile");
	 Thread.sleep(1000);
	 driver.findElement(By.id("")).click();

	}

}
