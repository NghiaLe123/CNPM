package mybignumber;

import static junit.framework.Assert.assertEquals;
import mybignumber.MyBigNumber;
import org.junit.Test;

/**
 * Tác giả:  NGUYỄN TRẦN QUỐC VƯƠNG.
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
    
    public void testSum_N_1() { // Trường hợp cộng 2 số có 1 chữ số
        MyBigNumber myClass = new MyBigNumber(this);

        String sum = myClass.sum("5", "9");

        assertEquals("14", sum);
    }
    
    @Test
    
    public void testSum_N_2() { // Trường hợp cộng 2 số có 3 chữ số
    	MyBigNumber myClass = new MyBigNumber(this);

        String sum = myClass.sum("123", "331");

        assertEquals("454", sum);
    }
    
    @Test
    
    public void testSum_N_3() { // Trường hợp chứa chữ
    	MyBigNumber myClass = new MyBigNumber(this);

        String sum = myClass.sum("123A", "9");

        assertEquals("132", sum);
    }
    
    @Test
    
    public void testSum_N_4() { // Trường hợp chứa số âm
    	MyBigNumber myClass = new MyBigNumber(this);

        String sum = myClass.sum("-2", "9");

        assertEquals("7", sum);
    }
    
    @Test
    
    public void testSum_N_5() { // Trường hợp chứa kí tự đặc biêt
    	MyBigNumber myClass = new MyBigNumber(this);

        String sum = myClass.sum("abc+1", "9");

        assertEquals("7", sum);
    }
    @Test
    
    public void testSum_N_6() { // Trường hợp chứa dấu
    	MyBigNumber myClass = new MyBigNumber(this);

        String sum = myClass.sum("123.22", "92");

        assertEquals("7", sum);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void send(final String msg) {
        //TODO Auto-generated method stub
    }
}

