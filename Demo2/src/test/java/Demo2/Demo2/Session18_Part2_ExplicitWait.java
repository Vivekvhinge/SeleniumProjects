package Demo2.Demo2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Session18_Part2_ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Syntax of ExplicitWait;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(bylocator)) <--Mandatory condition ;*/
		
		//ExplicitWait  is webelement specific only & expected condition mention krte h

		//launch chromebrowser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//maximixe the window
		driver.manage().window().maximize();

		//open the url 
		driver.get("https://www.ebay.com/");

		//add explicit wait of 10 secs
		// syntax of explicit wait (webdiverwait is class and imp)
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		//Created stopwatch but not necessary only for understanding this condition
		Stopwatch watch =null; 

		//for try catch condn 
		try 
		{ 
			// started the stop watch to check the explicit wait, not necessary only for understanding this condition
			watch=Stopwatch.createStarted();

			//find webelement "Sell" and condn
			//if condn is true then it will be element then in next line click 
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sell")));
			element.click(); //click
			
			//below code my understanding to check in selenium 
			//System.out.println(driver.getTitle()); 
			//System.out.println(driver.getCurrentUrl());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);  //will print exception 
			//print how much time taken for wait,not necessary only for understanding this condition
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+ "Seconds");  
		}

	}

}
