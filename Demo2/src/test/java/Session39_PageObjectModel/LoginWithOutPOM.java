package Session39_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//WithOut Page factory below and testcases example & run the script with testcases page
public class LoginWithOutPOM {

	//in withoutpom dont use public void main string ,use methods & object 
//	1.Without Page Factory: a)By(). method b)findElement()  
	//1.we have to idenity web elemt 2.perform actions 3.make testcase on new class are the way to use withpage factory 
	
	WebDriver driver;
	
	//now creating constructor :classname & constructor name is same like loginwithoutpom
	LoginWithOutPOM(WebDriver d) //constructor and its parameters are webdriver and its obj is "d" to intilize
	{
		driver =d; //we have initize webdriver obj to constructor's obj
	}

	// to locate username,pwd,btn   we have identiy the webelemt
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbutton=By.id("login-button");
	
	//now we find & perform opertn so create method so we use a)findbyelemt
	//we have perform actions 
	
	public void enterusername(String uname) 
	{
		driver.findElement(username).sendKeys(uname); //in send keys we have use the string object to pass the name [taken By method object instaed of findelemnt method]
	}
	
	public void enterpassword(String upassword) 
	{
		driver.findElement(password).sendKeys(upassword); //in send keys we have use the string object to pass the password [taken By method object instaed of findelemnt method]
	}
	
	public void clickonloginbutton() 
	{
		driver.findElement(loginbutton).click(); //normally method[taken By method object instaed of findelemnt method]
	}

}
