package myjava.mybignumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MyBigNumberTest implements IReceiver {

    @Test
    public void testSum_N_1() {
    	
        MyBigNumber myClass = new MyBigNumber(this);
        String sum =  myClass.sum("2","7");
        assertEquals("9", sum);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testSum_N_2() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("2","-2");

    }
    
    @Test 
    public void testSum_N_3() {
    	
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("12","9");
        assertEquals("21", sum);      
    }

    @Test(expected = NumberFormatException.class) 
    public void testSum_N_4() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("-12","123");
    	
    }    
    
    
    @Test(expected = NumberFormatException.class) 
    public void testSum_N_5() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("12a","123");

    }
    
    
    @Test(expected = NumberFormatException.class)
    public void testSum_N_6() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("123","abc");

    }
    
    @Test(expected = NumberFormatException.class) 
    public void testSum_N_7() {
    	
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("13a","123a");

    }
    
    
    @Test(expected = NumberFormatException.class) 
    public void testSum_N_8() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("56-","-123");
  

    }
    
    @Test(expected = NumberFormatException.class) 
    public void testSum_N_9() {
    
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("abc+1","13");
  
    }
    
    @Test(expected = NumberFormatException.class) 
    public void testSum_N_10() {
    
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("$@@","@(@*$");
    	
    }
    
    @Test(expected = NumberFormatException.class) 
    public void testSum_N_11() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("122.23","123.46");

    }
    
    @Test 
    public void testSum_N_12() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("","123");
        assertEquals("123", sum);      


    } 

    @Test 
    public void testSum_N_13() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("188","11");
        assertEquals("199", sum);      

    } 
    
    @Test 
    public void testSum_N_14() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("88","12");
        assertEquals("29", sum);      


    }    
    
    @Test(expected = NumberFormatException.class)    
    public void testSum_N_15() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("null","11");


    }    
    
    @Override
    
    public void send(final String msg) {
       
        System.out.println(msg);
    }
}

