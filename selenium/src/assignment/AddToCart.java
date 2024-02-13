package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Computing and Internet")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button' and @value='Add to cart'")).click();

	}

}
