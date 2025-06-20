package Demo2.Demo2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Session20_Part1_IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//		frame =divides single window into multiple html pages 
		//		iframe=in that user can display external source to their html or web page 
		//ifrmae syntax = driver.switchto().frame()

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//maximize the window
		driver.manage().window().maximize();

		//		//open url or web page
		//driver.get("https://www.rediff.com/");
		//		
		//		//switch to moneyiframe [in inspect search <iframe> for proper]
		//		driver.switchTo().frame("moneyiframe");
		//		
		//		//find element  by ID & print 
		//		String nseindex=driver.findElement(By.id("nseindex")).getText();
		//		System.out.println(nseindex);

		///////////////////////////////////////////////EXAMPLE 2////////////////
		//open url or web page
		//driver.get("https://vinothqaacademy.com/iframe/");



		//driver.switchTo().frame("moneyiframe");
		//String namew = driver.findElement(By.id("bseindex")).getText();
		//System.out.println(namew);


		/////////////////////by webelement 
//				WebElement iframewebelement =driver.findElement(By.name("moneyiframe"));
//				driver.switchTo().frame(iframewebelement);
		//		 ///for inside id to print 
		//		String namew = driver.findElement(By.id("bseindex")).getText();
		//		System.out.println(namew);
		//		
		//		


		driver.get("https://vinothqaacademy.com/iframe/");

		// syntax of explicit wait (webdiverwait is class and imp)
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try 
		{ 
			

			//find webelement "addbtn" and condn
			//if condn is true then it will be element then in next line click 
			WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("addBtn")));
			element.click(); //click
			
			//below code my understanding to check in selenium 
			//System.out.println(driver.getTitle()); 
			//System.out.println(driver.getCurrentUrl());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);  //will print exception 
			//print how much time taken for wait,not necessary only for understanding this condition
			//System.out.println(watch.elapsed(TimeUnit.SECONDS)+ "Seconds");  
		}


	driver.switchTo().frame("employeetable");    
		//driver.switchTo().defaultContent();
		driver.findElement(By.id("addBtn")).click();  ///timing issue only otherwisecode is right
				
		
		
		////////////////////////////////////to print totall no of iframes present on webpage
		//int NoOfframes=driver.findElements(By.tagName("iframe")).size();
		//System.out.println("No of iframes" + NoOfframes);






	}

}
