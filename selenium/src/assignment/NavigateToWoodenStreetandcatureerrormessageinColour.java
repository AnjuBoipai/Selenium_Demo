package assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class NavigateToWoodenStreetandcatureerrormessageinColour {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
	
		WebElement sign = driver.findElement(By.linkText("Profile"));
		Actions action=new Actions(driver);
		action.click(sign).perform();
		
		
		WebElement login = driver.findElement(By.id("login_submit_btn"));
		action.click(login).perform();
		WebElement errormsg = driver.findElement(By.xpath("//p[text()='Please provide valid email']"));
		System.out.println(errormsg);
		System.out.println(errormsg.getCssValue("color"));
		
		
		
	

	}

}