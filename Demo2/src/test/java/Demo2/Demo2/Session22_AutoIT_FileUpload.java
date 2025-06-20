package Demo2.Demo2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session22_AutoIT_FileUpload {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch web browser with path and driver
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Maximize the window
		driver.manage().window().maximize();

		//open the url 
		driver.get("https://the-internet.herokuapp.com/upload");

		//find choose web elemet button creted cz not able to find the button so we have below created action class 
		WebElement button = driver.findElement(By.id("file-upload"));


		/*
		 first install autoid finder & editor app
		 second open auto id finder app from program file and run autoidv3 x64 app file and from "SciTE"  and run "SciTE" editor app
		 3rd by finder app point the pointer to see the details of the imge/btn and after that insert the info in editor by scripting .
		 4th save the file and build it ,then below program   */

		Actions act= new Actions(driver); //Created action class for button to be pressed
		act.moveToElement(button).click().perform(); //moveelement&Click&perform operation so the button can be clicked 

		//Integrate autoit with selenium with  created script file & fileto be uploaded
		try {

			//syntax for runtime :Runtime.getRuntime().exec("path from where the scriptfile is located " + ""+"path of the file to be uploaded.");
			Runtime.getRuntime().exec("C://Users//Admin//OneDrive//Desktop//vivek//fileupload.exe" + " " +"C://Users//Admin//OneDrive//Desktop//supermarket.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//C:\Users\Admin\OneDrive\Desktop\vivek\fileupload.au3





	}

}
