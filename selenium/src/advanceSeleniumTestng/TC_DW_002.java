package advanceSeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DW_002 extends BaseClass {
	
		
		String expectedData="computers";
			@Test
			public  void toCheckComputerPage() {
				driver.findElement(By.partialLinkText("Computers")).click();
			WebElement actualData = driver.findElement(By.xpath("//h1[text()='Computers']"));
			if(actualData.equals(expectedData)) {
				Reporter.log("Faild to navigate computer page",true);
			}else {
				Reporter.log("TestCase 002 executed sucessfully",true);
			}
		}}

