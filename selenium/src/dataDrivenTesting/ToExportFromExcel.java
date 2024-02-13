package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExportFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1 create object of fis
		FileInputStream fis = new FileInputStream("./test data/testDataSelenium.xlsx");

		//step 2 create object of respective Filetype
	 Workbook wb= WorkbookFactory.create(fis);
		
		//step3  call methods
	String url = wb.getSheet("sheet1").getRow(0).getCell(0).toString();
	String username = wb.getSheet("sheet1").getRow(1).getCell(0).toString();
	 String password = wb.getSheet("sheet1").getRow(2).getCell(0).toString();
	 
	 //Automation script start
	 WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}

}
