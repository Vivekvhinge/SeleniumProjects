package Session47_HeadlessBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();  //to run the browser headless use chromeoption sytax
		//options.setHeadless(true); <==for older version use this not working in my system
		options.addArguments("--headless=new"); //// For Chrome versions 109 and above use this set the chrome headless
		WebDriver driver=new ChromeDriver(options);//in new chromedriver just add the object of chromeoption . to run 

		//maximixe the window
		driver.manage().window().maximize();

		//open url
		driver.get("https://www.google.com/");

		//get & print Title
		System.out.println("before search  :" + driver.getTitle());

		//find element of search
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("India Gate",Keys.ENTER);
		System.out.println("after  search  :" + driver.getTitle());
		
		//close window
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();





	}

}
