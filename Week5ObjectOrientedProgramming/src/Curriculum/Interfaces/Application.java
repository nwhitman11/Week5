package Curriculum.Interfaces;

import java.io.IOException;

public class Application {

		static Logger Logger;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// create an instance of console logger
	
	Logger logger = new FileLogger();
	
	logger.info("Hello");
	logger.warning("This is a warning");
	logger.error("This is an error");
	logger.fatal("Fatal error");
	logger.close();
	setLogger(new FileLogger());
	setLogger(new ConsoleLogger());
	}
	private static void setLogger(Logger logger) {
		logger = logger;
	}
}
