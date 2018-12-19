package mybignumber;

import static junit.framework.Assert.assertEquals;
import mybignumber.MyBigNumber;
import org.junit.Test;

/**
 * Tác giả:  Nguyễn Tiến Dũng.
 * DesCription.
 * IReceiver là interface cho phép in từng bước cộng 2 số
 * Hàm send cho hàm cho phép ta in ra chuỗi
 */
public class MyBigNumberTest implements IReceiver {

    /** 
     * Để thực hiện phép cộng 2 số, ta gọi là class MyBigNumber và gọi lại hàm sum
     * Trong hàm sum truyền vào 2 chuỗi
     * Trong đó : 2 chuỗi chỉ được chứa các kí tự số từ '0' đến '9'.
     * <br/>
     */
    
    @Test
    
    public void testSum_N_1() {
        MyBigNumber myClass = new MyBigNumber(this);

        String sum = myClass.sum("5", "9");

        assertEquals("14", sum);
    }
    
    @Test
    
    public void testSum_N_2() {
    	MyBigNumber myClass = new MyBigNumber(this);

        String sum = myClass.sum("123", "331");

        assertEquals("454", sum);
    }
    
    @Test
    
    public void testSum_N_3() {
    	MyBigNumber myClass = new MyBigNumber(this);

        String sum = myClass.sum("123A", "9");

        assertEquals("132", sum);
    }
    
    
    
    
    
    public void send(final String msg) {
        //TODO Auto-generated method stub
    }
}

