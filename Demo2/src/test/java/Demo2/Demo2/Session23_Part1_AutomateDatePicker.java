package Demo2.Demo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session23_Part1_AutomateDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		// Expected date in string form: 30-June-2025
		String expectedDay = "30";
		String expectedMonth = "June";
		String expectedYear = "2025";

		// Launch web browser with path and driver
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Open the URL jqueryui
		driver.get("https://jqueryui.com/datepicker/");

		// Switch to iframe
		driver.switchTo().frame(0);

		// Find webelement by id to perform click action
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();

		while (true) {
			// Store the calendar month & year by xpath which is expected to be clicked
			String calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear)) 
			{
				List<WebElement> dayslist = driver.findElements(By.xpath("//table/tbody/tr/td")); //days webelement from calendr stored in daylist

				for (WebElement e : dayslist) 
				{
					String calenderDays = e.getText();  //daylist after getting text stored as calandardays
					if (calenderDays.equals(expectedDay)) 
					{
						e.click();
						break;
					}
				}
				break;
			} 
			else 
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
	}
}

