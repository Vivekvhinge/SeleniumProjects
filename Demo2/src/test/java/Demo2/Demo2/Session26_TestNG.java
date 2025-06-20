package Demo2.Demo2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;  //step2
import org.testng.Assert;  //step4
import static org.junit.Assert.assertEquals;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Session26_TestNG{

	/*
	Points to remember for writing TestNG testcase.:
	1) TestNG does not require you to have a main() method.
	2) we needed to import the package org.testng.annotations.*;
	3) Methods need not be static. eg like public static void main instead use public void methodname()
	4) We used the Assert class.
	The Assert class is used to conduct verification operations in TestNG.
	Assertions in TestNG are a way to verify that the expected result matches the actual result.
	To use it, we need to import the org.testng.Assert package.  
	5) We used the @Test annotation. @Test is used to tell that the method under it is a test case.   */



	//step5 
	@Test
	public void verifypageTitle()  //step 3
	{
		//launch chrome browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); //instance of above

		//open url
		driver.get("http:www.google.com");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();

		//step4 and write'Assert' then for equal select boolean[]actual,boolean[]expected 
		Assert.assertEquals(actualTitle, expectedTitle);

	}

}
