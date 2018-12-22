package addnumber;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ExNumberFormatException extends NumberFormatException{
    
    private int errorPos;
    
    public ExNumberFormatException(int num) {
        errorPos = num;
    }
    
    @Override
    public String toString() {
        return errorPos + "";
    }
}
