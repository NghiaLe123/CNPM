package mybignumber;

import static junit.framework.Assert.assertEquals;
import mybignumber.MyBigNumber;
import org.junit.Test;

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
    
    public void testSum_N_1() { // Trường hợp cộng 2 số có 1 chữ số
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("1", "3");
            assertEquals("4", sum);
        }catch(NumberFormatException ex){
            System.out.println("Vi tri : " + ex.getMessage() + "\n");
        }
    }
    
    @Test
    
    public void testSum_N_2() { // Trường hợp cộng 2 số có nhiều chữ số
    	try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("12221312", "23232");
            assertEquals("12244544", sum);
        }catch(NumberFormatException ex){
            System.out.println("Vi tri : " + ex.getMessage() + "\n");
        }
    }
    
    @Test
    
    public void testSum_N_3() { // Trường hợp chứa chữ
    	try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("12A", "978");
        }catch(NumberFormatException ex){
            System.out.println("Vi tri : " + ex + "\n");
        }
    }
    
    @Test
    
    public void testSum_N_4() { // Trường hợp chứa số âm
    	try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("-122", "978");
        }catch(NumberFormatException ex){
            System.out.println("Vi tri : " + ex + "\n");
        }
    }
    
    @Test
    
    public void testSum_N_5() { // Trường hợp chứa kí tự đặc biêt
    	try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("12=", "978");
        }catch(NumberFormatException ex){
             System.out.println("Vi tri : " + ex + "\n");
        }
    }
    @Test
    
    public void testSum_N_6() { // Trường hợp chứa dấu
    	try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("123.456", "124");
        }catch(NumberFormatException ex){
            System.out.println("Vi tri : " + ex + "\n");
        }
    }
    
    @Test
    
    public void testSum_N_7() { // Test trường hợp kết quả kì vọng sai
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("22", "3");
            assertEquals("21", sum);
        }catch(NumberFormatException ex){
            System.out.println("Vi tri : " + ex.getMessage() + "\n");
        }
    }
    
    
    public void send(final String msg) {
        System.out.println("case " + i + ":" + msg);
        i++;
    }
}

