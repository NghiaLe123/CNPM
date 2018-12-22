/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcase;

import addnumber.ExNumberFormatException;
import addnumber.IReceiver;
import addnumber.MyBigNumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MyBigNumberTest implements IReceiver{
    
    public MyBigNumberTest() {
    }
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test
    public void testSum_N1() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("123", "978");
            assertEquals("1101", result);
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N2() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("13", "978");
            assertEquals("991", result);
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N3() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("1234", "78");
            assertEquals("1312", result);
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N4() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("null","0");
            assertEquals("0", result);
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N5() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("12-", "978");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N6() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("-12", "978");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N7() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("abc", "978");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N8() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("abc+1", "978");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N9() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("+*&**)(^&*", "*&*()&&*&");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Test
    public void testSum_N10() {
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String result = mybignumber.sum("123.456", "124");
        }catch(ExNumberFormatException ex){
            System.out.printf("Vị trí của lỗi : ", ex);
        }
    }
    
    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
    
}
