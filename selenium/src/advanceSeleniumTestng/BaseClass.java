package advanceSeleniumTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;

public class BaseClass {
public WebDriver driver;
String expectedwlecomepageTitle="Demo web shop";
@org.testng.annotations.Parameters("browserName")
@BeforeClass
public void toLaunch(String bname) {
	if(bname.equalsIgnoreCase("edge")) {
	driver=new EdgeDriver();
	}else if(bname.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	Reporter.log("Browser got launch sucessfully",true);
	driver.manage().window().maximize();
	Reporter.log("Browser got maximized successfully",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");
		String actualWebcomePageTitle=driver.getTitle();
		if(actualWebcomePageTitle.equals(expectedwlecomepageTitle)) {
			Reporter.log("Navigated to demowebshop successfully",true);
		}else {
			Reporter.log("Failed to Navigated to demowebshop ",true);
		}
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("anjuboipai9@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("anju@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Navigated to home page sucessfully",true);
	}
	@AfterMethod
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Browser got closed sucessfully",true);
	}
	
	@AfterClass
	public void toCloseBrowser() {
		Reporter.log("Browser got closed sucessfully",true);
		driver.quit();
	}
}
	

