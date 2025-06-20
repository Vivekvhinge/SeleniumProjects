package Demo2.Demo2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session14_WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
	    driver.manage().window().maximize();//max the window sixe
		
	    /*
		driver.get("C:\\Users\\Admin\\eclipse-workspace\\Demo2\\tabledoc.html"); //open webpage
		
		
		//find 2nd cell in webtable and print the 2nd cell data
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		
		
		//to print the total no of rows in webtable
		List<WebElement> listrow=driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("total no of rows :" + listrow.size());
		
		
		////to print the total no ofcolumns in webtable 
		List<WebElement> listcolumn=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("total no of columns :" + listcolumn.size());
		
		////to print each cell data by using for loop
		for (int r = 2; r <= listrow.size(); r++) 
		{
			for ( int c=1;c<=listcolumn.size();c++)
			{
				String data = driver.findElement(By.xpath("//table/tbody/tr["+ r  + " ]/td[" + c +" ]")).getText();
				System.out.println(data);
			}
		}                 */
		
		/////////////new example with url "https://testautomationpractice.blogspot.com/'
		//table[@name='BookTable']/tbody/tr
		driver.get("https://testautomationpractice.blogspot.com/"); //open webpage
		
		//to print the total no of row in webtable
		List<WebElement> rowlist=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Total no of rows : " + rowlist.size());
		
		//to print the total no ofcolumns in webtable
		List<WebElement> columnlist = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("total no of columns :"  + columnlist.size());
		
	////to print each cell data by using for loop
		for(int r=2;r<=rowlist.size();r++) //for row
		{
			for(int c=1;c<=columnlist.size();c++)//afterrow is checked then inside it will check for column
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + " ]")).getText();
				System.out.println(data);
			}
		}
		
		driver.close();

	}

}
