package generic;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login_Test {
	
	@Test
	public void lohin_Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("xyzabc12345@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("xyz12345");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.close();
	}

}
