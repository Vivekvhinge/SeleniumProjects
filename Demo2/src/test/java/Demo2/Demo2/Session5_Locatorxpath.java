package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session5_Locatorxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for giving chromedriver path or instance ,Tell your computer where to find the Chrome robot controller (ChromeDriver).
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		//Hire the Chrome robot (create a WebDriver object).This opens a new Chrome browser window for your robot to control.
		WebDriver driver = new ChromeDriver();

		//open webpage ,'driver.get()' opens the given URL in the Chrome browser.
		driver.get("https://www.saucedemo.com/v1/");

		//locate username using single attribute eg //<html tag>[@attributename='attributeval] or //*[@attributename='attributeval]
		//input[@id='user-name']':'//input': "Look for an 'input' HTML tag anywhere on the page."- '[@id='user-name']': "AND that input tag must have an 'id' attribute with the value 'user-name'."
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		//for using contains methods eg:input[contains(@id,'user')
		//Locate the username field again, but this time using 'contains()' in XPath.This is a more flexible way to find elements when the attribute value might change slightly.
		// '//input[contains(@id,'user')]':- '//input': "Find an 'input' tag."- '[contains(@id,'user')]': "AND its 'id' attribute must CONTAIN the text 'user'."
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");

		//locate using multi attribute eg //<html tag>[@attributename1='attributeval1'][@attributename2='attributeval2']
		//Locate the password field using XPath with MULTIPLE attributes (AND condition).
		//*[@id='password'][@name='password']':'//*': "Look for ANY HTML tag anywhere on the page."- '[@id='password']': "AND it must have an 'id' attribute with value 'password'."- '[@name='password']': "AND it must also have a 'name' attribute with value 'password'."
		driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");

		//locate loginbutton
		driver.findElement(By.xpath("//input[@id='login-button']")).click();


		//switch to prodctpage
		String Currentwindowhandle=driver.getWindowHandle();//'driver.getWindowHandle()' gets a unique ID for the current browser tab/window.
		driver.switchTo().window(Currentwindowhandle);//You usually need this when your website opens *new* windows or tabs.

		//locate using AND condition eg: //<html tag>[@attributename='attributeval' and @attributename2='attributeval2'] 
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();

		//locate using AND condition eg: //<html tag>[@attributename='attributeval' or @attributename2='attributeval2'] 
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bikelight' or @name='add-to-cart-sauce-labs-bikelight']")).click();


		//starts with method eg://<html tag>[starts-with(@attributename='attributeval')]
		driver.findElement(By.xpath("//input[starts-with(@name,'user')")).sendKeys("standard_user");

		///using this website :https://only-testing-blog.blogspot.com/ below codes 
		//using POSITION MEthod eg : //tag-name[@attribute-type='attributeval'][position()=value]
		driver.findElement(By.xpath("//input[@type='text'][position()=2]")).sendKeys("standard_user");


		//using LAST MEthod eg : //tag-name[@attribute-type='attributeval'][last()=value]
		driver.findElement(By.xpath("//input[@type='text'][last()]")).sendKeys("standard_user");


	}

}
