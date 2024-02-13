package advanceSeleniumTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadPoolSize {
	@Test(invocationCount = 0,threadPoolSize = 2)
	public void cricbuzz() {//testcase1
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed successfully",true);//test step
		driver.quit();
	}
	@Test(invocationCount = 1,threadPoolSize = 4)
	public void baskinRobbins() {//testcase2
		WebDriver driver=new EdgeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskinrobbins got executed successfully",true);//test step
		driver.quit();
	}
	@Test(invocationCount = 2,threadPoolSize = 5)
	public void amazon() {//testcase3
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got executed successfully",true);//test step
		driver.quit();
	}
}


