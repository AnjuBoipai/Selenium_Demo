package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.linkText("https://download.oracle.com/java/21/latest/jdk-21_linux-aarch64_bin.tar.gz")).click();
		WebElement disabledele = driver.findElement(By.linkText("jdk-8u391-linux-aarch64.rpm"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click(),disabledele");
	}

}
