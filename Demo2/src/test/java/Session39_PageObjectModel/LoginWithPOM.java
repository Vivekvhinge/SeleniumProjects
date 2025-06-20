package Session39_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//With Page Factory & testcase ..run the script with testcases page
public class LoginWithPOM {

	//	2.With Page Factory: a)@FindBy annotation b)PageFactory.initElement()
	//    This initElements method will create all Webelement 

	WebDriver driver;  //create webdriver obj

	//create constructor and use webdriver as parameter/argument
	LoginWithPOM(WebDriver d)
	{
		driver =d;  //initize the driver
		PageFactory.initElements(driver, this); //this method will create web elements [mandatoty method]
	}

	//identify webelemt by a)@FindBy annotation method
	//identify user name
	@FindBy(id="user-name")
	WebElement username;  //direct usen the webelemt ,without findbyelement 

	//Identify password 
	@FindBy(id="password")
	WebElement password;  //direct usen the webelemt ,without findbyelement 


	//identify login button
	@FindBy(id="login-button")
	WebElement loginbtn;  //direct usen the webelemt ,without findbyelement 


	//we have perform actions 

	public void enterusername(String uname) 
	{
		username.sendKeys(uname); //directly usen the webement to sendkeys we have use the string object to pass the username
	}

	public void enterpassword(String upassword) 
	{
		password.sendKeys(upassword); //directly usen the webement to send keys we have use the string object to pass the password 
	}

	public void clickonloginbutton() 
	{
		loginbtn.click(); //directly usen the webement to perform click op
	}



}
