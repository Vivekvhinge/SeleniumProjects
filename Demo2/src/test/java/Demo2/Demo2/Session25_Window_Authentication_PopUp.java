package Demo2.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session25_Window_Authentication_PopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can use autoid by the script will be different for each browser so we have use below 

		//launch web browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Syntax to handle window authentication popup with username:password@url.com: driver.get("https://Username:password@example.com");      
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); 
	}

}
