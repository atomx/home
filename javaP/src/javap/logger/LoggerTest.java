package javap.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("Test");
		log.log(Level.SEVERE, "log msg");
		log.severe("sever msg");
		System.out.println("out msg");

	}

}
