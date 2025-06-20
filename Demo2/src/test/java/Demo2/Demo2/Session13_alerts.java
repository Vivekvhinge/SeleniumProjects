package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session13_alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();//max the window sixe
		
		driver.get("https://demo.automationtesting.in/Alerts.html"); //open webpage
		
		//find alert button & perform click operation 
		//driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click(); //alert  condition 1
		
		//driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();//for confirm alert condition2
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
		//condition 3 enter the words in prompt 
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().sendKeys("vivek");
		
		//driver.switchTo().alert().accept();//switch to alert window and to accept the alert ok 
		//driver.switchTo().alert().dismiss();//to cancel the alert 
		
		
		
		
		

	}

}
