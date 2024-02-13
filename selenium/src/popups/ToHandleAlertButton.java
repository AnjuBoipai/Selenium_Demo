package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertButton {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//switch to frame
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//to handle popup
		Alert alertpop = driver.switchTo().alert();
		System.out.println(alertpop.getText());
		//alertpop.accept();
		alertpop.dismiss();
		
		

	}

}
