package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturePageSourceCode {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://meghanafoods.co.in/");
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);

	}

}
