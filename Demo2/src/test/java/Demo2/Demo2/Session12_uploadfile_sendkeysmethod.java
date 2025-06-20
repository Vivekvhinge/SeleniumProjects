package Demo2.Demo2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session12_uploadfile_sendkeysmethod {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		//launch chromebrowser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.manage().window().maximize();//max the current window browser
				
		driver.get("https://demoqa.com/upload-download");//open orlaunch the webpage
		
		
		//by usingxpath to upload by inputfile type & sendkeys= pathoffileupload.     TYPE=FILE SO WE HAVE USED BELOW METHOD
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\supermarket.xlsx");
		
		///if the filetype is diffreent than use robot class method 
		WebElement button=driver.findElement(By.xpath("//input[@id='uploadFile']")); //webelent class ,button is obj
		Actions act=new Actions(driver); //created action class ,act is obj
		act.moveToElement(button).click().perform(); //actn obj and movetoelement method to button obj for performing click 
		
		Robot rb=new Robot(); //created rbotob class with rb as obj 
		rb.delay(3000); //3000 means 3 secs 
		
		//copy file to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\OneDrive\\Desktop\\supermarket.xlsx"); // stringselectn used cz its a string with path 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //setcontent used to paste the ss varaible 
		
		//perform control + v  action to paste file 
		rb.keyPress(KeyEvent.VK_CONTROL);  ///pressing control button
		rb.keyPress(KeyEvent.VK_V);    //pressing v button
		
		rb.keyRelease(KeyEvent.VK_CONTROL);   ///releasing control button 
		rb.keyRelease(KeyEvent.VK_V); //releasing v button
		
		rb.keyPress(KeyEvent.VK_ENTER); // pressing enter button
		rb.keyRelease(KeyEvent.VK_V); //releasing enter button
		
		
		
		
		
		
		
		

	}

}
