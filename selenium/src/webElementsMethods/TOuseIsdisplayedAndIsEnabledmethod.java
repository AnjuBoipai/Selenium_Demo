package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOuseIsdisplayedAndIsEnabledmethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.instagram.com/");
		//Thread.sleep(4000);
		//WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		//System.out.println("Before entering data");
		//System.out.println(loginbutton.isDisplayed());//true
		//System.out.println(loginbutton.isEnabled());//false
		//System.out.println("=====================================================");
		//System.out.println("After entering data");
		//driver.findElement(By.name("username")).sendKeys("anjuboipai14@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("anju@123");
		//System.out.println(loginbutton.isDisplayed());
		//System.out.println(loginbutton.isEnabled());

		
		//To learn is selected method
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement select = driver.findElement(By.xpath("//option[text()='INR 100 - INR 199 ( 16 ) ']"));
		System.out.println("after selecting");
		select.click();
		System.out.println(select.isSelected());
		
	}

}
