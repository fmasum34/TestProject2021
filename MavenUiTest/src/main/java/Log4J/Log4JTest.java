package Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JTest {
	
	
	static Logger logger = LogManager.getLogger(Log4JTest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n HELLO WORLD \n");
		
		
		
		logger.info("This is the log4j information message");
		
		// need to change trace if you want to see the trace message (logger.file.level = debug)debug to change to trace
		logger.trace("This is trace message");
		logger.error("This is log4j error messages");
		
		logger.warn("This is logger warn message");
		
		logger.fatal("this is logger fatal message");
		
		System.out.println("Complited");
		
		
	}

}
