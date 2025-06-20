package Session39_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginNormally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Page Object Model (POM) is a design pattern, popularly used in test automation that creates Object Repository for web Ul elements.
		Under PОМ:
		Each web page is application
		There is separate class for each web page to identify web elements of that web page and methods which perform operations on those Web Elements
		
		There are two types of POM:
		1.Without Page Factory: a)By(). method b)findElement()  
		2.With Page Factory: a)@FindBy annotation b)PageFactory.initElement()
		This initElements method will create all Webelement     */
		
		
		
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		//
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		


	}

}
