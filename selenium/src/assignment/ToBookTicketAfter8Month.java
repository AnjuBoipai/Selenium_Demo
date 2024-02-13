package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToBookTicketAfter8Month {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.skyscanner.com/");
		driver.findElement(By.id("depart-fsc-datepicker-button")).click();
		for (;;) {
			try {
				driver.findElement(By.xpath("//span[text()='25']/../../../../../..//span[text()='17']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.id("")).click();

			}
	
}}}
