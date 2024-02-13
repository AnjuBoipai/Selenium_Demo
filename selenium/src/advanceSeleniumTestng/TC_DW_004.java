package advanceSeleniumTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DW_004 extends BaseClass {
	String expectedData="Apparel & Shoes";
	@Test
	public  void toCheckApparelShoesPage() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	WebElement actualData = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']"));
	if(actualData.equals(expectedData)) {
		Reporter.log("Faild to navigate Apparel & Shoes page",true);
	}else {
		Reporter.log("TestCase 004 executed sucessfully",true);
	}
}
}