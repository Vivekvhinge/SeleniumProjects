package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session44_howToFillForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		//
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		Actions actions=new Actions(driver); //actions class and its obj
		Action serioesofaction=actions
				.moveToElement(driver.findElement(By.id("user-name")))
				.click() //imp part to click 
				.sendKeys("standard_user",Keys.TAB)
				.sendKeys("secret_sauce",Keys.ENTER).build();
		serioesofaction.perform(); //for performing actions in"serioesofaction" ,moveToElement used to move the cursor in postion ,keys. used to enter the key press
				
		
	}

}
