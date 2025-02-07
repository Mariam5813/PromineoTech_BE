package week5Assignment;
/*
 * The log method on the AsteriskLogger prints out the String 
 * it receives between 3 asterisks on either side of the String 
 
 The error method on prints the String it receives inside a box of asterisks,
 with the String preceded by the word “ERROR:”.
 
 */
public class AsteriskLogger implements Logger{
	
	@Override
	public void log(String log) {
		
		System.out.println("***"+log+"***");
		
	}

	@Override
	public void error(String error) {
		
		System.out.println("*******************");
		System.out.println("***"+"Error: "+error+"***");
		System.out.println("*******************");
		
	}

}
