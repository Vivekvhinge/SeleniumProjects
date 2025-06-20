package Session52_PropertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

////do the changes to in properties file to allocate the readconigfile.java path by creating objection and allocation in the driver.get

public class ReadConfigFile {

	//create Properties files object
	Properties Properties;
	//created string path 
	String path="C:\\Users\\Admin\\eclipse-workspace\\Demo2\\src\\test\\java\\Session52_PropertiesFiles\\Config.Properties";

	public ReadConfigFile() {

		//initizle properties file object 
		Properties =new Properties();
		//created fileinputstream obj to load the the string path
		try {
			FileInputStream fis=new FileInputStream(path); //given the path in inputpathstream file
			try {
				Properties.load(fis); //now load the properties with "fis" in which the path is stored
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//now created 3 methods to read the hardcoded values from "config.properties" file
	//1st method to return the string value from confog.properties file
	public String geturl() { //get method is used

		//given string url to get the property of the configfiles's url [to get the mentioned url from the file ]
		String url=Properties.getProperty("url");
		if (url != null) //given if condition to check the url is not null
			return url; //if not null the return the url
		else
			//if null then in else condition used runtimeexception to display the error msg
			throw new RuntimeException("URL not specifiesd in the config.properties file"); 
	}


	//Created 2nd method for username to return the string from config file
	public  String getusername() { //get method is used 

		//given string username to get the property of the configfiles's username [to get the mentioned username from the file ]
		String username=Properties.getProperty("username");

		if(username!=null) //given if condition to check the username is not null
			return username;  //if not null the return the username
		else
			//if null then in else condition used runtimeexception to display the error msg
			throw new RuntimeException("username not specifiesd in the config.properties file");

	}

	//Created 3rd method for password to return the string from config file
	public  String getpassword() { //get method is used 

		//given string password to get the property of the configfiles's password [to get the mentioned password from the file ]
		String password=Properties.getProperty("password");

		if(password!=null) //given if condition to check the password is not null
			return password;  //if not null the return the password
		else
			//if null then in else condition used runtimeexception to display the error msg
			throw new RuntimeException("password not specifiesd in the config.properties file");

	}

}
