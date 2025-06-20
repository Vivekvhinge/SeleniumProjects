package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session4_Csslocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//launch chrome browser Set up the Chrome Robot Controller (ChromeDriver).
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		
		//Hire the Chrome Robot (open a new Chrome browser window).
		WebDriver driver = new ChromeDriver();
		//Tell the robot to go to the Sauce Labs website.
		driver.get("https://www.saucedemo.com/v1/"); //giving "driver" var with ".get" url or open swaglabweb page 
		 
		//locate username -- tag#id
		//'input#user-name':- 'input' means: "Find an HTML tag that is an 'input' box."'#user-name' means: "AND that input box must have an 'id' of 'user-name'."
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//locate password ==tag#[attribute name=value]
		//'input[name=password]':- 'input' means: "Find an 'input' HTML tag."[name=password]' means: "AND that input tag must have an attribute named 'name' with a value of 'password'."
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
	
		
		//locate login button using tag.value of classname
		//'input.btn_action':- 'input' means: "Find an 'input' HTML tag."- '.btn_action' means: "AND that input tag must have a 'class' attribute that includes 'btn_action'."
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		//switch to productpage
		String currentwindowhandle = driver.getWindowHandle(); //'driver.getWindowHandle()' gets a unique ID for the current browser window/tab.
		driver.switchTo().window(currentwindowhandle); //You usually need this when your website opens *new* windows or tabs.
		
		
		
		//tag.valueClass[attribute=value
		//driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click(); line not working i guess due to classname 
		//driver.findElement(By.cssSelector("button.btn_primary.btn_inventory")).click();
				

		//
		
		//driver.findElement(By.cssSelector("button[name$=Sauce Labs Bike Light")).click();
		// Using By.cssSelector for a div with a specific class
		//driver.findElement(By.cssSelector("div.inventory_item_name")).click();
		// Finds a <div> element where the 'class' attribute value ends with "inventory_item_name"
		driver.findElement(By.cssSelector("div[class$='Sauce_Labs_Bike_Light']")).click();
	}

}
