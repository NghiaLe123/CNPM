package test;

import addnumber.IReceiver;
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
    
    public static int i = 1;

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        TestcaseN_1();
        TestcaseN_2();
        TestcaseN_3();
        TestcaseN_4();
        TestcaseN_5();
        TestcaseN_6();
        TestcaseN_7();
        TestcaseN_8();
        TestcaseN_9();
        TestcaseN_10();
        TestcaseN_11();
    }
    //Trường hợp cộng 2 số có 3 chữ số

    /**
     *
     */
        public static void TestcaseN_1(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("123", "978");
            String Result = "1101";
            if(Result.equals(sum)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage());
        }
        
    }

    //Trường hợp cộng 2 chữ số cho 3 chữ số

    /**
     *
     */
        public static void TestcaseN_2(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("13", "978");
            String Result = "991";
            if(Result.equals(sum)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage());
        }
    }
    
    //Trường hợp cộng 3 chữ số cho 2 chữ số

    /**
     *
     */
        public static void TestcaseN_3(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("1234", "78");
            String Result = "1312";
            if(Result.equals(sum)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }catch(NumberFormatException ex){
            System.out.println("Vị trí :" + ex.getMessage());
        }
    }
    
    //Trường hợp có chứa chữ

    /**
     *
     */
        public static void TestcaseN_4(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("", "0");
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage() + "\n");
        }
    }
    
    //Trường hợp có chứa kí tự đặc biệt

    /**
     *
     */
        public static void TestcaseN_5(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("12-", "978");
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage() + "\n");
        }
    }
    
    //Trường hợp có chứa số âm

    /**
     *
     */
        public static void TestcaseN_6(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("-12", "978");
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage() + "\n");
        }
    }
    
    //Trường hợp s1 la chu

    /**
     *
     */
        public static void TestcaseN_7(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("abc", "978");
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage() + "\n");
        }
    }
    
    //Trường hợp có kí tự đặc biệt

    /**
     *
     */
        public static void TestcaseN_8(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("abc+1", "978");
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage() + "\n");
        }
    }
    
    /**
     *
     */
    public static void TestcaseN_9(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("+*&**)(^&*", "*&*()&&*&");
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage() + "\n");
        }
    }
    
    //Chua dau .

    /**
     *
     */
        public static void TestcaseN_10(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("123.456", "124");
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage() + "\n");
        }
    }
    
     //Chua dau ,

    /**
     *
     */
        public static void TestcaseN_11(){
        try{
            MyBigNumberTest test = new MyBigNumberTest();
            MyBigNumber mybignumber = new MyBigNumber(test);
            String sum = mybignumber.sum("123456", "12,4");
        }catch(NumberFormatException ex){
            System.out.println("Vị trí : " + ex.getMessage() + "\n");
        }
    }
    
    @Override
    public void send(final String msg) {
        //TODO Auto-generated method stub
        System.out.println("case " + i + ":" + msg);
        i++;
    }
}
