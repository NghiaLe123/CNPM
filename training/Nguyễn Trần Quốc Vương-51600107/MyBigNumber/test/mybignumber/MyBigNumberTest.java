package mybignumber;

import static junit.framework.Assert.assertEquals;
import mybignumber.MyBigNumber;
import org.junit.Test;
import myjava.mybignumber.ExNumberFormatException;

/**
 * Tác giả:  NGUYỄN TRẦN QUỐC VƯƠNG.
 * DesCription.
 * MyBigNumberTest là class cho phép test các trường hợp của cộng 2 số
 * in ra các lỗi và kết quá
 */
public class MyBigNumberTest implements IReceiver {

    /** 
     * Để thực hiện phép cộng 2 số, ta gọi là class MyBigNumber và gọi lại hàm sum
     * Trong hàm sum truyền vào 2 chuỗi
     * Trong đó : 2 chuỗi chỉ được chứa các kí tự số từ '0' đến '9'.
     * <br/>
     */
    public static int i = 1;
    @Test
    
    public void testSum_N_1() {
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("121", "78");
        assertEquals("199", result);
    }
    
    @Test
    
    public void testSum_N_2() { // Trường hợp cộng 2 số có nhiều chữ số
    	MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("100", "200");
        assertEquals("300", result);
    }
    
    @Test
    
    public void testSum_N_3() { // Trường hợp chứa chữ
    	try {
            MyBigNumberTest myclass = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(myclass);
            String sum = mybignumber.sum("343d", "987");
	}catch(ExNumberFormatException ex) {
	    assertEquals("Vi tri : 4 chua ki tu dac biet hoac chu", ex.getErrorPos());
	}
    }
    
    @Test
    
    public void testSum_N_4() { // Trường hợp chứa số âm
    	try {
            MyBigNumberTest myclass = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(myclass);
            String sum = mybignumber.sum("-829", "213");
	}catch(ExNumberFormatException ex) {
	    assertEquals("Vi tri : 1 chua ki tu am", ex.getErrorPos());
	}
    }
    
    @Test
    
    public void testSum_N_5() { // Trường hợp chứa kí tự đặc biêt
    	try {
            MyBigNumberTest myclass = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(myclass);
            String sum = mybignumber.sum("27*", "213");
	}catch(ExNumberFormatException ex) {
	    assertEquals("Vi tri : 3 chua ki tu dac biet hoac chu", ex.getErrorPos());
	}
    }
    @Test
    
    public void testSum_N_6() { // Trường hợp chứa dấu
    	try {
            MyBigNumberTest myclass = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(myclass);
            String sum = mybignumber.sum("123.323", "213");
	}catch(ExNumberFormatException ex) {
	    assertEquals("Vi tri : 4 chua ki tu dac biet hoac chu", ex.getErrorPos());
	}
    }
    

    
    @Test
    
    public void testSum_N_7() { // Test trường hợp s1 không nhập gì
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("", "78");
        assertEquals("78", result);
    }
    
    @Test
    
    public void testSum_N_8() { // Test trường hợp kết quả kì vọng sai
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("56", "");
        assertEquals("56", result);
    }
    
    @Test
    
    public void testSum_N_9() { // Test trường hợp 2 chuỗi empty
        MyBigNumberTest test = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(test);
        String result = mybignumber.sum("", "");
        assertEquals("", result);
    }
    
    public void send(final String msg) {
        System.out.println("case " + i + ":" + msg);
        i++;
    }
}

