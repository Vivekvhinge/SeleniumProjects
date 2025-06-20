package Demo2.Demo2;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session8_Brokenlinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch chromedriver
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		//wait for 10secs
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//launch webpage
		driver.get("http://www.deadlinkcity.com/");
		
		//using list& webelemnts for hyperlink 
		List<WebElement> linklist =driver.findElements(By.tagName("a"));
		
		
		
		int responsecode=200;//responsecode store in var whichb is valid link 
		int brokenlinkcount=0; //store and start the broken link count from 0 
		System.out.println("total links on webpage :" + linklist.size()); //to print the total links on webpage 

		for (WebElement el : linklist) 
		{
			
			String url =el.getAttribute("href");//string format to capture the url using"getattribute" ,url is var
			 
			try    //try catch to created ob of url
			{
				URL urllink=new URL(url); ///url is obj of class and new name is url .
				HttpURLConnection huc =(HttpURLConnection)urllink.openConnection(); //for connection of url
				huc.setRequestMethod("HEAD"); //for setting the request  &huc is hhtpurlconn is obj
				huc.connect();//to connect the url 
				
				responsecode=huc.getResponseCode();//storing the responecode in var 
				if(responsecode >=400) //if response code is greater than 400 than it will display link is broken 
				{
					System.out.println(url + "brokenlink."); 
					brokenlinkcount ++; // if more brokenlinks then help to increase the count 
					
				}
				
			} 
			
			catch (MalformedURLException e) //to catch the malfunction urls 
			{
				// TODO: handle exception
			}
			catch(Exception e) // for (HttpURLConnection e) it is created 
			{
			
		}}
		
		System.out.println("total brokenlinks :" + brokenlinkcount); //total brokenlink count after for loop 
		
		
		

	}}


