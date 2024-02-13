package advanceSeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DW_007 extends BaseClass {
	String expectedData="Gift Cards";
	@Test
	public  void toCheckGiftCardsPage() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
	WebElement actualData = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
	if(actualData.equals(expectedData)) {
		Reporter.log("Faild to navigate Gift Cards",true);
	}else {
		Reporter.log("TestCase 007 executed sucessfully",true);
	}
	}
}
