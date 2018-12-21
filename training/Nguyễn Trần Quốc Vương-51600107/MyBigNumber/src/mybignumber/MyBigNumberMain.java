package mybignumber;
import mybignumber.MyBigNumber;

/**
 * Tác giả:  Nguyễn Trần Quốc Vương.
 * DesCription.
 * Class MyBigNumberMain là lớp để Cộng 2 số lớn bằng 2 chuỗi.
 * Gọi hàm sum để thực hiện.
 */
public class MyBigNumberMain implements IReceiver {
    
    public static void main(String[] args) {

        MyBigNumberMain main = new MyBigNumberMain();
        MyBigNumber s = new MyBigNumber(main);
        String result = s.sum("2A3","12233");
        System.out.print("Final Result: " + result + "\n");
    }
    

    @Override
    public void send(String msg) {
        System.out.println(msg); 
    }
    
}
