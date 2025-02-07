package week5Assignment;
/*
 * In this class that has a main method we instantiate an instance of each of
 * of the logger classes that implement the Logger interface.
 * We can instantiate logger using new() method or using the method that takes a type 
 * of the interface and pass the class that implements interface into it. 

b. Test both methods on both instances
 */

public class App {

	static Logger Logger;
	
	public static void main(String[] args) {
		
        Logger logger = new AsteriskLogger();
        logger.log("HelloAgain");
        logger.error("Hello Sam");
        
        setLogger(new SpacedLogger());
        Logger.log("Something new");
        Logger.error("This is a old string");
         
	}

	private static void setLogger(Logger l) {
		Logger=l;
	}
	
}
