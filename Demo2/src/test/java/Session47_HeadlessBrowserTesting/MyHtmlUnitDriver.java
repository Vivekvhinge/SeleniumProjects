package Session47_HeadlessBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyHtmlUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch HTML_UNIT_DRIVER BROWSER
		HtmlUnitDriver driver=new HtmlUnitDriver();
		
		
		
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
