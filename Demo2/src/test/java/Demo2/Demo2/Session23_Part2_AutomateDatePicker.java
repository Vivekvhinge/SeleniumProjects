package Demo2.Demo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session23_Part2_AutomateDatePicker {

	
	/////////////////Not working due to attributes not clear on web 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Expected date in string form: 30-June-2025
		//String expectedDay = "30";
		String expectedDayMonth = "30 June";
		String expectedYear = "2025";

		// Launch web browser with path and driver
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Open the URL redbus
		driver.get("https://www.redbus.in/?gad_source=1&gad_campaignid=22513880550&gclid=CjwKCAjw6NrBBhB6EiwAvnT_ruLmrYt1TRzo9DEw4g5oSBikrcUHu6g_ZDBxlv8I3D6SUlWQSwu-LxoCVSMQAvD_BwE");

		

		// Find webelement by id to perform click action
		WebElement datepicker = driver.findElement(By.id("onwardCal"));
		datepicker.click();

		while (true) {
			// Store the calendar month & year by xpath which is expected to be clicked
			String calendarDayMonth = driver.findElement(By.xpath("//text[@class='dateText']")).getText();
			String calendarYear = driver.findElement(By.xpath("//text[@class='yearText']")).getText();

			if (calendarDayMonth.equals(expectedDayMonth) && calendarYear.equals(expectedYear)) 
			{
				List<WebElement> dayslist = driver.findElements(By.xpath("//table/tbody/tr/td")); //days webelement from calendr stored in daylist

				for (WebElement e : dayslist) 
				{
					String calenderDays = e.getText();  //daylist after getting text stored as calandardays
					if (calenderDays.equals(expectedDayMonth)) 
					{
						e.click();
						break;
					}
				}
				break;
			} 
			else 
			{
				driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
			}
		}

	}

}

//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']
//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']

