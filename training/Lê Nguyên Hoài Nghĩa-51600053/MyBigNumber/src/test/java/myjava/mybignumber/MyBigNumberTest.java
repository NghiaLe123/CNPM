package myjava.mybignumber;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MyBigNumberTest implements IReceiver {

	public MyBigNumberTest() {
	}
	
	@Rule
	public ExpectedException expected = ExpectedException.none();
	
    @Test
    public void testSum_N_1() {
    	
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum =  myClass.sum("2","7");
        assertEquals("9", sum);
    }
    
    @Test
    public void testSum_N_2() {
    	
    	expected.expect(ExNumberFormatException.class);
    	expected.expectMessage("1");
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("2","-2");


    }
    
    @Test 
    public void testSum_N_3() {
    	
  
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("12","9");
        assertEquals("21", sum);      
    }

    @Test
    public void testSum_N_4() {
    	
    	expected.expect(ExNumberFormatException.class);
    	expected.expectMessage("1");
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("-12","123");


    	
    }    
    
    
    @Test 
    public void testSum_N_5() {
    	
    	expected.expect(ExNumberFormatException.class);
    	expected.expectMessage("3");
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("12a","123");
    	
    }
    
    
    @Test
    public void testSum_N_6() {
    	
    	expected.expect(ExNumberFormatException.class);
    	expected.expectMessage("1");
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("123","abc");
    	

    }
    
    @Test
    public void testSum_N_7() {
    	
    	expected.expect(ExNumberFormatException.class);
    	expected.expectMessage("3");
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("13a","123a");

    }
    
    
    @Test
    public void testSum_N_8() {
    	
    	expected.expect(ExNumberFormatException.class);
    	expected.expectMessage("1");
    	MyBigNumberTest test = new MyBigNumberTest();
    	MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("56-","-123");


    }
    
    @Test
    public void testSum_N_9() {
    	
    	expected.expect(ExNumberFormatException.class);
    	expected.expectMessage("1");
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("abc+1","13");
  
    }
    
    @Test
    public void testSum_N_10() {

    	expected.expect(ExNumberFormatException.class);
    	expected.expectMessage("1");
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("$@@","@(@*$");

    	
    }
    
    @Test
    public void testSum_N_11() {
    	expected.expect(ExNumberFormatException.class);
    	expected.expectMessage("4");
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("122.23","123.46");

    }
    
    @Test 
    public void testSum_N_12() {
    	
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("","123");
        assertEquals("123", sum);      


    } 

    @Test 
    public void testSum_N_13() {
    	
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("188","11");
        assertEquals("199", sum);      

    } 
    
    @Test 
    public void testSum_N_14() {

    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("88","12");
        assertEquals("100", sum);      


    }    
    
    @Test 
    public void testSum_N_15() {
    	
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("null","11");
        assertEquals("11", sum);      


    }    
    
    @Test 
    public void testSum_N_16() {

    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("null","12");
        assertEquals("12", sum);      


    }  
 
    @Test 
    public void testSum_N_17() {

    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber myClass = new MyBigNumber(test);
        String sum = myClass.sum("12","null");
        assertEquals("12", sum);      


    }  
    
    @Override
    
    public void send(final String msg) {
       
        System.out.println(msg);
    }
}

