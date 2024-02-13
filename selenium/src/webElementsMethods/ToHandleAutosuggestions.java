package webElementsMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAutosuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(30000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='two-pane-results-container']"));
		for (WebElement sugg : autosuggestion) {
			System.out.println(sugg.getText());
		}

	}

}
