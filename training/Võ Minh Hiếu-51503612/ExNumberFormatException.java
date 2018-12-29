package addnumber;

/**
 *
 * Author: Võ MInh Hiếu
 */
public class ExNumberFormatException extends NumberFormatException {
    
    private int errorPos;
    
    public ExNumberFormatException(int num) {
        super(num+"");
        this.errorPos = num;
    }
    

    public String toString() {
        return errorPos + " ";
    }
}