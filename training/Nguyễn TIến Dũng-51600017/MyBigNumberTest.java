
public class MyBigNumberTest{
	/**
	 *
	 * @author Nguyen Tien Dung
	 */
	public static void main(String[] args){
		testSum_N1();
		testSum_N2();
		testSum_N3();
		testSum_N4();
	}
	
	public static void testSum_N1() {
        MyBigNumber mybignumber = new MyBigNumber();
        String sum = mybignumber.sum("1", "2");

        if(sum.equals("3")){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
	
	public static void testSum_N2() {
        MyBigNumber mybignumber = new MyBigNumber();
        String sum = mybignumber.sum("1234", "987");

        if(sum.equals("2221")){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
	
	public static void testSum_N3() {
        MyBigNumber mybignumber = new MyBigNumber();
        String sum = mybignumber.sum("1123", "12");

        if(sum.equals("1135")){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
	
	public static void testSum_N4() {
        MyBigNumber mybignumber = new MyBigNumber();
        String sum = mybignumber.sum("11", "1123");

        if(sum.equals("1134")){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}
