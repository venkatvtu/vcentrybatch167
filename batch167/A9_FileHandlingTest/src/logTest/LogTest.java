package logTest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LogTest {
	public static Logger log = LoggerFactory.getLogger(LogTest.class);
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("C:\\vcentry\\batch167\\A9_FileHandlingTest\\src\\logTest\\log4j.properties");
		log.info("info2");
		log.error("error2");
		
		
		
		
	}

}
