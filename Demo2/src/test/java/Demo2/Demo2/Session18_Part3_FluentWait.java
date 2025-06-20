package Demo2.Demo2;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Session18_Part3_FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Same as fluent wait but polling time & .ignoring is added 
		//pooling time :if timeout is 10sec & pollingtime is 5,then polling time will check 2 time cz 5*2=10sec cz of (timeout)
		//ignoring =to ignore the exceptions error 

		/*syntax for fluentwait:
		 * Wait<webdriver>fluentwait=new fluentwait<webdriver>(driver)
		 * .withtimeout(duration.ofsec(10))
		 * .pollingEvery(duration.ofsec(10))       
		 * .ignoring(NoSuchElementException.class);
		 */

		//launch chromebrowser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//maximixe the window
		driver.manage().window().maximize();

		//open the url 
		driver.get("https://www.ebay.com/");

		//add fluent wait of 10sec sec 
		Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("this is custom message ")
				.ignoring(NoSuchElementException.class);
		
		//find webelement "Sell" and condn
		//if condn is true then it will be element then in next line click 
		WebElement element=fwait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sel22l"))); //Sel22l for seeing the error 
		element.click(); //click

	}

}
