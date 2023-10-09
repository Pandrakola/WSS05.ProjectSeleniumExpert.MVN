//package sample;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class TC_registerUser_Test {
//	@Test
//	public void login() {
//		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
//		
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/register");
//		if(gender.equalsIgnoreCase("male")){
//			driver.findElement(By.id("gender-male")).click();
//		}else {
//			driver.findElement(By.id("gender-female")).click();
//	}		
//		driver.findElement(By.id("FirstName")).sendKeys(gender);
//		Thread.sleep(2000);
//		driver.findElement(By.id("LastName")).sendKeys(fistName);
//		Thread.sleep(2000);
//		driver.findElement(By.id("Email")).sendKeys(lastName);
//		Thread.sleep(2000);
//		driver.findElement(By.id("Password")).sendKeys(pass);
//		Thread.sleep(2000);
//		driver.findElement(By.id("ConfirmPassword")).sendKeys(confpass);
//		Thread.sleep(2000);
//		driver.findElement(By.id("register-button")).click();	
//		driver.close();
//	}
//	
//	
//
//	  }
//
//
