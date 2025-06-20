package Demo2.Demo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session23_Part3_AutomateDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Expected date in string form: 30-June-2025
		String expectedDay = "30";
		String expectedMonthYear = "June 2025";
		//String expectedYear = "";

		// Launch web browser with path and driver
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Open the URL goibibo
		driver.get("https://www.goibibo.com/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!602838584772!e!goibibo!c!&gad_source=1&gad_campaignid=108599293&gbraid=0AAAAADrlxCdXWYgfMIRZHe3XPbfajQloQ&gclid=CjwKCAjw6NrBBhB6EiwAvnT_rv09Lccl1mN2EQTuHEIHETzPM8DHyrvyGhHwMBxZj9wu0Hi1jvoYiRoCb70QAvD_BwE");


		//to cancel the signup add
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/span")) .click();  

		// Find webelement by id to perform click action to open the clander
		WebElement datepicker = driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']"));
		datepicker.click();

		while (true) {
			// Store the calendar month & year by xpath which is expected to be clicked
			String calendarMonthYear = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();

			if (calendarMonthYear.equals(expectedMonthYear)) 
			{
				List<WebElement> dayslist = driver.findElements(By.xpath("//p[@class='fsw__date']")); //days webelement from calendr stored in daylist

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
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}

	}
}


