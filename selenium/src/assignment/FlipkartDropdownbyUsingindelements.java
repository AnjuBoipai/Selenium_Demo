package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDropdownbyUsingindelements {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php?r=101");
		driver.findElement(By.id("day")).sendKeys("30");
		driver.findElement(By.id("month")).sendKeys("dec");
		driver.findElement(By.id("year")).sendKeys("1999");
		

	}

}
