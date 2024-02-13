package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchKtm {
	@Test(groups = "integration")
	public void ktm() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ktmindia.com/");
		Reporter.log("ktm got executed successfully", true);
	}
}
