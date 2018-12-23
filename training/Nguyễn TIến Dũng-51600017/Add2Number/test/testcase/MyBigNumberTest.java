/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcase;

import addnumber.ExNumberFormatException;
import addnumber.IReceiver;
import addnumber.MyBigNumber;
import static jdk.nashorn.internal.objects.NativeString.substring;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import static org.junit.internal.matchers.StringContains.containsString;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Admin
 */
public class MyBigNumberTest implements IReceiver {

    public static int i = 1;

    public MyBigNumberTest() {
    }
    
    @Rule
    public ExpectedException expected = ExpectedException.none();
    
    /**
     * Test of sum method, of class MyBigNumber.
     */
    
    @Test
    public void testSum_N1() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("123", "978");
        assertEquals("1101", result);
    }

    @Test
    public void testSum_N2() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("13", "978");
        assertEquals("991", result);
    }

    @Test
    public void testSum_N3() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("1234", "78");
        assertEquals("1312", result);
    }

    @Test
    public void testSum_N4() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("0", "0");
        assertEquals("0", result);
    }

    @Test
    public void testSum_N5()  {
        expected.expect(ExNumberFormatException.class);
        expected.expectMessage("1");
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("-12", "978");
    }
    
   @Test
    public void testSum_N6() {
        expected.expect(ExNumberFormatException.class);
        expected.expectMessage("3");
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("12-", "978");
    }

    @Test
    public void testSum_N7() {
        expected.expect(ExNumberFormatException.class);
        expected.expectMessage("1");
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("abc", "978");
    }

    @Test
    public void testSum_N8() {
        expected.expect(ExNumberFormatException.class);
        expected.expectMessage("1");
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("abc+1", "978");
    }

    @Test
    public void testSum_N9() {
        expected.expect(ExNumberFormatException.class);
        expected.expectMessage("1");
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("+*&**)(^&*", "*&*()&&*&");
    }

    @Test
    public void testSum_N10() {
        expected.expect(ExNumberFormatException.class);
        expected.expectMessage("4");
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("123.456", "124");
    }
        
    @Override
    public void send(String msg) {
        System.out.println("Case" + i + ":");
        i++;
    }

}
