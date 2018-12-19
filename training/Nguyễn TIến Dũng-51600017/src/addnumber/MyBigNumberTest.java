package addnumber;

import addnumber.MyBigNumber;

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
    public static void main(final String[] args) {
        TestcaseN_1();
        TestcaseN_2();
        TestcaseN_3();
        TestcaseN_4();
        TestcaseN_5();
        TestcaseN_6();
    }
    
    //Trường hợp cộng 2 số có 3 chữ số
    public static void TestcaseN_1(){
        MyBigNumberTest app = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(app);
        String sum = mybignumber.sum("121", "978");
    }

    //Trường hợp cộng 2 chữ số cho 3 chữ số
    public static void TestcaseN_2(){
        MyBigNumberTest app = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(app);
        String sum = mybignumber.sum("12", "978");;
    }
    
    //Trường hợp cộng 3 chữ số cho 2 chữ số
    public static void TestcaseN_3(){
        MyBigNumberTest app = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(app);
        String sum = mybignumber.sum("123", "78");
    }
    
    //Trường hợp có chứa chữ
    public static void TestcaseN_4(){
        MyBigNumberTest app = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(app);
        String sum = mybignumber.sum("12A", "978");
    }
    
    //Trường hợp có chứa kí tự đặc biệt
    public static void TestcaseN_5(){
        MyBigNumberTest app = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(app);
        String sum = mybignumber.sum("12=", "978");
    }
    
    //Trường hợp có chứa số âm
    public static void TestcaseN_6(){
        MyBigNumberTest app = new MyBigNumberTest();
        MyBigNumber mybignumber = new MyBigNumber(app);
        String sum = mybignumber.sum("-167", "978");
    }
    
    
    public void send(final String msg) {
        //TODO Auto-generated method stub
        System.out.println("case :" + msg);
    }
}

