package mybignumber;

/**
 * Tác giả:  Nguyễn Tiến Dũng.
 * DesCription.
 * IReceiver là interface cho phép in từng bước cộng 2 số
 * Hàm send cho hàm cho phép ta in ra chuỗi
 */
public class MyBigNumberTest implements IReceiver {

    public static void main(String[] args) {
        MyBigNumberTest app = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(app);
        String sum = mybignumber.sum("1213", "978");
        
        System.out.println("Final step: " + sum);
    }

    public void send(String msg) {
		//TODO Auto-generated method stub
        System.out.println(msg);
    }
}

