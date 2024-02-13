package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		Actions action =new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		//to avoid
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\SAP\\Downloads");

	}

}
