package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadData_Test {
	
	@Test
	public void registerUser() throws Exception, IOException   {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");
		Workbook ref = WorkbookFactory.create(fis);
		Row dataRow = ref.getSheet("Login").getRow(0);
		String gender = dataRow.getCell(0).toString();
		String fistName = dataRow.getCell(1).toString();
		String lastName = dataRow.getCell(2).toString();
		String emailId = dataRow.getCell(3).toString();
		String pass = dataRow.getCell(4).toString();
		String confpass = dataRow.getCell(5).toString();
		


		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
    	ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		if(gender.equalsIgnoreCase("male")){
			driver.findElement(By.id("gender-male")).click();
		}else {
			driver.findElement(By.id("gender-female")).click();
	}		
		driver.findElement(By.id("FirstName")).sendKeys(fistName);
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(emailId);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confpass);
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();	
		driver.close();
	}
}


