package Session42_HTTPCookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Methods Το Query and Interact With Cookies
		1. driver.manage().getCookies(); // Return The List of all Cookies
		2. driver.manage().getCookieNamed(arg0);  //Return specific cookie according to name
		3. driver.manage().addCookie(arg0); //Create and add the cookie
		4. driver.manage().deleteCookie(arg0); // Delete specific cookie
		5. driver.manage().deleteCookieNamed (arg0); // Delete specific cookie according Name
		6. driver.manage().deleteAllCookies(); // Delete all cookies
		 */

		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		//max window size
		driver.manage().window().maximize();

		//open url
		driver.get("https://www.amazon.in/");

		//capture all cookies :type 1
		Set<Cookie> cookieslist= driver.manage().getCookies();

		//print & display count of cookies
		System.out.println("Total no of cookies :"  + cookieslist.size());

		for(Cookie ck:cookieslist)
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}

		//////////////////////////get specific cookie according to name :TYPE 2 ////
		//System.out.println(driver.manage().getCookieNamed("i18n-prefs"));


		////////////////////////TYPE 3   Create and add the cookie//////////////////
		Cookie CookieObj=new Cookie("VivekTest", "www.vivek.com");  //create cookie
		driver.manage().addCookie(CookieObj); //add cookie

		cookieslist= driver.manage().getCookies();

		//print & display count of cookies
		System.out.println("\n Total no of after adding cookies :"  + cookieslist.size());

		for(Cookie ck:cookieslist)
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}

		//////////////////TYPE 4 Delete specific cookie///////

		//print & display count of cookies
		driver.manage().deleteCookie(CookieObj); //delete cookie <main code nelow code for just print
		
		cookieslist= driver.manage().getCookies();
		System.out.println("\n Total no of after deleting cookies :"  + cookieslist.size());

		for(Cookie ck:cookieslist)
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}
		
		////////////////////TYPE 5 Delete specific cookie according Name////////
		driver.manage().deleteCookieNamed("i18n-prefs");
		
		cookieslist= driver.manage().getCookies();
		System.out.println("\n Total no of after deleting specific cookies :"  + cookieslist.size());

		for(Cookie ck:cookieslist)
		{
			System.out.println(ck.getName() + ":" + ck.getValue());
		}

		///////////////////////TYPE 6 Delete all cookies////////
		driver.manage().deleteAllCookies();
		
		cookieslist= driver.manage().getCookies();
		System.out.println("\n Total no of after deleting all cookies :"  + cookieslist.size());


		driver.quit();

	}

}
