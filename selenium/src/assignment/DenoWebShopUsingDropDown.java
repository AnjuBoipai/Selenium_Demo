package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DenoWebShopUsingDropDown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books\r\n")).click();
		WebElement sortbydropdown = driver.findElement(By.name("products-orderby"));
		//WebElement displaydropdown = driver.findElement(By.name("products-pagesize"));
		//WebElement viewasdropdown = driver.findElement(By.name("products-viewmode"));
		Select sortbyselect= new Select(sortbydropdown);
		//Select displayselect= new Select(displaydropdown);
		//Select viewasselect= new Select(viewasdropdown);
		sortbyselect.selectByVisibleText("Name: A to Z");
		//displayselect.selectByValue("8");
		//viewasselect.selectByVisibleText("list");

	}

}
