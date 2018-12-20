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
		System.out.print("Chương trình cộng 2 số \n");
		try {
		System.out.print("Nhập số s1: ");
		String s1 = sc.nextLine();
		
		System.out.print("Nhập số s2: ");
		String s2 = sc.nextLine();
		
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

