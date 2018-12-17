package myjava.mybignumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBigNumberApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyBigNumberApplication.class, args);
		
		MyBigNumberApplication pm = new BigNumberApplication();
		MyBigNumber io = new MyBigNumber(pm);
		
		String sum = io.sum(args[0], args[1]);
		
		System.out.println("Kết quả: " + sum);
		
	}
	
	public void send(String msg) {
		
		System.out.println(msg);
	}

}

