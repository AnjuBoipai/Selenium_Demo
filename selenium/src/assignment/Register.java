package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		 WebElement tryfree = driver.findElement(By.linkText("Register"));
		 System.out.println( tryfree.getCssValue("background"));
		 System.out.println( tryfree.getCssValue("color"));
		 System.out.println( tryfree.getCssValue("float"));
		 System.out.println( tryfree.getCssValue("font-size"));
		}

	}


