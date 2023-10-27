package tv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samsung_Test {

	@Test(groups = "tv")
	public void openSamsung() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.samsung.com/in/offer/online/samsung-fest/television-soundbar/");
		Thread.sleep(1000);
		driver.quit();
	}
}