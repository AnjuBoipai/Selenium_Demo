package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		String urlofwebpage = driver.getCurrentUrl();
		System.out.println(urlofwebpage);

	}

}
