package genericLibr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class App {
	
	public int userLogin(String user,String pass) throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		//ResourceBundle rb= ResourceBundle.getBundle("config");
		Properties reff =new Properties();
		reff.load(new FileInputStream("./src/main/resources/config.properties"));
		String username =reff.getProperty("username");
		String password = reff.getProperty("password");
	
	if(user.equals(username)&&pass.equals(password)) 
		return 1;
	else
		return 0;
		
	}
	}
	
	
	




