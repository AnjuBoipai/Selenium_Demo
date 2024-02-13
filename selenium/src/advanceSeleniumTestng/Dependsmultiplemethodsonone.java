package advanceSeleniumTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsmultiplemethodsonone {
	@Test
	public void createAccount() {//testcase1
		
		Reporter.log("Account created  successfully",true);//test step
	
	}
	@Test
	public void editAccount() {//testcase2
		
		Reporter.log("edit account successfully",true);//test step
		
	}
	@Test(dependsOnMethods = {"editAccount","createAccount"})
	public void deleteAccount() {//testcase3
		
		Reporter.log("account deleted successfully",true);//test step
	}
}
