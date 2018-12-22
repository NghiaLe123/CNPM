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
    
    @Test
    public void testSum_N_2() {
        
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("2","-2");
    	}
    	catch (NumberFormatException ex) {
    		 assertEquals("1", ex.getMessage());
    	}

    }
    
    @Test 
    public void testSum_N_3() {
    	
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("12","9");
        assertEquals("21", sum);      
    }

    @Test
    public void testSum_N_4() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("-12","123");
    	}
    	
    	catch (NumberFormatException ex) {
   		    assertEquals("1", ex.getMessage());
    	}
    	
    }    
    
    
    @Test 
    public void testSum_N_5() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("12a","123");
    	}
    	catch (NumberFormatException ex) {
    		 assertEquals("3", ex.getMessage());
    	}
    }
    
    
    @Test(expected = NumberFormatException.class)
    public void testSum_N_6() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("123","abc");
    	}
    	catch (NumberFormatException ex) {
   		    assertEquals("1", ex.getMessage());
   	    }

    }
    
    @Test
    public void testSum_N_7() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("13a","123a");
    	}
    	catch (NumberFormatException ex) {
    		assertEquals("3", ex.getMessage());
    	}
    }
    
    
    @Test
    public void testSum_N_8() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("56-","-123");
    	}
    	catch (NumberFormatException ex) {
   		 	assertEquals("1", ex.getMessage());
    	}

    }
    
    @Test
    public void testSum_N_9() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("abc+1","13");
    	}
    	catch (NumberFormatException ex) {
   		 	assertEquals("1", ex.getMessage());
    	}
  
    }
    
    @Test
    public void testSum_N_10() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("$@@","@(@*$");
    	}
    	
    	catch (NumberFormatException ex) {
   		 	assertEquals("1", ex.getMessage());
    	}
    	
    }
    
    @Test
    public void testSum_N_11() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("122.23","123.46");
    	}
    	catch (NumberFormatException ex) {
   		 	assertEquals("4", ex.getMessage());
    	}
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
        assertEquals("100", sum);      


    }    
    
    @Test 
    public void testSum_N_15() {
    	try {
        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("null","11");
    	}
    	catch (NumberFormatException ex) {
   		 	assertEquals("1", ex.getMessage());
    	}

    }    
    
    @Test 
    public void testSum_N_16() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum(null,"12");
        assertEquals("12", sum);      


    }  
 
    @Test 
    public void testSum_N_17() {

        MyBigNumber myClass = new MyBigNumber(this);
        String sum = myClass.sum("12",null);
        assertEquals("12", sum);      


    }  
    
    @Override
    
    public void send(final String msg) {
       
        System.out.println(msg);
    }
}

