import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
/*
 * Checked Exception: Something that we want to explicitly check for in our code.  It is something we don't have control over.
 * 	Like a database that we've lost connection to.  We cannot stop these exceptions becuase it's outside our code's hands
 * 
 * Unchecked Exception: Only thrown because of programmer's mistakes.  
 */
		
		
//		try { // try some code
//			System.out.println("In the try");
//		} catch (Exception e ) { // catch an exception and do something with it
//			System.out.println(e.toString());
//		}
		try {
	FileReader fileReader = new FileReader ("something.txt");
	} catch(FileNotFoundException e) {
		System.out.println(e.toString());
		
	} catch (Exception e){
		
	} finally {
		System.out.println("Finally!");
	}
		System.out.println("after the try catch");
		openFile("AnotherFile.jpg");
	}
	
	public static FileReader openFile(String fileName) throws FileNotFoundException {
		return new FileReader(fileName);
	}
}

