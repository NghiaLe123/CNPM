package myjava.mybignumber;

import org.junit.Test;

public class MyBigNumberTest implements IReceiver {

    @Test
    public void testSum_N_1() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_1 : " + myClass.sum("2","7"));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }
    
    @Test
    public void testSum_N_2() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_2 : " + myClass.sum("2","-2"));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }
    
    @Test 
    public void testSum_N_3() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("12","9"));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }

    @Test 
    public void testSum_N_4() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_4: " + myClass.sum("-12","123"));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }    
    
    
    @Test 
    public void testSum_N_5() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_5: " + myClass.sum("12a","123"));
    	}
    	
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }
    
    
    @Test 
    public void testSum_N_6() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_6: " + myClass.sum("123","abc"));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }
    
    @Test 
    public void testSum_N_7() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_7: " + myClass.sum("13a","123a"));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }
    
    
    @Test 
    public void testSum_N_8() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_8: " + myClass.sum("56-","-123"));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }
    
    @Test 
    public void testSum_N_9() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_9: " + myClass.sum("abc+1","13"));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }
    
    @Test 
    public void testSum_N_10() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_12: " + myClass.sum("$@@","@(@*$"));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }
    
    @Test 
    public void testSum_N_11() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_11: " + myClass.sum("122.23","123.46"));
    	}
    	
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    }
    
    @Test 
    public void testSum_N_12() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_12: " + myClass.sum("","123"));
    	}
    	
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    } 

    @Test 
    public void testSum_N_13() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_13: " + myClass.sum("188","11"));
    	}
    	
    	catch (NumberFormatException ex) {
    		System.out.println("Lỗi: " + ex.getMessage());
    	}
    } 
    
    @Override
    
    public void send(final String msg) {
       
        System.out.println(msg);
    }
}

