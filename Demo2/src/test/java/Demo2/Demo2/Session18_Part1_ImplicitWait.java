package Demo2.Demo2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class Session18_Part1_ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*syntax for ImplicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  */

		//launch chromebrowser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Maximize the window
		driver.manage().window().maximize();

		//open the url 
		driver.get("https://www.ebay.com/");


		//implicit wait means to make the operations wait for some given time for all the steps ,global wait for all step just give one time
		//Disadvantage:if hardcoded time 10sec and if takes more than that then it will not show the error 

		//add implicit wait for the operations to perform
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //code for implicit wait

		//Created stopwatch ,not necessary only for understanding this condition
		Stopwatch watch =null; 

		//for try catch condn
		try 
		{  
			// started the stop watch to check the implicit wait,not necessary only for understanding this condition
			watch=Stopwatch.createStarted();

			//find webelement "Sell"
			driver.findElement(By.linkText("Sell")).click();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);  //will print exception 

			//print how much time taken for wait ,not necessary only for understanding this condition
			System.out.println(watch.elapsed(TimeUnit.SECONDS)+ "Seconds"); 
		}

	}

}
