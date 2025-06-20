package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session15_Tooltip {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();//max the window sixe


		driver.get("https://www.facebook.com/"); //open webpage
		
		//find sognup webelement
		String actualtootip = driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).getAttribute("title"); //this data is present
		String expectedtooltip = "Sign up for Facebook"; //this value should be present
		
		//if else for pass or fail 
		if(actualtootip.equals(expectedtooltip))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		//driver.findElement(By.xpath(""));
		driver.close();


	}

}
