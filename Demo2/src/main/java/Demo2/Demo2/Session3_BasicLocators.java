package Demo2.Demo2;

//Selenium webdriver With Java Session#3 Part-1 (Basic Locators)

import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session3_BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//launch the web browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");

		//'WebDriver' is the main tool you'll use to control the browser.& 'new ChromeDriver()' actually opens a new Chrome browser window.
		WebDriver driver = new ChromeDriver();

		//Tell the robot to go to a specific website.'driver.get()' opens the given URL in the Chrome browser.
		driver.get("https://www.saucedemo.com/v1/");

		//locate username by ID
		//Find the 'username' box on the page and type in "standard_user".
		// 'driver.findElement(By.id("user-name"))':
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); //send key uses to send the info in input box 

		//or by using "tagname" for username 

		//driver.findElement(By.tagName("input")).sendKeys("standard_user");


		//locate password by name &The commented-out line below tried to find the username box by its 'tag name' ("input").
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		//or by using "tagname" for password cannot be done as it is not unquie ,cz username and password input box name is same
		//driver.findElement(By.tagName("input")).sendKeys("secret_sauce");



		//locate login button by classname ,'By.className("btn_action")': "Find it by its 'class' attribute, which is 'btn_action'."
		driver.findElement(By.className("btn_action")).click();


		//switch to product page 
		String CurrWindowHandle = driver.getWindowHandle(); //'driver.getWindowHandle()' gets a unique ID for the current browser tab/window
		driver.switchTo().window(CurrWindowHandle); // tells the robot to focus on that specific window.

		//locate Sauce Labs Bolt T-Shirt on click by using "linktext" for excat text finding
		//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();


		//to locate the partiallink text nut has to be unique
		//driver.findElement(By.partialLinkText("Bolt")).click();

		List <WebElement> elementlist = driver.findElements(By.partialLinkText("Sauce")); //'By.linkText("Sauce Labs Bolt T-Shirt")': Finds a link by its exact visible text.
		//"By specifying <WebElement>" you are telling the Java compiler that this List will only contain objects of type WebElement (or its subclasses). '<WebElement>' in 'List <WebElement>' tells Java that this list will only hold web elements.
		System.out.println("ElementSize :" + elementlist.size()); //size is used for seeing the total value 

	}

}

