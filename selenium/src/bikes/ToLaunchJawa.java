package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchJawa {
	@Test(groups = "smoke")
	public void jawa() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.jawamotorcycles.com/");
		Reporter.log("jawa got executed successfully", true);
	}
}
