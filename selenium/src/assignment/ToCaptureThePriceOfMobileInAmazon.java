package assignment;

import java.nio.file.FileSystemAlreadyExistsException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureThePriceOfMobileInAmazon {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement mobPrice = driver.findElement(By.className("a-price-whole"));
		System.out.println(mobPrice.getText());
	}

}
