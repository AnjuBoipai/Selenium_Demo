package advanceSeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DW_001 extends BaseClass {
	
String expectedData="Books";
	@Test
	public  void toCheckBooksPage() {
	driver.findElement(By.partialLinkText("Books")).click();
	WebElement actualData = driver.findElement(By.xpath("//h1[text()='Books']"));
	/*if(actualData.equals(expectedData)) {
		Reporter.log("Faild to navigate book page",true);
	}else {
		Reporter.log("TestCase 001 executed sucessfully",true);
	}*/
	Assert.assertEquals(actualData,expectedData,"failed to navigate to the book page");
	Reporter.log("TestCase 001 executed sucessfully",true);
}}
