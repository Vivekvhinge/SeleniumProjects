package Demo2.Demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session17_Open_New_Tab_Or_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();//max the window sixe

		//open webpage
		driver.get("https://www.google.com/");
		System.out.println("First page :   " + driver.getTitle()); //to  print the title 

		//open new tab 
		driver.switchTo().newWindow(WindowType.TAB); //for opening new tab and window use "window"
		driver.get("https://www.facebook.com/"); //on new tab opened facebook
		System.out.println("second tab :   " + driver.getTitle()); //to  print the page 2ndtitle 

		//get window handles of open windows
		Set<String> windowhandles=driver.getWindowHandles(); //'set' used to set the string type to get the window handle
		List<String> handles= new ArrayList<String>(); //to store thw windowhandles in arraylist 
		handles.addAll(windowhandles); //in arraylist which is handle it will store the windowhandle by using addall

		driver.close();
		driver.switchTo().window(handles.get(0));//switch back to google
		System.out.println("First page:   " + driver.getTitle()); //to  print the title 










	}

}
