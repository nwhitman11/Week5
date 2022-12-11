package Week5Assignment;

public class App {
	public static void main(String[] args) {
		AsteriskLogger aLog = new AsteriskLogger();
		aLog.log("Hello");
		aLog.error("Bye");
		
		SpacedLogger sLog = new SpacedLogger();
		sLog.log("Homework");
		sLog.error("Study Group");
	}
	
}
