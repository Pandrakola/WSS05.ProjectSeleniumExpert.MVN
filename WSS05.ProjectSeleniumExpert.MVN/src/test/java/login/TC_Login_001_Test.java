package login;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TC_Login_001_Test {
	
	@Test(groups = "watches")
	public void account() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.watchstation.com/");
		Thread.sleep(1000);
		driver.quit();

}
}