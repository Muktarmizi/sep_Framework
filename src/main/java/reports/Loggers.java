package reports;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

// Loggers, we give the name of the class
public class Loggers {
	// Logger class from Java library
	// Why below line is static?
	// this is used inside static method, non static variable cannot be called inside static method
	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	// Why this below method is static?
	// Then the class can call directly
	public static void logTheTest(String msg) {
		logger.log(Level.INFO, msg); // INFO messages will be written to the console or its equivalent
		Reporter.log(msg + "<br>"); // to provide log message in the testNG report [as index.html]
		TestManager.getTest().log(Status.INFO, msg);  // for extent report as extent_report.html
	}
	
}
