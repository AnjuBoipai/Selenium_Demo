package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAllTheCategories {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		
		List<WebElement> categories = driver.findElements(By.tagName("a"));
		System.out.println(categories.size());
       for (WebElement objCurrentlink : categories) {
    	   String strlinktext = objCurrentlink.getText();
    	   System.out.println(strlinktext);
	}
       }
	}

