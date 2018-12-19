package myjava.mybignumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

    /**
     * Author: Nguyễn Văn Hải
     * */

public class MyBigNumberTest implements IReceiver {

	@Test
	void testSum_N11() { //Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là nhỏ
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "987");
	}
	
	@Test
	void testSum_N12() { //Trường hợp cộng 2 số có độ dài chuỗi số là bằng nhau nhưng số là lớn
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("1232424234", "987242342432");
	}
	
	@Test
	void testSum_N21() { //Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là nhỏ
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("12", "987");
	}
	
	@Test
	void testSum_N22() { //Trường hợp cộng 2 số có độ dài chuỗi 1 ngắn hơn độ dài chuỗi 2 nhưng số là lớn
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("122342", "983424324234242427");
	}
	
	@Test
	void testSum_N31() { //Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là nhỏ
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "98");
	}
	
	@Test
	void testSum_N32() { //Trường hợp cộng 2 số có độ dài chuỗi 2 ngắn hơn độ dài chuỗi 1 nhưng số là lớn
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("12331313123123213", "9843434334");
	}
	
	@Test
	void testSum_N41() { //Trường hợp có chứa 1 kí tự ở chuỗi 1
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123A", "987");
	}
	
	@Test
	void testSum_N42() { //Trường hợp có chứa 1 kí tự ở chuỗi 2
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "987B");
	}
	
	@Test
	void testSum_N43() { //Trường hợp có chứa nhiều kí tự ở chuỗi 1
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123Adanvbd", "987");
	}
	
	@Test
	void testSum_N44() { //Trường hợp có chứa nhiều kí tự ở chuỗi 2
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "987dbvmcjhd");
	}
	
	@Test
	void testSum_N45() { //Trường hợp có chứa 1 kí tự ở cả 2 chuỗi
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123A", "c987");
	}
	
	@Test
	void testSum_N46() { //Trường hợp có chứa nhiều kí tự ở cả 2 chuỗi
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("sadasd123A", "sd987sdsdsd");
	}
	
	@Test
	void testSum_N51() { //Trường hợp có chứa 1 kí tự đặc biệt ở chuỗi 1
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123&", "987");
	}
	
	@Test
	void testSum_N52() { //Trường hợp có chứa 1 kí tự đặc biệt ở chuỗi 2
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "#987");
	}
	
	@Test
	void testSum_N53() { //Trường hợp có chứa nhiều kí tự đặc biệt ở chuỗi 1
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("$$$123&", "987");
	}
	
	@Test
	void testSum_N54() { //Trường hợp có chứa nhiều kí tự đặc biệt ở chuỗi 2
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "$%%987#");
	}
	
	@Test
	void testSum_N55() { //Trường hợp có chứa 1 kí tự đặc biệt ở cả 2 chuỗi
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123&", "#987");
	}
	
	@Test
	void testSum_N56() { //Trường hợp có chứa nhiều kí tự đặc biệt ở cả 2 chuỗi
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("**&&123&", "987((&^");
	}
	
	@Test
	void testSum_N61() { //Trường hợp có chứa số âm ở chuỗi 1
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("-123", "987");
	}
	
	@Test
	void testSum_N62() { //Trường hợp có chứa số âm ở chuỗi 2
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("123", "-987");
	}
	
	@Test
	void testSum_N63() { //Trường hợp có chứa số âm ở cả 2 chuỗi
		MyBigNumberTest myclass = new MyBigNumberTest();
		MyBigNumber mybignumber = new MyBigNumber(myclass);
		String sum = mybignumber.sum("-123", "-987");
	}

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("case : " + msg);
	}
}
