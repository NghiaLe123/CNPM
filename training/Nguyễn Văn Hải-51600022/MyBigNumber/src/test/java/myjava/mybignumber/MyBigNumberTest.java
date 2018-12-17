package myjava.mybignumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

    /**
     * Author: Nguyễn Văn Hải
     * */

public class MyBigNumberTest implements IReceiver {

	@Test
	void testSum_N1() { //Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "987");
	}
	
	@Test
	void testSum_N2() { //Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("12", "987");
	}
	
	@Test
	void testSum_N3() { //Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "98");
	}
	
	@Test
	void testSum_N4() { //Trường hợp có chứa kí tự
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123A", "987");
	}
	
	@Test
	void testSum_N5() { //Trường hợp có chứa kí tự đặc biệt
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123&", "987");
	}
	
	@Test
	void testSum_N6() { //Trường hợp có chứa số âm
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("-123", "987");
	}

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("case : " + msg);
	}
}
