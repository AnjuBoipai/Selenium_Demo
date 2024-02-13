package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformdragAndDropBywebelementsssource {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photomanager = driver.findElement(By.id("gallery"));
		
		//switch to frame
		driver.switchTo().frame(photomanager);
		
		//image
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trashbox = driver.findElement(By.id("trash"));
		
		
		Actions action =new Actions(driver);
		action.dragAndDropBy(trashbox, 500, 0).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image2, trashbox).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image3, trashbox).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, trashbox).perform();
		Thread.sleep(2000);
		

	}

}
