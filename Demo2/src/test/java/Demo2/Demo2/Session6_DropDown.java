package Demo2.Demo2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Session6_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver-win64 136\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //giving "webdriver" is class & imported & "chromedriver" is a variable  to open the chrome
		
		
		//open the opencart webpage # not working duw to autobot process
		//driver.get("https://www.opencart.com/index.php?route=account/register");
		
		//open  the "https://formstone.it/components/dropdown/demo/" webpage for test 
		driver.get("https://formstone.it/components/dropdown/demo/");
		 
		
		//cz we are taking the web elements, so "webelement" is a class & have to be imported with its obj name element like "driver".
		//WebElement element = driver.findElement(By.id("input-country")); //"element" is a variable 
		//'driver.findElement(By.id("demo_basic_2"))':- 'driver.findElement()': "Robot, go find ONE specific thing."- 'By.id("demo_basic_2")': "Find it by its 'id' attribute, which is 'demo_basic_2'."'WebElement element': We store this found dropdown in a special container called 'element'.
		WebElement element = driver.findElement(By.id("demo_basic_2"));
		
		//Select dropdown = new Select(element)':- 'Select' is a special tool (a class) from Selenium specifically for dropdowns.- We create a new 'Select' object and give it the 'element' (our dropdown) we just found.
	    //- 'dropdown' is now our special tool to interact with this specific dropdown.
		Select dropdown = new Select(element); // "Select" is aclass & imported  with "dropdown" as method 
		
		//"selectByVisibleText" to select tje visible text dispalyed on dropdwn on webpage 
		//dropdown.selectByVisibleText("Indiana");
		
		//"selectByValue" to select by the value give to it by dev eg iceland val =98 
		//dropdown.selectByValue("MS");
		
		//"selectByIndex" selected by the no of position 
		//dropdown.selectByIndex(1);
		
		
		
		// to check that dropdown is multiple or not with if/else condn using "is.multiple()) method
		/*if (dropdown.isMultiple()) 
		{
			System.out.println("dropdown is multiple");
		}
		else 
		{
			System.out.println("dropdown is  not multiple ");
		}   */

		
		//to see al the options available use list class with .getoptions() method
		//'dropdown.getOptions()': "Robot, give me a list of *all* the options available in this dropdown."
		//'List<WebElement> alldropdownoptions': We store this list of options in a container named 'alldropdownoptions'.
	    // '<WebElement>' inside '<>' tells Java this list will contain WebElements (each option is a WebElement).
		List<WebElement> alldropdownoptions = dropdown.getOptions(); // getoptions to get all the dropdownoptions
		
		for(WebElement el:alldropdownoptions) //el is var of webelement
		{
			System.out.println(el.getText()); // "getText()" used for getting the text from webelement "el" which is a var .
		}
		
		System.out.println("totaloptions:" + alldropdownoptions.size()); //to see the totaloptions
		driver.close();
		
		
		
		///////////////////////the above same code can be used for deselect method /////
		
	}

}
