package advanceSeleniumTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void createAccount() {//testcase1
		
		Reporter.log("Account created  successfully",true);//test step
	
	}
	@Test(dependsOnMethods ="createAccount" )
	public void editAccount() {//testcase2
		
		Reporter.log("edit account successfully",true);//test step
		
	}
	@Test(dependsOnMethods = "editAccount")
	public void deleteAccount() {//testcase3
		
		Reporter.log("account deleted successfully",true);//test step
	
	}
}

