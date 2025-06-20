package Log4j.Log4j;
import org.apache.logging.log4j.*;   //lo4j all package   & Step3

public class Session38_Log4j2_logging_Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1.in pomxml file give log4j plugin like log4j-api and log4j-core
		2.Log4j2.properties file or Log4j2.xml file .Paste these log4j2.properties or log4j2.xml in project home directory.
		
		log4j2.properties file is a log4j configuration file which stores entire runtime configuration used by log4j.
		location:src/main/resource
		Log4j2.xml file
		This is also a configuration file having all runtime configurations used by log4j.
		3.import log4j package
		import org.apache.logging.log4j.*;
		4. Create object of Logger ,logmanger for managing
		Logger log = LogManager.getLogger("ClassName");
		
		
		Logging means some way to indicate the state of the system at runtime. The log messages have to provide the required information to understand what the application does internally during runtime.
		Log4j logging framework which is written in Java. It is an open-source logging API for java.
		
		LOG LEVELS:
		https://logging.apache.org/log4j/2.x/manual/customloglevels.html
		
		 bydefault="file" in log4j2.xml file to print log in console use "STDOUT" in file name below syntax:
		<Loggers>
		<Root level="all">   <---if we change all to another level then it will display that level and above only
			<AppenderRef ref="STDOUT" />
		</Root>
	</Loggers>
		
		*/
		
		
		Logger log=LogManager.getLogger("Session38_Log4j2_logging_Framework"); //step4
		System.out.println("This is logger's demo");
		
		log.info("for info only"); //information
		log.fatal("for fatal only"); //information
		log.debug("for debug only");  //for debugging
		log.error("Error messages");  //for error's
		log.warn("for info only");  //for warning messages
		
		

		
		
		
		
		
		
	}

}
