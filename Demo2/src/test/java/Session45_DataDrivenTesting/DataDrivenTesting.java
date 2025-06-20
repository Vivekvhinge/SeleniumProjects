package Session45_DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// Selenium imports commented out as they are not used in this part of the code
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Data-driven testing is a test automation framework which stores test data in a table or spread spreadsheet format (Eg. Excel File).
		Using Java Classes and Apache POI library we can manipulate (read/write) Excel Files (both XLS and XLSX file format) in Selenium WebDriver.

		XSSFWorkbook ExcelWBook = null; <--manipulate excelworkbook
		XSSFSheet ExcelWSheet;  <--manipulate excelworksheet
		XSSFRow Row;  <--manipulate excelrow
		XSSFCell Cell;  <--manipulate excelcell
		 */

		// Class for workbook code
		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet; // No initial assignment, will be assigned inside try
		XSSFRow Row;
		XSSFCell Cell;

		// Create an object of file class to open the file
		File excelfile = new File("D:\\selenium\\Testdatafile.xlsx");

		// Create an object to fileinputstream to read the data from the file
		// FIX: Declare 'FileInputStream inputstream' directly inside the try-with-resources parentheses.
		try (FileInputStream inputstream = new FileInputStream(excelfile)){ // <-- Essential Fix Here

			//excel>>workbook>>sheet>>row>>cell
			//create an object of XSSFWorkbook to handle excel file
			ExcelWBook=new XSSFWorkbook(inputstream);


			//to acess the workbook sheet
			ExcelWSheet=ExcelWBook.getSheetAt(0);


			//get total row count save in int ttrows
			int ttrows=ExcelWSheet.getLastRowNum() + 1;

			//get total no of cells in row
			int ttlcells=ExcelWSheet.getRow(0).getLastCellNum();


			for (int currentrow = 1; currentrow < ttrows; currentrow++)
			{

				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/v1/");
				
				//username
				driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentrow).getCell(0).toString());
				
				//pwd
				driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentrow).getCell(1).toString());
				
				
				
				driver.findElement(By.id("login-button")).click();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//				for (int currentcell = 0; currentcell < ttlcells; currentcell++)
				//				{
				//					System.out.print(ExcelWSheet.getRow(currentrow).getCell(currentcell).toString());
				//					System.out.print("\t");
				//				}
				//				System.out.println();
				driver.close();
			}

		} catch (FileNotFoundException e) {
			// Catch specific error if the file is not found
			System.err.println("Error: Excel file not found at " + excelfile.getAbsolutePath());
			e.printStackTrace();
		} catch (IOException e) {
			// Catch general I/O errors that can occur with XSSFWorkbook or other stream issues
			System.err.println("Error processing Excel file: " + e.getMessage());
			e.printStackTrace();

		} finally {
			// Ensure the workbook is closed even if other exceptions occurred.
			// inputstream is handled by try-with-resources, so no need to close it here.
			if (ExcelWBook != null) { // Null check for ExcelWBook to prevent NPE if it wasn't initialized
				try {
					ExcelWBook.close();
					System.out.println("\nExcel workbook closed successfully.");
				} catch (IOException e) { // Catch IOException for close() method
					System.err.println("Error closing Excel workbook: " + e.getMessage());
					e.printStackTrace();
				}
			}
		}



	}
}