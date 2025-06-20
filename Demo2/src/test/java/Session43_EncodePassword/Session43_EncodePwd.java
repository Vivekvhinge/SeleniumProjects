package Session43_EncodePassword;

import org.apache.commons.codec.binary.Base64;  //<imp import for encoding 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session43_EncodePwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		What is Encoding/Encryption
		Encryption is the process of converting plain text data into an unreadable format in order to protect unauthorized access.
		To secure our passwords/sensitive data we can use Base64 encoding
		scheme in Selenium WebDriver,
		We will import this Base64 class in our script to decode password/Sensitive data.  */
		
		
		//encode password below 3 lines to just reference for encoding string pwd
//		String password="admin123";  //created string variable pwd to store the pwd:admin123
//		
//		byte[] encodedpassword=  Base64.encodeBase64(password.getBytes()); //<syntac to encode passwd in byte and stored in byte array'encodedpwd'
//		System.out.println(new String(encodedpassword)); //encoded pwd can be viewed only by string as its new
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
		//decode pwsswprd
		byte[] decodedpassword=Base64.decodeBase64("YWRtaW4xMjM="); //decode the encoded pwd 
		
		driver.findElement(By.name("password")).sendKeys(new String(decodedpassword));//pasted the decode pwd  in string
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		

	}

}
