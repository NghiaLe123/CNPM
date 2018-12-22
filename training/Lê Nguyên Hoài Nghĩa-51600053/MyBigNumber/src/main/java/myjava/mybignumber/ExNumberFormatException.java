package myjava.mybignumber;

public class ExNumberFormatException extends NumberFormatException {
    
	private int errorPos;
	
	public ExNumberFormatException (int msg) {
		
		errorPos = msg;
	
	}
	
	public String getErrorPos() {
	
	    return errorPos + "";
	}
}
