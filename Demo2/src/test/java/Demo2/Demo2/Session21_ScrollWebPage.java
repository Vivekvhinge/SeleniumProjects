package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import freemarker.template.utility.Execute;
import io.cucumber.core.gherkin.Argument;

public class Session21_ScrollWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chromebrowser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Maximize the window
		driver.manage().window().maximize();

		//open the url 
		driver.get("https://www.calculator.net/");


		/*Syntax for JavascriptExecutor : JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("script,arguments"); */
		JavascriptExecutor js = (JavascriptExecutor)driver;

		try //for better understanding for me no neeed of this in this code 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		///to scroll down the webpage by pixel //syntax :js.executeScript("window.scrollBy(x-pixels,y-pixels)");,y means vertical
		//js.executeScript("window.scrollBy(0,500)"); //scroll vertical by 500 pixel 

		
		
		////////////to scroll down the webpage by the visibility of element///////////////
		//syntax : js.executeScript("arguments[0].scrollIntoView();",Element); element means webelemt
		
		//webelemt to find the linktext 
		//WebElement element=driver.findElement(By.linkText("BMI Calculator"));
		//js.executeScript("arguments[0].scrollIntoView();",element);
		
		/////////////to scroll down the webpage  at the bottom of the page///////////////
		//syntax : js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		//////////////////Horizontal scroll on webpage ////////
		//synatx :  js.executeScript("arguments[0].scrollIntoView();",Element); element means webelement
		
		WebElement element=driver.findElement(By.id("")); //didnt find anywebsite so no id is present in code
		js.executeScript("arguments[0].scrollIntoView();",element);
		
		
		
	}

}
