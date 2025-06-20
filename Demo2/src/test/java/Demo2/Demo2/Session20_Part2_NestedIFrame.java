package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session20_Part2_NestedIFrame {
	//date:27/05/2025

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//maximize the window
		driver.manage().window().maximize();

		//open url 
		driver.get("https://www.dezlearn.com/nested-iframes-example/");


		//Switch to frame 1
		driver.switchTo().frame("parent_iframe"); ///parent frame or outer frame

		//find by id and click
		driver.findElement(By.id("u_5_5")).click();

		//switch to frame2
		driver.switchTo().frame("iframe1"); //child or inner frame
		
		//find by id   and click 
		driver.findElement(By.id("u_5_6")).click();

		//driver.switchTo().parentFrame(); is used to switch back to parent frame or frame1



	}

}
