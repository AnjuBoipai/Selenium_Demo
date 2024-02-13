package advanceSeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DW_005 extends BaseClass {
	String expectedData="Digital downloads";
	@Test
	public  void toCheckDigitaldownloadsPage() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();
	WebElement actualData = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
	if(actualData.equals(expectedData)) {
		Reporter.log("Faild to navigate Digital downloads",true);
	}else {
		Reporter.log("TestCase 005 executed sucessfully",true);
	}
}}
