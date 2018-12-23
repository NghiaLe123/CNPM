package myjava.mybignumber;

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
    
    private String errorPos;
    
    public ExNumberFormatException(String msg) {
        errorPos = msg;
    }
    
    public String getErrorPos() {
    	return errorPos;
    }
}