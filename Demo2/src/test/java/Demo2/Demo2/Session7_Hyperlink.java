package Demo2.Demo2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session7_Hyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open webpage "https://www.calculator.net/"
		driver.get("https://www.calculator.net/");
		
		List<WebElement> linkelement= driver.findElements(By.tagName("a")); //"tagname" used cz of " <a  means anchor tag" ,list for listing ,webelement for elements on web and linkelemt as variable
		System.out.println("Total links on webpage :" + linkelement.size());
		//driver.close();
		for (WebElement el : linkelement) //for loop used to print each name using webelement+ el =linkelemnt 
		{
			System.out.println(el.getText());  //to print the text from linkelement 
		}
		

	}

}
