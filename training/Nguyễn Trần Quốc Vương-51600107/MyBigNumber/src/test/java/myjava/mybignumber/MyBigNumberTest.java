package myjava.mybignumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBigNumberTest {

	@Test
	void testSum_N_1() {
		MyBigNumber myClass = new MyBigNumber();

		 String sum = myClass.sum("5", "7");

		 assertEquals("12", sum);
		 
		 sum = myClass.sum("8", "9");

		 assertEquals("17", sum);
	}
	@Test
	 void testSum_N_2() {
		MyBigNumber myClass = new MyBigNumber();

		String sum = myClass.sum("153", "9");

		assertEquals("162", sum);
	 }
	

}
