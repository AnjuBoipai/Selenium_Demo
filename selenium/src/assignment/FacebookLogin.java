package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		//Expected data
		String expectedloginTitle="Facebook – log in or sign up";
		String expectedUsername="anju@gmail.com";
		String expectedpassword="anju@123";
		
		//step1: Open the browser
		WebDriver driver =new ChromeDriver();//cross browser testing
		System.out.println("Browser got launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got maximize successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//step2: Enter valid url
		driver.get("https://www.facebook.com/");
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedloginTitle)) {
			System.out.println("sucessfully navigate to face login page");
		}
		else {
			System.out.println("Failed to navigate to facebook login page");
		}
		
		//step3: Enter the username
		WebElement usernameTextfield = driver.findElement(By.id("email"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(expectedUsername);
		String actualUsername = usernameTextfield.getAttribute("value");
		if(actualUsername.equals(expectedUsername))
		{
			System.out.println("username successfully accepted");
		}
		else {
			System.out.println("username not accepted");
			}
		
	//step4: Enter the password
	WebElement passwordTextField = driver.findElement(By.id("pass"));
	passwordTextField.clear();
	passwordTextField.sendKeys(expectedpassword);
	String actualPassword = passwordTextField.getAttribute("value");
	if(actualPassword.equals(expectedpassword))
	{
		System.out.println("password successfully accepted");
	}
	else {
		System.out.println("password not accepted");
	}
		
	//step5: To click on login button 
	WebElement loginButton = driver.findElement(By.name("login"));
	loginButton.click();
	
	//step6: to close browser
	System.out.println("browser got closed successfully");
	driver.close();
	}

}
