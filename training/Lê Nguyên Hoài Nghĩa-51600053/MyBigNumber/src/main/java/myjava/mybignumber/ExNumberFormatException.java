package myjava.mybignumber;

public class ExNumberFormatException extends NumberFormatException {

	private int ErrPos;
	
	public ExNumberFormatException (int num) {
		
		super(num+"");	
		this.ErrPos = num;
	}
	
	@Override
	public String toString() {
		
		return ErrPos + "";
	}
}
