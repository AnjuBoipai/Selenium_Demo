package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TohandleMultiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		
		//listbox
		WebElement multilistbox = driver.findElement(By.id("cars"));
		
		//handle it by using select
		Select multiSelect= new Select(multilistbox);
		
		//call methods
		System.out.println(multiSelect.isMultiple());
		multiSelect.selectByVisibleText("Free ( 90 ) ");
		multiSelect.deselectByIndex(1);
		Thread.sleep(3000);
		
		//deselecting 
	     multiSelect.deselectByIndex(0);
	     multiSelect.selectByValue("99");
	     multiSelect.deselectAll();

	}

}
