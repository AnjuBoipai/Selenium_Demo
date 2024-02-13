package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDemoWebShopDataFromProperties {

	public static void main(String[] args) throws IOException  {
		//to create object of FIS
				FileInputStream fis= new FileInputStream("./test data/testDataDemoWebShop.properties");
				
				//to create an object of respective file type
				Properties prop = new Properties();
				
				//call methods
				prop.load(fis);
				String url=prop.getProperty("url");
				String fname=prop.getProperty("fname");
				String lname=prop.getProperty("lname");
				String email = prop.getProperty("email");
				String password = prop.getProperty("password");
				String confirmpass = prop.getProperty("confirmpass");
				
				
				//automation script
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(url);
				driver.findElement(By.linkText("Register")).click();

				driver.findElement(By.id("gender-female")).click();
			
				driver.findElement(By.id("FirstName")).sendKeys(fname);

				driver.findElement(By.id("LastName")).sendKeys(lname);
				
				driver.findElement(By.id("Email")).sendKeys(email);
				driver.findElement(By.id("Password")).sendKeys(password);
				
				driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpass);
				
				driver.findElement(By.id("register-button")).click();
				



	}

}
