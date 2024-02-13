package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathBySurrounding {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//span[text()='HP Envy x360 Ryzen 5 Hexa Core 5600U']/../..//button[@tabindex='0']")).click();
		
		

	}

}
