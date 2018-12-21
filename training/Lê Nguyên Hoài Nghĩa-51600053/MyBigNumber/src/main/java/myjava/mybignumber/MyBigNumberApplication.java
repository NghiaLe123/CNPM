package myjava.mybignumber;

import java.util.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBigNumberApplication implements IReceiver {

	public static void main(String[] args) {
		//SpringApplication.run(MyBigNumberApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		MyBigNumberApplication app = new MyBigNumberApplication();
		MyBigNumber s = new MyBigNumber(app);
		try {
			
		String s1 = args[0];
		
		String s2 = args[1];
		
		String result = s.sum(s1, s2);
		System.out.println("Kết quả là: " + result);
		
		}
		
		catch (NumberFormatException ex){
			System.out.println(ex.getMessage());
		}
		
		sc.close();
		
	}
	
	public void send (String msg) {
		
		System.out.println(msg);
	}

}

