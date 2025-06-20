package Demo2.Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

///create javaultiy file 

public class Session19_JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		syntax JavascriptExecutor: is a interface that helps to execute javascript throgh selenium driver
		JavascriptExecutor js = (JavascriptExecutor) driver; ///(JavascriptExecutor) it is a typecast() cz it don't have access with chromedriver ,see diagram selenium browser driver class hierarchy,if we use specific class like chrome or edge then we dont need to use typecast but it is for a speciffic browser in this u have to chnage everytime so user needs webdriver typecast for common 
		executeScript(String script, Object... arguments);  script:javascript that needs to be executed ;
		arguments:is the arguments to the script & optional ;
		returns: could be anything from boolean,long,str,list,webelement or null .   */

		//launch chromebrowser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//maximixe the window
		driver.manage().window().maximize();

		//open the url 
		driver.get("https://testautomationpractice.blogspot.com/");

		//use JavascriptExecutor ,()typecast cz its not directly included in webdriver 
		JavascriptExecutor js= (JavascriptExecutor)driver;

		//Enter text in search box [JavascriptExecutor is used for realtime cz sometimes ,selenium methods don't work in realtime]
		//syntax for enter text in search box :js.executeScript("document.getElementById('-enter id').value='text to be entered';");
		//js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='tooltip';");

		//click on find button 
		//syntax for click button :js.executeScript("arguments[0].click();",element);<--- in this we have to use webelement to click 
		WebElement element =driver.findElement(By.xpath("//input[@type='submit']"));
		//js.executeScript("arguments[0].click();",element);

		///////////////////////////////////////////////////////////////////////////////////////
		//to refresh the browser window/page syntax:  js.executeScript("history.go(0)");
		//js.executeScript("history.go(0)");

		///////////////////////////////////////////////////////////////////////////////////////////
		//to get the domain name syntax :js.executeScript("return document.domain;").toString();
		//		String domain =js.executeScript("return document.domain;").toString();
		//		System.out.println("Domain name :" + domain);
		//
		//
		//		////////////////////////////////////////////////////////////////////////////////////
		//		//get title name syntax:js.executeScript("return document.title;").toString();
		//		String title =js.executeScript("return document.title;").toString();
		//		System.out.println("title name : " + title);
		//
		//		////////////////////////////////////////////////////////////////////////////////////
		//		//get URL name syntax:js.executeScript("return document.URL;").toString();
		//		String URL =js.executeScript("return document.URL;").toString();
		//		System.out.println("URL name :" + URL);


		//////////////////////////////////////////////////////////
		//draw border around web element syntax : js.executeScript("arguments[0].style.border = '3px solid red';", element);
		//js.executeScript("arguments[0].style.border = '3px solid red';", element);//for this we have used webelemt find button for border from above code 41

		//zoom webpage syntax : js.executeScript("document.body.style.zoom='zoom %'");
		//js.executeScript("document.body.style.zoom='50%'");

		///////////////////////////////////////////////////////////////////////
		//Return height and width of web page below syntax
		//js.executeScript("return window.innerHeight;").toString();
		//js.executeScript("return window.innerWidth;").toString();

		//System.out.println(js.executeScript("return window.innerHeight;").toString());
		//System.out.println(js.executeScript("return window.innerWidth;").toString());

		////////////////////////////////////////////////////////////////////////////
		//scroll vertically till the end synatx :js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		//scroll vertically page up sytax :js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");


		///////////////////////////////////////////
		//to generate alert popup  in window using selelimin webdriver syntax:js.executeScript("alert('This is my alert message.');");
		//js.executeScript("alert('This is my alert message.');");


		///////////////////////////////////////////
		///to navigate to diffrent page using javascr syntax:js.executeScript("window.location = 'url'");
		//js.executeScript("window.location = 'http://www.google.com'");

		///////////////////////////////////////////////////////////
		//to flash the web element
		//flash
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 20; i++) 
		{
			js.executeScript("arguments[0].style.backgroundColor ='#000000'", element);//black

			try {
				Thread.sleep(80);//20 ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			js.executeScript("arguments[0].style.backgroundColor = '" + bgcolor + "'", element);

			try {
				Thread.sleep(80);//20 ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}



		//driver.close();
	}

}
