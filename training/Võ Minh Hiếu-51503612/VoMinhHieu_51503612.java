import java.util.ArrayList;

public class MyBigNumber implements stringSum{
	
	//Method of Sum of 2 numbers
	public static String sum(String s1, String s2){
		String result= "";
		int str1 = s1.length();	// Lay do dai 2 chuoi
		int str2 = s2.length();	
		int max = str1;	
		
		// so sanh do dai 2 chuoi de tiep tuc chay vong lap
		
		if(str1 < str2){
			max = str2;
		}else{
			max = str1;
		}
		
		int flag = 0;	                              // biến lưu gia tri du
		for(int i=0; i<max ; i++){
			int num1 = str1 - i - 1;	              // gia tri cuoi cung cua chuoi 1
			int num2 = str2 - i - 1;	              // gia tri cuoi cung cua chuoi 2
			
			char dig_1 = '0';                         // bien luu ki tu khi xuat ket qua ra
			char dig_2 = '0';	
			
			
			if(num1 >= 0){
				dig_1 = s1.charAt(num1);	          // cho phep lay ki tu vi tri num1 ra
			}
			
			if(num2 >= 0){
				dig_2 = s2.charAt(num2);	          // cho phep lay ki tu vi tri num2 ra
			}
			
			
			int temp1 = dig_1 - '0';	              // tao bien de luu ket qua dig_1
			int temp2 = dig_2 - '0';	              // tao bien de luu ket qua dig_2
			int sumAll = temp1 + temp2 + flag;        // bien tinh Tong gia tri
			
			if(num1 >= 0){
				result = result + (sumAll % 10);
			}else{
				result = result + sumAll;
			}
			flag = sumAll/10 ;                         // cong so du
		}
		return result;
		
		
	}
}