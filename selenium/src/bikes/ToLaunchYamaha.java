package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchYamaha {
	@Test(groups = "system")
	public void yamaha() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Reporter.log("yamaha got executed successfully", true);
	}
}
