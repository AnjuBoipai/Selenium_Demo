package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetCssValuemethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
	   WebElement tryfree = driver.findElement(By.linkText("Try Free"));
	 System.out.println( tryfree.getCssValue("font-family"));
	 System.out.println( tryfree.getCssValue("border-radius"));
	 System.out.println( tryfree.getCssValue("font-size"));
	 System.out.println( tryfree.getCssValue("background-color"));
	}

}
