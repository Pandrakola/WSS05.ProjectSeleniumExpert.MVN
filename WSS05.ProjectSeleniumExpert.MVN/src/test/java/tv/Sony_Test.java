package tv;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sony_Test {

	@Test(groups ="tv")
	public void account() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.sony.co.uk/");
		Thread.sleep(1000);
		driver.quit();

}
}