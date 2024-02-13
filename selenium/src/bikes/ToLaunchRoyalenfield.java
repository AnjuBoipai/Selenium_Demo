package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchRoyalenfield {
	@Test(groups = "integration")
	public void royal() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.royalenfield.com/");
		Reporter.log("royal got executed successfully", true);
	}
}
