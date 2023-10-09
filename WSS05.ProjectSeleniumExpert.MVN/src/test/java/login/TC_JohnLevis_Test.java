package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_JohnLevis_Test {
	

	@Test  
	public void login() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	    JavascriptExecutor js=driver;
	    
	    driver.get("https://www.levi.in/buy-more-save-more?");
	   WebElement addToBag = driver.findElement(By.id("quickviewbutton"));
	   js.executeScript("arguments[0].click()", addToBag);
	   Thread.sleep(1000);
	  driver.quit();
	}
}
