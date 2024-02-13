package webDriver_methods;

import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigation {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
   // driver.navigate().to("https://www.flipkart.com/");
   //driver.navigate().to(new ("https://www.flipkart.com/"));
    driver.get("https://www.flipkart.com/");
    Thread.sleep(2000);
    Navigation nav = driver.navigate();
    nav.back();
    
    
    }

}
