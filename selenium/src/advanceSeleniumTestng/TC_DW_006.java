package advanceSeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DW_006 extends BaseClass {
	String expectedData="Jewelry";
	@Test
	public  void toCheckJewelryPage() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
	WebElement actualData = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
	if(actualData.equals(expectedData)) {
		Reporter.log("Faild to navigate Jewelry",true);
	}else {
		Reporter.log("TestCase 006 executed sucessfully",true);
	}
}}
