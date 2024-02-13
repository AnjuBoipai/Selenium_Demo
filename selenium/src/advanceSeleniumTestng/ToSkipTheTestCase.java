package advanceSeleniumTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToSkipTheTestCase {
	@Test(enabled = false)
	public void cricbuzz() {//testcase1
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed successfully",true);//test step
		driver.quit();
	}
	@Test(enabled = true)
	public void baskinRobbins() {//testcase2
		WebDriver driver=new EdgeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskinrobbins got executed successfully",true);//test step
		driver.quit();
	}
	@Test(enabled = false)
	public void amazon() {//testcase3
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got executed successfully",true);//test step
		driver.quit();
	}

}
