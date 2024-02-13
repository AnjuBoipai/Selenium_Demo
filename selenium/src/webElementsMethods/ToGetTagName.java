package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTagName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
	   String tagname = driver.findElement(By.linkText("Try Free")).getTagName();
	   System.out.println("tagname");
	}

	}


