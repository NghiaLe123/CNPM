package myjava.mybignumber;

import org.junit.jupiter.api.Test;

/**
 * by Nguyễn Trần Quốc Vương.
 * Giới thiệu.
 * Class MyBigNumberTest là lớp để test hàm sum.
 * Có test nhiều trường hợp
 */

class MyBigNumberTest implements IReceiver {

    @Test
    
    void testSum_N_1() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_1 : " + myClass.sum("2","7"));
    }
    
    @Test
    
    void testSum_N_2() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_2 - Kết quả cuối cùng là :  " + myClass.sum("56","123"));
    }
    
    @Test
    
    void testSum_N_3() {
        MyBigNumber myClass = new MyBigNumber(this);
        System.out.println("TEST_N_3 - Kết quả cuối cùng là : " + myClass.sum("56N","123"));
    }
    
    @Override
    
    public void send(final String msg) {
        // TODO Auto-generated method stub
        System.out.println(msg);
    }
}
