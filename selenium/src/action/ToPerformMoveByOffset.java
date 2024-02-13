package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMoveByOffset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
        driver.findElement(By.id("password")).sendKeys("123456");
WebElement eyeicon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
      
//to 
Actions action =new Actions(driver);
action.moveByOffset(1293, 315);
Thread.sleep(3000);
	}

}
