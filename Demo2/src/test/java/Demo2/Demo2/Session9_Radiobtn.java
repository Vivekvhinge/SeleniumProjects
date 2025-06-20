package Demo2.Demo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session9_Radiobtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();//max the window size 
	
		//driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");//open website udyamregistration
		driver.get("https://www.calculator.net/");
		//find raio buttons on webpage usong list with webelemt byxpath method 
		List<WebElement> radiobuttonlist= driver.findElements(By.xpath("//input[@type='radio']")); 
		
		//print total no of radio btn on webpage using size 
		System.out.println("Total no radio button on webpage :" + radiobuttonlist.size() ); 
		driver.close(); // to close the  current browser
		
		
	}

}
