package advanceSeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DW_003 extends BaseClass {

	String expectedData="Electronics";
		@Test
		public  void toCheckElectronicsPage() {
			driver.findElement(By.partialLinkText("Electronics")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='Electronics']"));
		if(actualData.equals(expectedData)) {
			Reporter.log("Faild to navigate electronics page",true);
		}else {
			Reporter.log("TestCase 003 executed sucessfully",true);
		}
}}
