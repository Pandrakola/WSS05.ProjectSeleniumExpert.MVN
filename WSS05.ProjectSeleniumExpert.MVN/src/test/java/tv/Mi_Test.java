package tv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mi_Test {

	@Test(groups = "tv")
	public void openMi() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mi.com/in/smart-home/");
		Thread.sleep(1000);
		driver.quit();
	}
}

