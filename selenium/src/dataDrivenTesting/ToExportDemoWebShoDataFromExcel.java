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

public class ToExportDemoWebShoDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		//step1 create object of fis
				FileInputStream fis = new FileInputStream("./test data/testDataDemoWebShop.xlsx");

				//step 2 create object of respective Filetype
				Workbook wb= WorkbookFactory.create(fis);
				
				//step3  call methods
			String url = wb.getSheet("sheet1").getRow(0).getCell(0).toString();
			String fname = wb.getSheet("sheet1").getRow(1).getCell(0).toString();
			 String lname = wb.getSheet("sheet1").getRow(2).getCell(0).toString();
			String email = wb.getSheet("sheet1").getRow(3).getCell(0).toString();
			String password = wb.getSheet("sheet1").getRow(4).getCell(0).toString();
			String confirmpass = wb.getSheet("sheet1").getRow(5).getCell(0).toString();
			
			
			//Automation Script
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
