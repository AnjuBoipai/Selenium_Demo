package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleTheIframes {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		 
		//To switch by using int index
		//driver.switchTo().frame(0);
		
		//To switch by using id or name
		//driver.switchTo().frame("send-sms-iframe");
		
		//To switch by using webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@width='430']"));
		driver.switchTo().frame(iframe);
		
		
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		
		//by switch back using parentframe
		driver.switchTo().parentFrame();
		
		//by switch back using defaultcontent
		//driver.switchTo().defaultContent();
		//about us
				driver.findElement(By.linkText("About Us")).click();
				

	}

}
