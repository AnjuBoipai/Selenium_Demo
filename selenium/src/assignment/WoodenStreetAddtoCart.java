package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreetAddtoCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.linkText("3 Seater Sofas")).click();
		driver.findElement(By.xpath("//h2[@class='heading' and @style='margin: 0;']")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
	

	}

}
