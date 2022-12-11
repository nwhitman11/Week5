package Curriculum.Interfaces;

import java.io.IOException;

public interface Logger { //interface doesn't define any method implementations
	// use an interface when you know what the class will do but wnat to leave implementation up to the class
	// u know what will happen, but not how
	// an interface is a contract: when a class implements an interface, it has to follow it.

	// we have to define the methods that it should have but not the bodies.
	
	public void info(String info); // no brackets, just a ';'
	public void warning(String warning);
	public void error(String error);
	public void fatal (String fatal);
	public void close() throws IOException;
	
	// they'll take these methods, implement them and different levels of logging.
}
