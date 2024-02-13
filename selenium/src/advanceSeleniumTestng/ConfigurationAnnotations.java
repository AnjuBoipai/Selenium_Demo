package advanceSeleniumTestng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("before suite is getting excute",true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("after suite is getting excute",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("before test is getting excute",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("after test is getting excute",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("before class is getting excute");
	}
	@AfterClass
	public void afterClass() {
		Reporter.log("after class is getting excute");
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("before method is getting excute");
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("after methodis getting excute");
	}





}
