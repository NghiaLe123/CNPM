package myjava.mybignumber;

import org.junit.Test;

public class MyBigNumberTest implements IReceiver {

    @Test
    public void testSum_N_1() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_1 : " + myClass.sum("2","7"));
    }
    
    @Test
    public void testSum_N_2() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_2 : " + myClass.sum("7","2"));
    }
    
    @Test 
    public void testSum_N_3() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("12","9"));
    }

    @Test 
    public void testSum_N_4() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("-12","123"));
    }    
    
    
    @Test 
    public void testSum_N_5() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("12a","123"));
    }
    
    
    @Test 
    public void testSum_N_6() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("abc","123"));
    }
    
    @Test 
    public void testSum_N_7() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("13a","123a"));
    }
    
    
    @Test 
    public void testSum_N_8() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("56-","-123"));
    }
    
    @Test 
    public void testSum_N_9() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("abc+1","13"));
    }
    
    @Test 
    public void testSum_N_10() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("$@@","@(@*$"));
    }
    
    @Test 
    public void testSum_N_11() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3: " + myClass.sum("122.23","123.46"));
    }
    
    
    @Override
    
    public void send(final String msg) {
       
        System.out.println(msg);
    }
}

