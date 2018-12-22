package myjava.mybignumber;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBigNumberApplication implements IReceiver {

	public static void main(String[] args) {
		//SpringApplication.run(MyBigNumberApplication.class, args);
		
		MyBigNumberApplication app = new MyBigNumberApplication();
		MyBigNumber s = new MyBigNumber(app);
		try {
			
		String s1 = args[0];
		
		String s2 = args[1];
		
		String result = s.sum(s1, s2);
		System.out.println("Ket qua la: " + result);
		
		}
		
		catch (NumberFormatException ex){
			System.out.println(ex.getMessage());
		}
				
	}
	
	public void send (String msg) {
		
		System.out.println(msg);
	}

}

