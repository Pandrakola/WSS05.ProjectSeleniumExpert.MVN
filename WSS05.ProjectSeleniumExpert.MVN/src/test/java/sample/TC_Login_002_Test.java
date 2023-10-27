package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Login_002_Test {

	@Test(groups = "watch")
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.boat-lifestyle.com/");
		Thread.sleep(1000);
		driver.quit();
	}
}
