package advanceSeleniumTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	
@DataProvider(name="cred")
public String[][] toSendData(){
	
	String[][] sarr= {
			{"anju@gmail.com","anju123"},
			{"ab@gmail.com","ab123"},
			{"an@gmail.com","abc@123"}
			};
	return sarr;
}

@Test(dataProvider="cred")
public void toLogin(String email,String password) {
	WebDriver driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("passContainer")).sendKeys(password);
}

}
