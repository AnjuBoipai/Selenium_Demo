package pomRepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DWS_001 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wb=new WelcomePage(driver);
		wb.getLoginLink().click();
		Login l=new Login(driver);
		l.getEmailTextfield().sendKeys("anbgty@gmail.com");
		l.getPasswordTextField().sendKeys("1234");
		l.getLoginbutton().click();

	}

}
