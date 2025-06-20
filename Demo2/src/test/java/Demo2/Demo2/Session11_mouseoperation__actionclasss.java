package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session11_mouseoperation__actionclasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
		driver.manage().window().maximize();//max the current window browser
				
		//driver.get("https://demoqa.com/buttons");//open orlaunch the webpage
		
		//////////////below code for right click ////////////
		
		/*WebElement button =driver.findElement(By.xpath("//button[@id='rightClickBtn']"));	 //find xpath for right 
		Actions act =new Actions(driver); //actions=class to perform actions  & act obj 
		act.contextClick(button).perform();// "contextClick" is right click ,"perform" is to do operatn  */
		
		///////////below code for double click //////////
		
		/*WebElement button=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions act=new Actions(driver);
		act.doubleClick(button).perform(); */
		
		/////////below code for drag and drop ///// and use new weblink as below "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"
		/*
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.id("box6"));//rome  (source is rome boxno 6)
		WebElement target =driver.findElement(By.id("box106"));//italy(target is italy boxno 106)
		WebElement source1 = driver.findElement(By.id("box3"));//rome  (source is rome boxno 6)
		WebElement target1 =driver.findElement(By.id("box103"));//italy(target is italy boxno 106)
	
	
		Actions act= new Actions(driver);// actions class to perform action 
		act.dragAndDrop(source, target).perform();
		act.dragAndDrop(source1, target1).perform();
		
		 												*/
		
		
		////////////////below code for mouse overaction and new url https://export.ebay.com/in/
		driver.get("https://demoqa.com/elements");
		
		WebElement mouseaction=driver.findElement(By.linkText("Check Box"));
		Actions act= new Actions(driver);
		act.moveToElement(mouseaction);

	}

}
