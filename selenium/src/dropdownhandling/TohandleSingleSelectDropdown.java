package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TohandleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select dayselect= new Select(daydropdown);
		Select monthselect= new Select(monthdropdown);
		Select yearselect= new Select(yeardropdown);
		dayselect.selectByIndex(30);
		monthselect.selectByValue("12");
		yearselect.selectByVisibleText("1999");
		
		//every option present in monthdropdown
		
		List<WebElement> allmonths = monthselect.getOptions();
		for (WebElement months : allmonths) {
			System.out.println(months.getText());
			monthselect.selectByVisibleText(months.getText());
			Thread.sleep(2000);
			
			//to check whether dropdown is single or multiple
			System.out.println(monthselect.isMultiple());
			
			
		}
			
		}
		
		
		

	}


