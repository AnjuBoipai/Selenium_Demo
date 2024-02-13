package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchHero {
	@Test(groups = "smoke")
	public void hero() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.heromotocorp.com/");
		Reporter.log("hero got executed successfully", true);
	}
}
