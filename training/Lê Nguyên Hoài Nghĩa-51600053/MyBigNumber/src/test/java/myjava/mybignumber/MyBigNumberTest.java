package myjava.mybignumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBigNumberTest {

	@Test
	void testSum_N_1() {
		MyBigNumber myClass = new MyBigNumber();
		String sum = myClass.sum("1","2");
		assertEquals("3",sum);
		sum = myClass.sum("8","9");
		assertEquals("17",sum);

	}
	
	@Test
	void testSum_N_2() {
		MyBigNumber myClass = new MyBigNumber();
		String sum = myClass.sum("123","9");
		assertEquals("132",sum);


	}

}
