package utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class Logging {
	Logger log;

	public Logging(String className) {
		super();
		this.log = Logger.getLogger(className);
	}

	public void info(String message) {
		if (log.isLoggable(Level.INFO)) {
			log.log(Level.INFO, message);
		}
	}

	public void warn(String message) {
		if (log.isLoggable(Level.WARNING)) {
			log.log(Level.WARNING, message);
		}
	}

	public void error(String message) {
		if (log.isLoggable(Level.SEVERE)) {
			log.log(Level.SEVERE, message);
		}
	}

	public void print(String message) {
		 System.out.println(message);
	}

}
