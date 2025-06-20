package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session10_Imagelinks {
	
	//date:22-05-2025
	//link or partial text method camt be used /////use cssselector or xpath

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();//max the current window browser
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");//open orlaunch the webpage 
		
		//find the web element image link 
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		
		//verify title of the current page with the expected homepage title using if elese statement 
		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) 
		{
			System.out.println("Test passed");
		} 
		else
		{
			System.out.println("Test failed");

		}
		
		driver.close(); //close the current browserpage 
		
		

	}

}
