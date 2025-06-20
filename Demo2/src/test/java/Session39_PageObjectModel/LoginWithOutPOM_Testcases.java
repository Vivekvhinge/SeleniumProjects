package Session39_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//WithOut Page factory below and testcases example
public class LoginWithOutPOM_Testcases {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();


		//create loginwithoutpom object 
		LoginWithOutPOM loginpg=new LoginWithOutPOM(driver); //driver taken cz of consturctor parameter [refer login page constructor)


		//max window size
		driver.manage().window().maximize();

		//url 
		driver.get("https://www.saucedemo.com/v1/");

		//now eneter details & login with help of loginpg obj 
		//step3 testcases
		loginpg.enterusername("standard_user");
		loginpg.enterpassword("secret_sauce");
		loginpg.clickonloginbutton();

	}

}
