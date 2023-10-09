package generic;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibr.App;
  
public class TC_App_Test {
	
		@Test   //unit test case by using testng
		public void testLogin1() throws FileNotFoundException, IOException {
			App ap=new App();
			Assert.assertEquals(0,ap.userLogin("abc","abc123"));
		}
		@Test
		public void testLogin2() throws FileNotFoundException, IOException {
			App ap=new App();
			Assert.assertEquals(1, ap.userLogin("abc", "abc@123"));
			
		}
}
