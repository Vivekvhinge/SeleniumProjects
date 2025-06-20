package Demo2.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session24_WebDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch web browser with path and driver
		
		WebDriverManager.chromedriver().setup();  //webdrivermanager for all the browser supported just add .chrome or .edge & setup so no neeed to write system.setline
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Open the URL jqueryui
		driver.get("https://jqueryui.com/datepicker/");


	}

}
