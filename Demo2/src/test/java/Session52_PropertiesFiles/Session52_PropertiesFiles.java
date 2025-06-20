package Session52_PropertiesFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//first create this file  then "config.proprties" file then "readconfigfile" and then run this file to execute
public class Session52_PropertiesFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Properties File in selenium is a plain notepad file that are used to store the hard coded values 
		(Eg. Browser Name URL, user Id, Password etc.) in selenium.
		Properties file store the values in Key-Value pair.
		syntax: Key=Value
		Example:
		browser=chrome
		File Extension of properties file is .properties.
		For comments - ! or # are used

		 */

		//launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ReadConfigFile configfile= new ReadConfigFile(); //this created cz of readcondig file with its  object can be given in driver.get() to eliminate the hardcoded value



		driver.manage().window().maximize();//max the current window browser

		//open url
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//above code is commented cz its url is given in config.properties file with help of  readconfigfile.java file to runit so just written new code below

		driver.get(configfile.geturl()); //it will get the string of url config.properties file with help of  readconfigfile.java file to runit [eliminated hardcoded value of website url for safety also]

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//find username & enter username
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//above code is commented cz its username is given in config.properties file with help of  readconfigfile.java file to runit so just written new code below
		driver.findElement(By.name("username")).sendKeys(configfile.getusername()); //in sendkey just used the object created for username from readconfigfile
		//it will get the string of username from config.properties file with help of  readconfigfile.java file to runit [eliminated hardcoded value of website username for safety also]


		//find password & enter password
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//above code is commented cz its username is given in config.properties file with help of  readconfigfile.java file to runit so just written new code below
		driver.findElement(By.name("password")).sendKeys(configfile.getpassword()); //in sendkey just used the object created for password from readconfigfile
		//it will get the string of password from config.properties file with help of  readconfigfile.java file to run it [eliminated hardcoded value of website password for safety also]
		
		//find loginbtn and click 
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();






	}

}
